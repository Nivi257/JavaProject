package com.java.project;

import java.util.*;

//FoodOrder-a)Order-  a class consists of Order details from a customer.
public class Order {
	private int id;
	private String customerName;
	private String restaurant;
	private String location;
	private double orderValue;
	private Date orderDate;
	private List<Dish> dishes;

	public Order(int id, String customerName, String restaurant, String location, Date orderDate) {
		this.id = id;
		this.customerName = customerName;
		this.restaurant = restaurant;
		this.location = location;
		this.orderDate = orderDate;
		this.orderValue = 0;
		this.dishes = new ArrayList<Dish>();
	}

	public void addDish(Dish dish) {
		dishes.add(dish);
	}

	// Getters and Setters

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getRestaurant() {
		return restaurant;
	}

	public void setRestaurant(String restaurant) {
		this.restaurant = restaurant;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public double getOrderValue() {
		return orderValue;
	}

	public void setOrderValue(double orderValue) {
		this.orderValue = orderValue;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public List<Dish> getDishes() {
		return dishes;
	}

	public void setDishes(List<Dish> dishes) {
		this.dishes = dishes;
	}
}
