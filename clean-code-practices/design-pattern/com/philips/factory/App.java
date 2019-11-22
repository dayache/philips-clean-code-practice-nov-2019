package com.philips.factory;

public class App {
	public static void main(String[] args) {
		Shape s = Shape.createShape(ShapeNames.CIRCLE); 
		
		((Circle)s).setRadius(4); 
		
		ShapeBL.showArea(s);
		System.out.println("---------------------");
		
		s = Shape.createShape(ShapeNames.TRIANGLE); 
		
		((Triangle)s).setBre(3);
		((Triangle)s).setLen(4);
		

		ShapeBL.showArea(s);
		System.out.println("---------------------");
		
		s = Shape.createShape(ShapeNames.RECTANGLE);
		
		((Rectangle)s).setBre(5);
		((Rectangle)s).setLen(3);
		

		ShapeBL.showArea(s);
		
		
	}
}
