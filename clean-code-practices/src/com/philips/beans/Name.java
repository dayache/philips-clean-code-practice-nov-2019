package com.philips.beans;

import java.io.Serializable;

/**
 * 
 * @author naveenkumar
 * @see this class is used for representing name f
 * for customer/employee/patient etc 
 */


public class Name  implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -3800297427889882954L;
	/**
	 * 
	 */
	private String firstName;
	private String lastName;

	
	
	
	@Override
	public String toString() {
		return "Name [firstName=" + firstName + ", lastName=" + lastName + "]";
	}


	public Name(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}


	public Name() {
	}

	
	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
	
}