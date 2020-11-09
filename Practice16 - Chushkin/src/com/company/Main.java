package com.company;

import com.company.Handlers.InternetOrder;
import com.company.Handlers.RestaurantOrder;
import com.company.Models.Dish;
import com.company.Models.Drink;
import com.company.Models.Item;
import com.company.Models.Order;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		Item dish_1 = new Dish(500, "Puree", "Crumpled potatoes");
		Item dish_2 = new Dish((int) 2050, "Salad olivier", "New Year's salad");
		Item dish_3 = new Dish(2000, "Kebab", "Minced meat on skewers");
		Item dish_4 = new Dish(999, "Pilaf", "Rice with meat");

		Order firstOrder = new RestaurantOrder();
		firstOrder.add(dish_1);
		firstOrder.add(dish_2);
		firstOrder.add(dish_3);
		firstOrder.add(dish_4);
		System.out.println("first order:");
		System.out.println(Arrays.toString(firstOrder.getSortedArray()));


		InternetOrder secondOrder = new InternetOrder();
		secondOrder.add("Volgograd", firstOrder);
		secondOrder.add("Saratov", dish_3);
		secondOrder.add("Saint Petersburg", dish_4);
		System.out.println("second order:");
		secondOrder.getOrders();

		//Вывод информации
		System.out.println(Arrays.toString(firstOrder.getArrayOfNames()));
		System.out.println(Arrays.toString(firstOrder.getArrayOfNames()));
		System.out.println("Amount of first orders: " + firstOrder.numOfOrders());
		System.out.println("Sum of first order: " + firstOrder.getSumPrice());
		firstOrder.delete("Lasagne");
		System.out.println(Arrays.toString(firstOrder.getArrayOfNames()));
		firstOrder.add(dish_3);
		firstOrder.add(dish_3);
		// add more drink01 to test deleting operation
		System.out.println(Arrays.toString(firstOrder.getArrayOfNames()));
		System.out.println("deleted: " + firstOrder.deleteAll("Puree"));
		System.out.println(Arrays.toString(firstOrder.getArrayOfNames()));
	}
}
