package com.testing.java.core;

public class Main {

	public static void main(String[] args) {
		// Values are coming from constructor
		GettersAndSetters car = new GettersAndSetters("6", "V8", "Honda", "20");
		GettersAndSetters car1 = new GettersAndSetters("6");
		GettersAndSetters car2 = new GettersAndSetters("4", "20");

		/*
		 * car.setDoors("4"); car.setEngine("V4"); car.setModel("Rav-4");
		 * car.setSpeed("10");
		 */

		System.out.println("Cars has doors : " + car.getDoors() + "\n" + "Car engine is : " + car.getEngine() + "\n"
				+ "Car model is : " + car.getModel() + "\n" + "Car speed is : " + car.getSpeed());
	}

}
