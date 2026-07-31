package com.boardinghouse;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Pet {
	
	//Declare Attributes
	private String petType;
	private String petName;
	private int spaceNumber;
	private int petAge;
	private int daysStay;
	private boolean groomingPerformed;
	private boolean medAdministered;
	private BigDecimal amountDue;
	private LocalDate scheduledCheckoutDate;

	
	//Constructor
	public Pet(String petType, String petName, int spaceNumber, int petAge, int daysStay, boolean groomingPerformed, boolean medAdministered, BigDecimal amountDue, LocalDate scheduledCheckoutDate) {
		this.petType = petType;
		this.petName = petName;
		this.spaceNumber = spaceNumber;
		this.petAge = petAge;
		this.daysStay = daysStay;
		this.scheduledCheckoutDate = scheduledCheckoutDate;
		this.groomingPerformed = groomingPerformed;
		this.medAdministered = medAdministered;
		this.amountDue = amountDue;
		
	}
	//accessors & mutators
	public String getPetType() {
		return petType;
	}
	
	public void setPetType(String petType) {
		this.petType = petType;
	}
	
	public String getPetName() {
		return petName;
	}
	
	public void setPetName(String petName) {
		this.petName = petName;
	}
	
	public int getPetAge() {
		return petAge;
	}
	
	public void setPetAge(int petAge) {
		this.petAge = petAge;
	}
	
	public int getSpaceNumber() {
		return spaceNumber;
	}
	
	public void setSpaceNumber(int spaceNumber) {
		this.spaceNumber = spaceNumber;
	}
	
	public boolean isGroomingPerformed() {
		return groomingPerformed;
	}
	
	public void setGroomingPerformed(boolean groomingPerformed) {
		this.groomingPerformed = groomingPerformed;	
	}
	
	public boolean isMedAdministered() {
		return medAdministered;
	}
	
	public void setMedAdministered(boolean medAdministered) {
		this.medAdministered = medAdministered;
	}
	
	public int getDaysStay() {
		return daysStay;
	}
	
	public void setDaysStay(int daysStay) {
		this.daysStay = daysStay;
	}
	
	public double getAmountDue() {
		return amountDue;
	}
	
	public void setAmountDue(double amountDue) {
		this.amountDue = amountDue;
	}

	public LocalDate getScheduledCheckoutDate() {
		return scheduledCheckoutDate;
	}
	public void setScheduledCheckoutDate(LocalDate scheduledCheckoutDate) {
		this.scheduledCheckoutDate = scheduledCheckoutDate;
	}
}	//end Pet class
