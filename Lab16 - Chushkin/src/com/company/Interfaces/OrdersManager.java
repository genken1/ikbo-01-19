package com.company.Interfaces;

import ru.mirea.lab16.models.MenuItem;

public interface OrdersManager {
	int itemsQuantity(String itemName);

	int itemsQuantity(MenuItem item);

	Order[] getOrders();

	int ordersCostSummary();

	int ordersQuantity();
}
