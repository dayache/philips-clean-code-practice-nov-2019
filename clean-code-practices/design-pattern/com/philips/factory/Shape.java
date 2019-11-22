package com.philips.factory;

public abstract class Shape {
	
	public Shape() {}
	
	public Shape(Shape shape) {
		System.out.println("Object created.. ");
	}

	public abstract void area(); 


	public static Shape createShape(ShapeNames name) {
		if(name == ShapeNames.CIRCLE) {
			return new Circle(); 
		}
		
		if(name == ShapeNames.RECTANGLE) {
			return new Rectangle(); 
		}
		
		if(name == ShapeNames.TRIANGLE) {
			return new Triangle(); 
		}
		
		return null; 
	}
	
}



class Rectangle extends Shape{
	
	
	private int len; 
	private int bre; 
	
	
	
	public int getLen() {
		return len;
	}

	public void setLen(int len) {
		this.len = len;
	}

	public int getBre() {
		return bre;
	}

	public void setBre(int bre) {
		this.bre = bre;
	}

	public Rectangle() {
		System.out.println("Rectangle Created... ");
	}

	@Override
	public void area() {
		System.out.println(len * bre);
	}
	
	
	
}


class Circle extends Shape {
	
	private int radius; 
	
	public Circle() {
		System.out.println("Circle Created... ");
	}

	
	@Override
	public void area() {
		System.out.println(3.14 * radius * radius);
		
	}


	public int getRadius() {
		return radius;
	}


	public void setRadius(int radius) {
		this.radius = radius;
	}
	
}


class Triangle extends Shape{
	private int len; 
	private int bre; 
	
	
	public int getLen() {
		return len;
	}

	public void setLen(int len) {
		this.len = len;
	}

	public int getBre() {
		return bre;
	}

	public void setBre(int bre) {
		this.bre = bre;
	}

	public Triangle() {
		System.out.println("Triangle Create... ");
	}

	@Override
	public void area() {
		System.out.println(0.5 * len * bre);
		
	}
}





