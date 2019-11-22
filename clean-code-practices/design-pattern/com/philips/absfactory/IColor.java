package com.philips.absfactory;

public interface IColor {
	void paint(); 
}


class Blue implements IColor{

	@Override
	public void paint() {
		System.out.println("Painting Blue color ");
	}
	
}

class Red implements IColor{

	@Override
	public void paint() {
		System.out.println("Painting Red color ");		
	}
	
}

class Black implements IColor{

	@Override
	public void paint() {
		System.out.println("Painting Black color ");		
	}
	
}
