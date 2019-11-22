package com.philips.abstractfactory1;

// this follows the open close principle 
class Enginee {

	public Enginee() {
		System.out.println("Enginee Created... ");
	}

	protected Enginee(Enginee enginee) {

	}

	@Override
	public String toString() {
		return getClass().getName() + "  : " + hashCode();
	}

//	at this point in time it will not act as a copy constructor since we have commented the copy method in the child class 
	public Enginee copy() {
		return new Enginee(this);
	}
}

class TurboEngiee extends Enginee {
	public TurboEngiee() {
		System.out.println("Turbo Enginee created... ");
	}

	public TurboEngiee(TurboEngiee turboEnginee) {
		super(turboEnginee);
	}

	@Override
	public Enginee copy() {
		return new TurboEngiee(this);
	}
}

class PistonEnginee extends Enginee {
	public PistonEnginee() {
		System.out.println("Piston Enginee created... ");
	}

	public PistonEnginee(PistonEnginee pistonEngine) {
		super(pistonEngine);
	}

	@Override
	public Enginee copy() {
		return new PistonEnginee(this);
	}
}

class Car {
	private int year;
	private Enginee enginee;

	public Car(int year, Enginee enginee) {

		this.year = year;
		this.enginee = enginee;
	}

	@Override
	public String toString() {
		return "Car [year=" + year + ", enginee=" + enginee + "]";
	}

	// the constructor of the car has to chance when you get new type of engine
	// this is breaking open-close principle
	public Car(Car car) {
		year = car.year;

//		if(car.enginee instanceof TurboEngiee) {
//			enginee = new TurboEngiee( (TurboEngiee) (car.enginee)); 
//		}else {
//			enginee =  new Enginee(car.enginee);
//		}

		// we are not copy of clone, as that has the problem.
		enginee = car.enginee.copy();

	}
}

public class CarApplication01 {
	public static void main(String[] args) {
		Car car1 = new Car(2019, new TurboEngiee());
		System.out.println(car1);

		// this will not work since java does not give copy constructor
		Car car2 = new Car(car1);
		System.out.println(car2);

	}
}
