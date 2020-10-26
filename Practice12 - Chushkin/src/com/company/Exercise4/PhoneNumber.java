package com.company.Exercise4;

public class PhoneNumber {
	private String number;

	public PhoneNumber(String number) {
		String regexAllCountry = "^(\\+\\d{1,3}\\d{10})";
		String regexRussia = "(8\\d{10})$";
		if (number.matches(regexAllCountry)) {
			this.number = new StringBuilder(number).insert(number.length() - 4, '-').insert(number.length() - 7, '-').toString();
		}
		if (number.matches(regexRussia)) {
			this.number = new StringBuilder(number).insert(number.length() - 4, '-').insert(number.length() - 7, '-').toString();
		}
	}

	public String getNumber() {
		return number;
	}
}
