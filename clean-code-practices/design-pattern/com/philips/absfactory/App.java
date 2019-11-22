package com.philips.absfactory;

public class App {
	public static void main(String[] args) {
		AbstractFactory colorFactory = FactoryProducer.getFactory("color"); 
		AbstractFactory vehicleFactory = FactoryProducer.getFactory("vehicle"); 
		
		IColor color = colorFactory.getColor("blue"); 
		
		color.paint(); 
		
		IVehicle vehicle = vehicleFactory.getVehicle("car");
		vehicle.maxSpeed(60);
		vehicle.move(); 
		
		
	}
}
