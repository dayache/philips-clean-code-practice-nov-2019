package com.philips.singleton;

public class Company {

	static Company company ; 
	
	private Company() {
		System.out.println("Company initialized... ");
	} 
	
	
	public static Company getCompany() {
		if(company== null) {
			company =  new Company(); 
		}
		return company; 
	}
	
	public static Company getCompany(Company company) {
		if(company==null) {
			return new Company(); 
		}
		
		return company; 
	}
	
}
