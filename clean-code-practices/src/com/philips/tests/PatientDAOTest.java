package com.philips.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.philips.beans.Address;
import com.philips.beans.Name;
import com.philips.beans.Patient;
import com.philips.contract.IPatientDAO;
import com.philips.dao.PatientDAO;

/**
 * 
 * @author naveenkumar
 * @see test cases to do CRUD operation for patient
 * @since Nov-2019
 */
public class PatientDAOTest {
	private IPatientDAO patientDao;
	private Patient patient;

	@BeforeClass
	public static void setUpBeforeClass() {
		System.out.println("in setUpBeforeClass()");
	}

	@AfterClass
	public static void tearDownAfterClass() {
		System.out.println("in tearDownAfterClass()");
	}

	// if you annotate the method with before, then the
	// method will be called every time before @Test
	@Before
	public void setUp() {
		patientDao = new PatientDAO();
		patient = new Patient(101, new Name("Harry", "Peter"), 22,
				new Address(223, "Concord Blvd", "Benglauru", 
						"Karnatka", 454545));
	}

	@After
	public void tearDown() {
	}

	@Test
	public void patientInsertedTest() {

		boolean expected = true;

		patientDao.storePatientDetails(patient);
		boolean actual = patientDao.getPatient(
					patient.getPatientId()) != null;
		assertEquals(expected, actual);
		
	}

	@Test
	public void patientNameTest() {
		String actualName = patientDao.getPatient(patient.getPatientId()).
				getName().getFirstName();
		
		assertEquals("Harry", actualName);
	}
	
	
	@Test
	public void getPatientTest() {
		assertNull(patientDao.getPatient(101));
	}
	
	
	
	
	// TODO 
	@Test
	public void getPatientWithIdTest() {
		boolean expected = true;
		boolean actual = false;
		assertEquals(expected, actual);
	}

}
