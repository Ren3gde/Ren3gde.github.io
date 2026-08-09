package com.java;

public class Pet {
	
	//Declare Attributes
	private String petType;
	private String petName;
	private int petAge;
	private int dogSpaces;
	private int catSpaces;
	private int daysStay;
	private double amountDue;

	
	//Constructor
	public Pet(String petType, String petName,int petAge, int dogSpaces, int catSpaces, int daysStay, double amountDue) {
		this.petType = petType;
		this.petName = petName;
		this.petAge= petAge;
		this.dogSpaces = dogSpaces;
		this.catSpaces = catSpaces;
		this.daysStay = daysStay;
		this.amountDue = amountDue;
		
	}
	//accessor
	public String getPetType() {
		return petType;
	}
	//mutator
	public void setPetType(String petType) {
		this.petType = petType;
	}
	//accessor
	public String getPetName() {
		return petName;
	}
	//mutator
	public void setPetName(String petName) {
		this.petName = petName;
	}
	//accessor
	public int getPetAge() {
		return petAge;
	}
	//mutator
	public void setPetAge(int petAge) {
		this.petAge = petAge;
	}
	//accessor
	public int getDogSpaces() {
		return dogSpaces;
	}
	//mutator
	public void setDogSpaces(int dogSpaces) {
		this.dogSpaces = dogSpaces;
	}
	//accessor
	public int getCatSpaces() {
		return catSpaces;
	}
	//mutator
	public void setCatSpaces(int catSpaces) {
		this.catSpaces = catSpaces;
	}
	//accessor
	public int getDaysStay() {
		return daysStay;
	}
	//mutator
	public void setDaysStay(int daysStay) {
		this.daysStay = daysStay;
	}
	//accessor
	public double getAmountDue() {
		return amountDue;
	}
	//mutator
	public void setAmountDue(double amountDue) {
		this.amountDue = amountDue;
	}
}	//end Pet class
