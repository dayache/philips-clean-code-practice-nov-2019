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
		return new TurboEngiee(); 
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
		return new PistonEnginee();  
	}

}


class NitroEnginee extends Enginee{
	public NitroEnginee() {
		System.out.println("Nitro enginee created... ");
		
	}
	
	public NitroEnginee(NitroEnginee nitroEnginee) {
		
		super(nitroEnginee); 
	}

	@Override
	public Enginee copy() {
		return new NitroEnginee(); 
	}
	
	
	
}

class Car {
	private int year;
	private Enginee enginee;

	public Car(int year, Enginee enginee) {

		this.year = year;
		this.enginee = enginee;
	}

	public Car(Car car) {
		year = car.year;
		enginee = car.enginee.copy(); 
	}

	@Override
	public String toString() {
		return "Car [year=" + year + ", enginee=" + enginee + "]";
	}
}

public class CarApplication01 {
	public static void main(String[] args) {
		Car car1 = new Car(2019, new NitroEnginee());
		System.out.println(car1);

		Car car2 = new Car(car1);
		System.out.println(car2);

	}
}
