package com.company.Exercise3;

public class Shirt {
	Shirt[] arr;
	private final String model;
	private final String label;
	private final String color;
	private final String size;

	public Shirt(String clothesInfo) {
		String[] shirt = clothesInfo.split(",");
		if (shirt.length != 4)
			throw new IllegalStateException("Некорректные данные");
		this.model = shirt[0].trim();
		this.label = shirt[1].trim();
		this.color = shirt[2].trim();
		this.size = shirt[3].trim();
	}

	@Override
	public String toString() {
		return "Shirt{" +
				"model='" + model + '\'' +
				", \nclothes='" + label + '\'' +
				", \ncolor='" + color + '\'' +
				", \nsize='" + size + '\'' +
				'}';
	}
}
