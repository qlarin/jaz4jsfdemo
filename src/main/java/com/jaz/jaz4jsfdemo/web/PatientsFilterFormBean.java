package com.jaz.jaz4jsfdemo.web;

import java.io.Serializable;
import java.util.Date;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import org.richfaces.model.Filter;

import com.jaz.jaz4jsfdemo.domain.Patient;

@ManagedBean(name = "patientsFilterBean")
@ViewScoped
public class PatientsFilterFormBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String firstNameFilter;
	private String lastNameFilter;
	private String pinFilter;
	private Date dobFromFilter;
	private Date dobToFilter;
	private double weightFromFilter;
	private double weightToFilter;
	private int heightFromFilter;
	private int heightToFilter;
	private Date dorFromFilter;
	private Date dorToFilter;

	public String getFirstNameFilter() {
		return firstNameFilter;
	}

	public void setFirstNameFilter(String firstNameFilter) {
		this.firstNameFilter = firstNameFilter;
	}

	public String getLastNameFilter() {
		return lastNameFilter;
	}

	public void setLastNameFilter(String lastNameFilter) {
		this.lastNameFilter = lastNameFilter;
	}

	public String getPinFilter() {
		return pinFilter;
	}

	public void setPinFilter(String pinFilter) {
		this.pinFilter = pinFilter;
	}

	public Date getDobFromFilter() {
		return dobFromFilter;
	}

	public void setDobFromFilter(Date dobFromFilter) {
		this.dobFromFilter = dobFromFilter;
	}

	public Date getDobToFilter() {
		return dobToFilter;
	}

	public void setDobToFilter(Date dobToFilter) {
		this.dobToFilter = dobToFilter;
	}

	public double getWeightFromFilter() {
		return weightFromFilter;
	}

	public void setWeightFromFilter(double weightFromFilter) {
		this.weightFromFilter = weightFromFilter;
	}

	public double getWeightToFilter() {
		return weightToFilter;
	}

	public void setWeightToFilter(double weightToFilter) {
		this.weightToFilter = weightToFilter;
	}

	public int getHeightFromFilter() {
		return heightFromFilter;
	}

	public void setHeightFromFilter(int heightFromFilter) {
		this.heightFromFilter = heightFromFilter;
	}

	public int getHeightToFilter() {
		return heightToFilter;
	}

	public void setHeightToFilter(int heightToFilter) {
		this.heightToFilter = heightToFilter;
	}

	public Date getDorFromFilter() {
		return dorFromFilter;
	}

	public void setDorFromFilter(Date dorFromFilter) {
		this.dorFromFilter = dorFromFilter;
	}

	public Date getDorToFilter() {
		return dorToFilter;
	}

	public void setDorToFilter(Date dorToFilter) {
		this.dorToFilter = dorToFilter;
	}
	
	public Filter<?> getDobFromFilterImpl() {
		return new Filter<Patient>() {
			@Override
			public boolean accept(Patient patient) {
				Date dobFrom = getDobFromFilter();
				if(dobFrom == null || dobFrom.equals(patient.getDateOfBirth())){
					return true;
				}else if(dobFrom != null && dobFrom.before(patient.getDateOfBirth())){
					return true;
				}
				return false;
			}
			
		};
	}
	
	public Filter<?> getDobToFilterImpl() {
		return new Filter<Patient>() {
			@Override
			public boolean accept(Patient patient) {
				Date dobTo = getDobToFilter();
				if(dobTo == null || dobTo.equals(patient.getDateOfBirth())){
					return true;
				}else if(dobTo != null && dobTo.after(patient.getDateOfBirth())){
					return true;
				}
				return false;
			}
			
		};
	}
	
	public Filter<?> getDorFromFilterImpl() {
		return new Filter<Patient>() {
			@Override
			public boolean accept(Patient patient) {
				Date dorFrom = getDorFromFilter();
				if(dorFrom == null || dorFrom.equals(patient.getDateOfRegister())){
					return true;
				}else if(dorFrom != null && dorFrom.before(patient.getDateOfRegister())){
					return true;
				}
				return false;
			}
			
		};
	}
	
	public Filter<?> getDorToFilterImpl() {
		return new Filter<Patient>() {
			@Override
			public boolean accept(Patient patient) {
				Date dorTo = getDorToFilter();
				if(dorTo == null || dorTo.equals(patient.getDateOfRegister())){
					return true;
				}else if(dorTo != null && dorTo.after(patient.getDateOfRegister())){
					return true;
				}
				return false;
			}
			
		};
	}
	
	public Filter<?> getWeightFromFilterImpl() {
		return new Filter<Patient>() {
			@Override
			public boolean accept(Patient patient) {
				Double weightFrom = getWeightFromFilter();
				if(weightFrom == 0){
					return true;
				}else if(weightFrom != 0 && weightFrom <= patient.getWeight()){
					return true;
				}
				return false;
			}
			
		};
	}
	
	public Filter<?> getWeightToFilterImpl() {
		return new Filter<Patient>() {
			@Override
			public boolean accept(Patient patient) {
				Double weightTo = getWeightToFilter();
				if(weightTo == 0){
					return true;
				}else if(weightTo != 0 && weightTo >= patient.getWeight()){
					return true;
				}
				return false;
			}
			
		};
	}

	public Filter<?> getHeightFromFilterImpl() {
		return new Filter<Patient>() {
			@Override
			public boolean accept(Patient patient) {
				int heightFrom = getHeightFromFilter();
				if(heightFrom == 0){
					return true;
				}else if(heightFrom != 0 && heightFrom <= patient.getHeight()){
					return true;
				}
				return false;
			}
			
		};
	}
	
	public Filter<?> getHeightToFilterImpl() {
		return new Filter<Patient>() {
			@Override
			public boolean accept(Patient patient) {
				int heightTo = getHeightToFilter();
				if(heightTo == 0){
					return true;
				}else if(heightTo != 0 && heightTo >= patient.getHeight()){
					return true;
				}
				return false;
			}
			
		};
	}
	
}