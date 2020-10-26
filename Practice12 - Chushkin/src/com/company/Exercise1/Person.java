package com.company.Exercise1;

public class Person {
	private final String name;
	private final String lastName;
	private final String patronymic;

	public Person(String lastName, String name, String patronymic) {
		this.name = name;
		this.lastName = lastName;
		this.patronymic = patronymic;
	}

	public String getInfo() {
		return new StringBuilder(lastName)
				.append((name != null ? " " + name : ""))
				.append((patronymic != null ? " " + patronymic : "")).toString();
	}
}
