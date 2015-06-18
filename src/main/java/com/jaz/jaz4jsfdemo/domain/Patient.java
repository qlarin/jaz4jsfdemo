package com.jaz.jaz4jsfdemo.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

@Entity
@NamedQueries({
	@NamedQuery(name = "patient.all", query = "Select p from Patient p")
})
public class Patient {

	private Long id;
	
	private String firstName = "unknown";
	private String lastName = "unknown";
	private String pin = "";
	private Date dateOfBirth = new Date();
	private String address = "";
	private String phoneNumber = "";
	private double weight;
	private int height;
	private Date dateOfRegister = new Date();
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Long getId() {
		return id;
	}
	
	public void setId(Long id){
		this.id = id;
	}
	
	@Size(min = 2, max = 50)
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	@Size(min = 2, max = 50)
	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPin() {
		return pin;
	}

	public void setPin(String pin) {
		this.pin = pin;
	}

	@Past
	@Temporal(TemporalType.DATE)
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

	@Temporal(TemporalType.DATE)
	public Date getDateOfRegister() {
		return dateOfRegister;
	}

	public void setDateOfRegister(Date dateOfRegister) {
		this.dateOfRegister = dateOfRegister;
	}

	@Override
	public String toString() {
		return "Patient [id=" + id + ", firstName=" + firstName + ", lastName="
				+ lastName + ", pin=" + pin + ", dateOfBirth=" + dateOfBirth
				+ ", address=" + address + ", phoneNumber=" + phoneNumber
				+ ", weight=" + weight + ", height=" + height + "]";
	}

	
	
}
