package com.philips.singleton;

public class LazyApp {
	public static void main(String[] args) {
		Company company = null; 
		
		company = Company.getCompany(company); 
		System.out.println(company.hashCode());
		
		company = Company.getCompany(company); 
		System.out.println(company.hashCode());
		
		company = Company.getCompany(company); 
		System.out.println(company.hashCode());
		
		
		//--------------------------------------------
		
		
		Company c1 = Company.getCompany(); 
		System.out.println(c1.hashCode());
		
		c1 = Company.getCompany(); 
		System.out.println(c1.hashCode());
		
		c1 = Company.getCompany(); 
		System.out.println(c1.hashCode());
	}
}
