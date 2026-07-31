package com.boardinghouse;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.utiil.Scanner;

public class BoardingManager {
    
    //Application-wide tracking variables
    private int DogSpaces = 10;
    private int CatSpaces = 10;
    private BigDecimal dogBoardingRate = new BigDecimal("30.00");
    private BigDecimal catBoardingRate = new BigDecimal("20.00");
    private BigDecimal groomingFee = new BigDecimal("25.00");
    private BigDecimal medAdminFee = new BigDecimal("15.00");
    private BigDecimal dailyLateFee = new BigDecimal("50.00");

    //List tracking currently checked-in pets
    private ArrayList<Pet> currentGuests = new ArrayList<>();

    public void checkOutPet() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Pet Name or Space Number to check out: ");
        String searchInput = scanner.nextLine();

        Pet foundPet = null;

        // Find Pet Record
        for (Pet p: currentGuests) {
            //Assumes you add spaceNumber attribute to Pet, or just search by name
            if (p.getPetName().equalsIgnoreCase(searchInput)) {
                foundPet = p;
                break;
            }
        }
        //If record not found
        if (foundPet == null) {
            System.out.println("Error: Pet not found.");
            return;
        }

        BigDecimal finalBill = BigDecimal.ZERO;
        BigDecimal daysStay = new BigDecimal(foundPet.getDaysStay());

        //Fetch add-on service flags fro the Pet object
        boolean groomingPerformed = foundPet.isGroomingPerformed();
        boolean medAdministered = foundPet.isMedAdministered();

        //Calculate late fees dynamically using Java Time API
        BigDecimal totalLateFees = BigDecimal.ZERO;
        LocalDate scheduledCheckout = foundPet.getScheduledCheckoutDate(); 
        LocalDate today = LocalDate.now();

        if (today.isAfter(scheduledCheckout)) {
            long daysLate = ChronoUnit.DAYS.between(scheduledCheckout, today);
            totalLateFees = dailyLateFee.multiply(new BigDecimal(daysLate));
            System.out.println("Late Fees: $" + totalLateFees);
        }

        //If pet is a dog
        if (foundPet.getPetType().equalsIgnoreCase("DOG")) {
            //calculate base stay
            finalBill = daysStay.multiply(dogBoardingRate);

            //Add optional services if performed
            if (groomingPerformed) {
                finalBill = finalBill.add(groomingFee);
            }
            if (medAdministered) {
                finalBill = finalBill.add(medAdminFee);
            }
            finalBill = finalBill.add(totalLateFees);
             

            foundPet.setAmountDue(finalBill);
            System.out.println("Amount Due: $" + foundPet.getAmountDue());

            //Process Payment
            DogSpaces++; // Increment available dog spaces
            currentGuests.remove(foundPet); // Remove pet from current guests
            System.out.println("Dog checkout complete.");

            //If pet is a cat
        } else if (foundPet.getPetType().equalsIgnoreCase("CAT")) {
            //calculate base stay
            finalBill = daysStay.multiply(catBoardingRate);

            //Add optional services if performed and late fees if applicable
            if (groomingPerformed) {
                finalBill = finalBill.add(groomingFee);
            }
            if (medAdministered) {
                finalBill = finalBill.add(medAdminFee);
            }
            finalBill = finalBill.add(totalLateFees);

            foundPet.setAmountDue(finalBill);
            System.out.println("Amount Due: $" + foundPet.getAmountDue());

            //Process Payment
            CatSpaces++; // Increment available cat spaces
            currentGuests.remove(foundPet); // Remove pet from current guests
            System.out.println("Cat checkout complete.");
        }
    }
}



      
    