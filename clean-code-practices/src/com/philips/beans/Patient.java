package com.philips.beans;

import java.io.Serializable;

/**
 * 
 * @author naveenkumar
 * @since 2019 
 * 
 */


public class Patient  implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 3365094121481729682L;
	private int patientId;
	private Name name;
	private int age;
	private Address address; 
	
	
	
	
	
	
	@Override
	public String toString() {
		return "Patient [patientId=" + patientId + ", name=" + name + ", age=" + age + ", address=" + address + "]";
	}
	public Patient() {}
	public Patient(int patientId, Name name, int age, Address address) {
		super();
		this.patientId = patientId;
		this.name = name;
		this.age = age;
		this.address = address;
	}
	
	
	
	public int getPatientId() {
		return patientId;
	}
	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}
	public Name getName() {
		return name;
	}
	public void setName(Name name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	} 
	
	
}
