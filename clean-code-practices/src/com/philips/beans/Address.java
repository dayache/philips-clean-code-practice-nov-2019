package com.philips.beans;

import java.io.Serializable;

/**
 * 
 * @author naveenkumar
 * @see The address can be used for any real world object 
 * @since 21-nov-2019 
 * @apiNote This will be persisted 
 *
 */
public class Address implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -4019241198477496480L;
	private int houseNumber; 
	private String streetName; 
	private String city; 
	private String state; 
	private int zipcode;


	
	@Override
	public String toString() {
		return "Address [houseNumber=" + houseNumber + ", streetName=" + streetName + ", city=" + city + ", state="
				+ state + ", zipcode=" + zipcode + "]";
	}
	public Address() {} 
	public Address(int houseNumber, String streetName, String city, String state, int zipcode) {
		super();
		this.houseNumber = houseNumber;
		this.streetName = streetName;
		this.city = city;
		this.state = state;
		this.zipcode = zipcode;
	}

	public int getHouseNumber() {
		return houseNumber;
	}
	
	public void setHouseNumber(int houseNumber) {
		this.houseNumber = houseNumber;
	}
	public String getStreetName() {
		return streetName;
	}
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getZipcode() {
		return zipcode;
	}
	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}

	

}
