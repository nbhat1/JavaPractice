package com.testing.java.core;

public class GettersAndSetters {

	private String doors;
	private String speed;
	private String engine;
	private String model;

	public GettersAndSetters(String doors, String speed, String engine, String model) {
		super();
		this.doors = doors;
		this.speed = speed;
		this.engine = engine;
		this.model = model;
	}

	/* Constructor with only one value */
	public GettersAndSetters(String doors) {
		this.doors = doors;
	}

	/* Constructor with only 2 value */
	public GettersAndSetters(String doors, String speed) {
		this.doors = doors;
		this.speed = speed;
	}

	public String getSpeed() {
		return speed;
	}

	public void setSpeed(String speed) {
		this.speed = speed;
	}

	public String getEngine() {
		return engine;
	}

	public void setEngine(String engine) {
		this.engine = engine;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getDoors() {
		return doors;
	}

	public void setDoors(String doors) {
		this.doors = doors;
	}

}
