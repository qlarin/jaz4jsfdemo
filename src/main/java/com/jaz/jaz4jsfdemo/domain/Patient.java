package com.jaz.jaz4jsfdemo.domain;

import java.util.Date;

import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

public class Patient {

	private String firstName = "unknown";
	private String lastName = "unknown";
	private String pin = "";
	private Date dateOfBirth = new Date();
	private String address = "";
	private String phoneNumber = "";
	private double weight;
	private int height;

	@Size(min = 2, max = 20)
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	@Size(min = 2, max = 20)
	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Size(min = 2)
	public String getPin() {
		return pin;
	}

	public void setPin(String pin) {
		this.pin = pin;
	}

	@Past
	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

}
