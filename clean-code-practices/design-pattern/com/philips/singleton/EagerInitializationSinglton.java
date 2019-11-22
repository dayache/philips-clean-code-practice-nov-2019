package com.philips.singleton;

// make constructor private 
public class EagerInitializationSinglton {
	
	// it not be in the heap, it will be in stack
	static EagerInitializationSinglton instance = new EagerInitializationSinglton(); 
	
	private EagerInitializationSinglton() {
		System.out.println("Constructor called... ");
	}
	
	public static EagerInitializationSinglton getInstance() {
		return instance; 
	}
	
}
