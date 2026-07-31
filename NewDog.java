package com.boardinghouse;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Dog extends Pet{
			
	//declare attributes only unique to dogs
	private double dogWeight;
	
	
	//constructor 
	public Dog(String petName, int spaceNumber, int petAge, int daysStay, boolean groomingPerformed, boolean medAdministered, BigDecimal amountDue, LocalDate scheduledCheckoutDate, double dogWeight) {
		super("DOG", petName, spaceNumber, petAge, daysStay, groomingPerformed, medAdministered, amountDue, scheduledCheckoutDate);
		
		this.dogWeight = dogWeight;		
	}

	//Accessor 
	public double getDogWeight() {
		return dogWeight;
	}

	//Mutator 
	public void setDogWeight(double dogWeight) {
		this.dogWeight = dogWeight;
	}
	
}//end dog class

