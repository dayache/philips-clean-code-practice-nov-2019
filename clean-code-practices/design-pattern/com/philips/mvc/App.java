package com.philips.mvc;

import com.philips.absfactory.IVehicle;

public class App {
	public static void main(String[] args) {
		Student model = getFromDB(); 
		View view = new CapView(); 
		
		IView iView = new DashedView(); 
		Controller controller = new Controller(model, view); 
		
		controller.render(); 
	}

	private static Student getFromDB() {
		Student student = new Student(101, "Harry", 78); 
		return student; 
	}
}
