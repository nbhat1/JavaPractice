package com.testing.java.oops.composition.laptop;

import com.testing.java.oops.composition.components.GraphicsCard;
import com.testing.java.oops.composition.components.Processor;

public class Laptop {

	private float screen;
	private Processor processor;
	private String ram;
	private String hardDrive;
	private GraphicsCard graphicsCard;
	private String opticalDrive;
	private String keyboard;

	/**
	 * Default constructor
	 */
	public Laptop() {
		this.screen = 15.6f;
		this.processor = new Processor();
		this.ram = "DD4";
		this.hardDrive = "2TB";
		this.graphicsCard = new GraphicsCard();
		this.opticalDrive = "MLT Layer";
		this.keyboard = "backlit";
	}

	/**
	 * @param screen
	 * @param processor
	 * @param ram
	 * @param hardDrive
	 * @param graphicsCard
	 * @param opticalDrive
	 * @param keyboard
	 */
	public Laptop(float screen, Processor processor, String ram, String hardDrive, GraphicsCard graphicsCard,
			String opticalDrive, String keyboard) {

		this.screen = screen;
		this.processor = processor;
		this.ram = ram;
		this.hardDrive = hardDrive;
		this.graphicsCard = graphicsCard;
		this.opticalDrive = opticalDrive;
		this.keyboard = keyboard;
	}

	/*
	 * toString() method return values of default constructor
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Laptop [screen=" + screen + ", processor=" + processor + ", ram=" + ram + ", hardDrive=" + hardDrive
				+ ", graphicsCard=" + graphicsCard + ", opticalDrive=" + opticalDrive + ", keyboard=" + keyboard + "]";
	}

}
