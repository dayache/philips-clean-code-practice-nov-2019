package com.philips.composite;

public class App {
	public static void main(String[] args) {
		Customer customer1 = new Customer(101, "Harry");
		Customer customer2 = new Customer(102, "Peter");
		Customer customer3 = new Customer(103, "Raja");
		Customer customer4 = new Customer(104, "Rani");
		Customer customer5 = new Customer(105, "Rama");
		Customer customer6 = new Customer(106, "Sita");
		Customer customer7 = new Customer(107, "Kumar");
		
		
		customer1.addReferral(customer2);
		customer1.addReferral(customer3);
		
		showCustomerWithReferral(customer1);
		
		customer1.removeReferral(customer2);
		showCustomerWithReferral(customer1);
		
	}
	
	private static  void showCustomerWithReferral(Customer customer) {
		System.out.println("------------------");
		System.out.println("Customer Id : " + customer.getCustomerId());
		System.out.println("Customer Name : " + customer.getCustomerName());
		
		for(Customer cust : customer.getRefferal()) {
			System.out.println("\tCustomer Id : " + cust.getCustomerId());
			System.out.println("\tCustomer Name : " + cust.getCustomerName());
			
		}
	}
	
	
}
