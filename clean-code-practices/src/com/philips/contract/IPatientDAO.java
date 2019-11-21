package com.philips.contract;

import java.util.List;

import com.philips.beans.Patient;


// IPatientDAO, PatientDAOContract

public interface IPatientDAO {
	public void storePatientDetails(Patient patient);
	
	public Patient getPatient(int id); 
	
	public List<Patient> getAllPatients(); 
}
