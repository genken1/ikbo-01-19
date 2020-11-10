package com.company.Interfaces;

import com.company.Models.MenuItem;

public interface OrdersManager {
	int itemsQuantity(String itemName);

	int itemsQuantity(MenuItem item);

	Order[] getOrders();

	int ordersCostSummary();

	int ordersQuantity();
}
