package com.company.Handlers;

import com.company.Models.Item;
import com.company.Models.Order;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class InternetOrder extends OrderManager {
	private HashMap<String, Order> orders;

	public InternetOrder() {
		this.orders = new HashMap<>();
	}

	public boolean add(String address, Order order) {
		orders.put(address, order);
		return true;
	}

	public Order getOrder(String address) {
		for (Map.Entry<String, Order> entry : orders.entrySet()) {
			if (address.equals(entry.getKey())) {
				return entry.getValue();
			}
		}

		return null;
	}

	public boolean delete(String address) {
		orders.computeIfPresent(address, (key, value) -> orders.remove(key));
		return true;
	}

	public boolean add(String address, Item item) {
		Order order = getOrder(address);

		if (order == null) {
			order = new OrderManager();
			order.add(item);
			orders.put(address, order);
			return true;
		}

		return getOrder(address).add(item);
	}

	public void getOrders() {
		orders.entrySet().forEach(el -> System.out.println(el.getKey() + ": " + Arrays.toString(el.getValue().getSortedArray())));
	}
}
