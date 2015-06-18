package com.jaz.jaz4jsfdemo.service;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.jaz.jaz4jsfdemo.domain.Patient;

@Stateless
public class PatientManager {
	
	
	@PersistenceContext
	EntityManager em;
	
	public void addPatient(Patient patient){
		patient.setId(null);
		em.persist(patient);
	}
	
	public void deletePatient(Patient patient){
		patient = em.find(Patient.class, patient.getId());
		em.remove(patient);
		
	}
		@SuppressWarnings("unchecked")
		public List<Patient> getAllPatients(){
			return em.createNamedQuery("patient.all").getResultList();
	}
		
}
