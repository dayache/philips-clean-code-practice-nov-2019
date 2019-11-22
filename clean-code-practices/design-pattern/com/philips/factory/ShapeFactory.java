package com.philips.factory;

public class ShapeFactory {

	ShapeFactory sf;

	public ShapeFactory(ShapeFactory shapeFactory) {
		this.copy(shapeFactory);
	}

	public ShapeFactory copy(ShapeFactory sf) {
		return new ShapeFactory(this);
	}

}

class ShapeA extends ShapeFactory {

	public ShapeA(ShapeFactory shapeFactory) {
		super(shapeFactory);

		System.out.println("Shape A Createcd.. ");
	}

	public ShapeFactory copy() {
		return new ShapeA(sf);
	}

}

class ShapeB extends ShapeFactory {

	public ShapeB(ShapeFactory shapeFactory) {
		super(shapeFactory);
		System.out.println("Shape B Created... ");

	}

	public ShapeFactory copy() {
		return new ShapeA(sf);
	}

}
//
//class ShapeB extends ShapeFactory {
//	public ShapeFactory copy() {
//		return new ShapeB();
//	}
//}
