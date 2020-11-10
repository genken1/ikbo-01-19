package com.company.Handlers;

import com.company.DoublyLinkedList;
import com.company.Models.Item;
import com.company.Models.Order;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;

public class OrderManager implements Order {
	private DoublyLinkedList<Item> data;

	public OrderManager() {
		this.data = new DoublyLinkedList<>();
	}

	public OrderManager(Collection<Item> collection) {
		this.data = new DoublyLinkedList<>(collection);
	}

	@Override
	public boolean add(Item item) {
		return data.add(item);
	}

	@Override
	public boolean delete(String name) {
		Item item = Arrays.stream(
				data.toArray())
				.filter(i -> i.getName().equals(name))
				.findFirst()
				.orElse(null);
		if (item == null)
			return false;
		return data.remove(item);
	}

	@Override
	public int deleteAll(String name) {
		return (int) Arrays.stream(
				data.toArray())
				.filter(i -> i.getName().equals(name))
				.map(el -> data.remove(el))
				.count();
	}

	@Override
	public int numOfOrders() {
		return data.getSize();
	}

	@Override
	public Object[] getArray() {
		return data.toArray();
	}

	@Override
	public double getSumPrice() {
		return (int) Arrays.stream(
				data.toArray())
				.mapToDouble(Item::getCost)
				.sum();
	}

	@Override
	public Object[] getArrayOfNames() {
		return  Arrays.stream(
				data.toArray())
				.map(Item::getName)
				.toArray();
	}

	@Override
	public Object[] getSortedArray() {
		return Arrays.stream(
				data.toArray())
				.sorted(Comparator.comparing(Item::getCost))
				.toArray();
	}
}
