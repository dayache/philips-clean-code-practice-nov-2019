package com.philips.absfactory;

public class VehicleFactory extends AbstractFactory {

	@Override
	public IVehicle getVehicle(String name) {
		if(name.equals("car")) {
			return new Car(); 
		}else if(name.equals("truck")) {
			return new Truck(); 
		}
		
		return  null; 
	}

	@Override
	public IColor getColor(String color) {
		// TODO Auto-generated method stub
		return null;
	}

}
