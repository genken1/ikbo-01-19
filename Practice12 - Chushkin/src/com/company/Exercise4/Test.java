package com.company.Exercise4;

public class Test {
	public static void main(String[] args) {
		String number1 = "+79175655655";
		String number2 = "89175655655";
		PhoneNumber phoneNumber1 = new PhoneNumber(number1);
		PhoneNumber phoneNumber2 = new PhoneNumber(number2);

		System.out.println(phoneNumber1.getNumber());
		System.out.println(phoneNumber2.getNumber());
	}
}
