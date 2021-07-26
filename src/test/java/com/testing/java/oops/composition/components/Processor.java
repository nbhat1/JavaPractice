package com.testing.java.oops.composition.components;

public class Processor {

	private String brand;
	private String series;
	private int generation;
	private int cores;
	private int threads;
	private String cacheMemory;
	private String frequencey;
	private String minFrequency;
	private String maxFrequence;

	/**
	 * Default constructor
	 */
	public Processor() {
		this.brand = "intel";
		this.series = "i5 7200u";
		this.generation = 6;
		this.cores = 2;
		this.threads = 4;
		this.cacheMemory = "3 MB";
		this.frequencey = "2.5Ghz";
		this.minFrequency = "2.5Ghz";
		this.maxFrequence = "3.1Ghz";
	}

	/**
	 * @param brand
	 * @param series
	 * @param generation
	 * @param cores
	 * @param threads
	 * @param cacheMemory
	 * @param frequencey
	 * @param minFrequency
	 * @param maxFrequence
	 */
	public Processor(String brand, String series, int generation, int cores, int threads, String cacheMemory,
			String frequencey, String minFrequency, String maxFrequence) {

		this.brand = brand;
		this.series = series;
		this.generation = generation;
		this.cores = cores;
		this.threads = threads;
		this.cacheMemory = cacheMemory;
		this.frequencey = frequencey;
		this.minFrequency = minFrequency;
		this.maxFrequence = maxFrequence;
	}

	/*
	 * toString() method return values of default constructor
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Processor [brand=" + brand + ", series=" + series + ", generation=" + generation + ", cores=" + cores
				+ ", threads=" + threads + ", cacheMemory=" + cacheMemory + ", frequencey=" + frequencey
				+ ", minFrequency=" + minFrequency + ", maxFrequence=" + maxFrequence + "]";
	}

	public void inProcessorClass() {
		System.out.println("I am from processor class");
	}

}
