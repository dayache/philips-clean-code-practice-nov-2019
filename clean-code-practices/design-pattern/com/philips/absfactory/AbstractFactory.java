package com.philips.absfactory;

public abstract class AbstractFactory {
	public abstract IVehicle getVehicle(String name);
	public abstract IColor getColor(String color); 
}
