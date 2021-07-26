package com.testing.java.oops.composition.components;

public class GraphicsCard {

	private String brand;
	private int series;
	private String memory;

	/**
	 * Default constructor
	 */
	public GraphicsCard() {
		this.brand = "Nvidia";
		this.series = 940;
		this.memory = "2 GB";
	}

	/**
	 * @param brand
	 * @param series
	 * @param memory
	 */
	public GraphicsCard(String brand, int series, String memory) {

		this.brand = brand;
		this.series = series;
		this.memory = memory;
	}

	/*
	 * toString() method return values of default constructor
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "GraphicsCard [brand=" + brand + ", series=" + series + ", memory=" + memory + "]";
	}

}
