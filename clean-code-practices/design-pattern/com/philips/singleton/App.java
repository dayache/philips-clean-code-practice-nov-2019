package com.philips.singleton;

public class App {
	public static void main(String[] args) {
		EagerInitializationSinglton e  = EagerInitializationSinglton.getInstance(); 
		
		
		//prints the storage location 
		System.out.println(e.hashCode());
		
		
		e  = EagerInitializationSinglton.getInstance();
		System.out.println(e.hashCode());
		
		e  = EagerInitializationSinglton.getInstance();
		System.out.println(e.hashCode());
		
	}
}
