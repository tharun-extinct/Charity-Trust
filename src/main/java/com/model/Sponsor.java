package com.model;

import org.springframework.stereotype.Component;

//POJO class
// Use appropriate annotation
@Component
public class Sponsor {
	
	// Fill the code
	private String sponsorName;
	
	//Fill the code
	private float amount;
	
	//fill the code
	private String date;
	
	private String donationFor;
	
	//Fill the code
	private String phoneNumber;

	public String getSponsorName() {
		return sponsorName;
	}

	public void setSponsorName(String sponsorName) {
		this.sponsorName = sponsorName;
	}

	public float getAmount() {
		return amount;
	}

	public void setAmount(float amount) {
		this.amount = amount;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getDonationFor() {
		return donationFor;
	}

	public void setDonationFor(String donationFor) {
		this.donationFor = donationFor;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

}
