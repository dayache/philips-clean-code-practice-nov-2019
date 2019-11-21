package com.philips.app;

import java.util.List;

import com.philips.beans.Address;
import com.philips.beans.Name;
import com.philips.beans.Patient;
import com.philips.contract.IPatientDAO;
import com.philips.dao.PatientDAO;

public class App {
	public static void main(String[] args) {
		IPatientDAO patientDao = new PatientDAO(); 
		
		Patient patient = new Patient(101, new Name("Harry", "Peter"), 22,
				new Address(223, "Concord Blvd", "Benglauru", 
						"Karnatka", 454545));
		
//		patientDao.storePatientDetails(patient);
		
		List<Patient> list = patientDao.getAllPatients(); 
		for(Patient p: list) {
			System.out.println(p); // p.toString() 
		}
		
		
	}
}
