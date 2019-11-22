package com.philips.absfactory;

// this class will also act as adapter pattern 
// since we are not implementing vehicle bl 
public class ColorFactory extends AbstractFactory{

	@Override
	public IVehicle getVehicle(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IColor getColor(String color) {

		if(color.equals("blue")) {
			return new Blue(); 
		}else if(color.equals("black")) {
			return new Black(); 
		}else if(color.equals("red")) {
			return new Red(); 
		}
		
		return null; 
	}
	
}
