package com.java.project;

public class Dish {
	private int id;
	private String name;
	private String description;
	private DishTypes typeofdish;
	private double rate;
	private int quantity;

	public Dish(int id, String name, String description, DishTypes typeofdish, double rate, int quantity) {
		this.id = id;
		this.name = name;
		this.description = description;
		this.typeofdish = typeofdish;
		this.rate = rate;
		this.quantity = quantity;
	}

	// Getters and Setters

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public DishTypes getTypeofdish() {
		return typeofdish;
	}

	public void setTypeofdish(DishTypes typeofdish) {
		this.typeofdish = typeofdish;
	}

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
}
