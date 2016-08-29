package com;

public class Cars {

	private String name;
	private String manufacturer;

	public String getManufacturer() {
		return manufacturer;
	}

	public String getName() {
		return name;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String toString() {
		return "Manufacturer = " + manufacturer + " Car = " + name;
	}
}
