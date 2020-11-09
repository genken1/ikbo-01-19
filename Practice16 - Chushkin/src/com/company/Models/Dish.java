package com.company.Models;

public final class Dish implements Item {
	private final int cost;
	private final String name;
	private final String description;

	public Dish(String name, String description) {
		cost = 0;
		this.name = name;
		this.description = description;
	}

	public Dish(int cost, String name, String description) {
		this.cost = cost;
		this.name = name;
		this.description = description;
	}


	@Override
	public int getCost() {
		return 0;
	}

	@Override
	public String getName() {
		return null;
	}

	@Override
	public String getDescription() {
		return null;
	}
}
