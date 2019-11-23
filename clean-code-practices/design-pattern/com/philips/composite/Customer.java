package com.philips.composite;

import java.util.ArrayList;
import java.util.List;

public class Customer {
	private int customerId; 
	private String customerName; 
	private List<Customer> refferal;
	
	
	
	public Customer(int customerId, String customerName) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		refferal = new ArrayList<>(); 
	}
	
	
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public List<Customer> getRefferal() {
		return refferal;
	}
	public void setRefferal(List<Customer> refferal) {
		this.refferal = refferal;
	} 
	
	public void addReferral(Customer customer) {
		this.refferal.add(customer); 
	}
	
	public void removeReferral(Customer customer) {
		this.refferal.remove(customer); 
	}
}
