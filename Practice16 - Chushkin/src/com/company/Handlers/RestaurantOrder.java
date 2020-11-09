package com.company.Handlers;


import com.company.Models.Item;

import java.util.Collection;

public class RestaurantOrder extends OrderManager {
	public RestaurantOrder() {
	}

	public RestaurantOrder(Collection<Item> collection) {
		super(collection);
	}
}
