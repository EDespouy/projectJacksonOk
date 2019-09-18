package com.monapp.model;

public class Car {
	private int id;
	private String immat;
	private String model;
	private String color;
	
	public Car(int id, String immat, String model, String color) {
		super();
		this.id = id;
		this.immat = immat;
		this.model = model;
		this.color = color;
	}

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Car [id=" + id + ", immat=" + immat + ", model=" + model + ", color=" + color + "]";
	}

	public Car() {
		super();
	}

	public String getImmat() {
		return immat;
	}

	public String getModel() {
		return model;
	}

	public String getColor() {
		return color;
	}
	
	
}
