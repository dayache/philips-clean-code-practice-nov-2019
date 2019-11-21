package com.philips.dao;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import com.philips.beans.Patient;
import com.philips.contract.IPatientDAO;

public class PatientDAO implements IPatientDAO {

	@Override
	public void storePatientDetails(Patient patient) {
		ObjectOutputStream oos = null;
		FileOutputStream fos = null;
		File file = null;
		try {
			file = new File("patient.ser");
			fos = new FileOutputStream(file);
			oos = new ObjectOutputStream(fos);

			oos.writeObject(patient);

			System.out.println("Data Saved... ");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				oos.close();
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

	@Override
	public Patient getPatient(int id) {
		return null;
	}

	@Override
	public List<Patient> getAllPatients() {

		List<Patient> list = new ArrayList<Patient>();

		try {
			File file = new File("patient.ser");
			FileInputStream fis = new FileInputStream(file);
			ObjectInputStream ois = new ObjectInputStream(fis);

			Patient p = null;
			while ((p = (Patient) ois.readObject()) != null) {
				list.add(p);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return list;
	}

}
