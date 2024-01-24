package com.java.project;

import java.util.*;

//FoodOrder-b) - a class consists of functions that do order processing.
public class OrderService {
	private List<Order> orders;

	public OrderService() {
		this.orders = new ArrayList<Order>();
	}

	public Order createOrder(String customerName, String restaurant, String location) {
		int orderId = orders.size() + 1;
		Order order = new Order(orderId, customerName, restaurant, location, new Date());
		orders.add(order);
		return order;
	}

	public List<Order> getOrders() {
		return orders;
	}

	public double getTotalOrderValue() {
		double totalOrderValue = 0;
		for (Order order : orders) {
			double orderValue = 0;
			for (Dish dish : order.getDishes()) {
				orderValue += dish.getRate() * dish.getQuantity();
			}
			order.setOrderValue(orderValue);
			totalOrderValue += orderValue;
		}
		return totalOrderValue;
	}

	public void showOrders() {
		for (Order order : orders) {
			System.out.println("*****************RECEIPT******************");
			System.out.println("----------------Customer Details-----------------");
			System.out.println("Order ID: " + order.getId());
			System.out.println("Customer Name: " + order.getCustomerName());
			System.out.println("Restaurant: " + order.getRestaurant());
			System.out.println("Location: " + order.getLocation());
			System.out.println("Order Date: " + order.getOrderDate());
			System.out.println("------------------Dishes Ordered--------------------");
			System.out.println("Dishes:");
			for (Dish dish : order.getDishes()) {
				System.out.println("\tDish ID: " + dish.getId());
				System.out.println("\tName: " + dish.getName());
				System.out.println("\tDescription: " + dish.getDescription());
				System.out.println("\tType of Dish: " + dish.getTypeofdish());
				System.out.println("\tRate: " + dish.getRate());
				System.out.println("\tQuantity: " + dish.getQuantity());
				System.out.println("-----------------------");
			}
			System.out.println("----------------End Of Order-------------------------");
			System.out.println("===========THANK YOU============");
		}
	}
}
