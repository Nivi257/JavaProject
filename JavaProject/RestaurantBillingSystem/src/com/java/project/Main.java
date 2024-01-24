package com.java.project;

import java.util.Date;

public class Main {

	public static void main(String[] args) {
		// Create an instance of OrderService
		OrderService orderService = new OrderService();

		// Create a new order
		Order order1 = orderService.createOrder("John Doe", "ABC Restaurant", "123 Main St");

		// Add dishes to the order
		Dish dish1 = new Dish(1, "Veggie Pizza", "Delicious veggie pizza", DishTypes.VEG, 15.99, 2);
		Dish dish2 = new Dish(2, "Chicken Burger", "Tasty chicken burger", DishTypes.NON_VEG, 10.99, 1);
		order1.addDish(dish1);
		order1.addDish(dish2);

		// Create another order
		Order order2 = orderService.createOrder("Jane Smith", "XYZ Restaurant", "456 Oak St");

		// Add dishes to the second order
		Dish dish3 = new Dish(3, "Pasta Alfredo", "Creamy pasta with Alfredo sauce", DishTypes.VEG, 12.99, 3);
		Dish dish4 = new Dish(4, "Beef Steak", "Juicy beef steak", DishTypes.NON_VEG, 20.99, 1);
		order2.addDish(dish3);
		order2.addDish(dish4);

		// Display all orders
		orderService.showOrders();

		// Get total order value
		double totalOrderValue = orderService.getTotalOrderValue();
		System.out.println("Total Order Value: $" + totalOrderValue);
	}
}
