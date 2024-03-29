package com.monapp.model;

import java.util.ArrayList;
import java.util.List;

public class Parking {
	
	private int id;
	private String name;
	private List<Car> cars = new ArrayList<>();
	
	public Parking(int id, String name, List<Car> cars) {
		super();
		this.id = id;
		this.name = name;
		this.cars = cars;
	}
	public Parking(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public Parking() {
		super();
	}
	
	@Override
	public String toString() {
		return "Parking [id=" + id + ", name=" + name + ", cars=" + cars + "]";
	}
	public void addCar(Car c) {
		this.cars.add(c);
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public List<Car> getCars() {
		return cars;
	}
}