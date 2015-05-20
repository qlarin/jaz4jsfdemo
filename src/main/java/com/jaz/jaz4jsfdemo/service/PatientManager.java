package com.jaz.jaz4jsfdemo.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.enterprise.context.ApplicationScoped;

import com.jaz.jaz4jsfdemo.domain.Patient;

@ApplicationScoped
public class PatientManager {
	private List<Patient> db = new ArrayList<Patient>();
	
	public void addPatient(Patient patient){
		Patient newPatient = new Patient();
		
		newPatient.setFirstName(patient.getFirstName());
		newPatient.setLastName(patient.getLastName());
		newPatient.setPin(patient.getPin());
		newPatient.setDateOfBirth(patient.getDateOfBirth());
		newPatient.setAddress(patient.getAddress());
		newPatient.setPhoneNumber(patient.getPhoneNumber());
		newPatient.setWeight(patient.getWeight());
		newPatient.setHeight(patient.getHeight());
		newPatient.setDateOfRegister(patient.getDateOfRegister());
		
		db.add(newPatient);
	}
	
	public void deletePatient(Patient patient){
		Patient patientToRemove = null;
		
		for(Patient p : db){
			if(patient.getPin().equals(p.getPin())){
				patientToRemove = p;
				break;
			}
		}
		if(patientToRemove != null){
			db.remove(patientToRemove);
		}
		
	}
		public List<Patient> getAllPatients(){
			return db;
	}
		
		
	
}
