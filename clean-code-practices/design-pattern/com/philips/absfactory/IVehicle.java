package com.philips.absfactory;

public interface IVehicle {
	void move(); 
	void maxSpeed(int speed); 
}

class Car implements IVehicle{

	@Override
	public void move() {
		System.out.println("Car moves with 4 tyres... ");
	}

	@Override
	public void maxSpeed(int speed) {
		System.out.println("Car max speed " + speed);
	}
	
}

class Truck implements IVehicle{

	@Override
	public void move() {
		System.out.println("Truck moves with 8 tyres... ");
	}

	@Override
	public void maxSpeed(int speed) {
		System.out.println("Truck max speed " + speed);
	}
	
}