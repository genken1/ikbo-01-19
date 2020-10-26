package com.company.Exercise2;

import java.util.StringTokenizer;

public class Address {
	private final String country;
	private final String region;
	private final String city;
	private final String street;
	private final String house;
	private final String housing;
	private final String apartment;

	public Address(String addressInfo) {
		String[] address = addressInfo.split(",");
		if (address.length != 7)
			throw new IllegalStateException("Некорректные данные");
		this.country = address[0].trim();
		this.region = address[1].trim();
		this.city = address[2].trim();
		this.street = address[3].trim();
		this.house = address[4].trim();
		this.housing = address[5].trim();
		this.apartment = address[6].trim();
	}

	public Address(String address, String delimiter) {
		StringTokenizer response = new StringTokenizer(address, delimiter);
		if (response.countTokens() != 7)
			throw new IllegalStateException("Некорректные данные");
		this.country = response.nextToken().trim();
		this.region = response.nextToken().trim();
		this.city = response.nextToken().trim();
		this.street = response.nextToken().trim();
		this.house = response.nextToken().trim();
		this.housing = response.nextToken().trim();
		this.apartment = response.nextToken().trim();
	}

	@Override
	public String toString() {
		return "Address{" +
				"country='" + country + '\'' +
				", \nregion='" + region + '\'' +
				", \ncity='" + city + '\'' +
				", \nstreet='" + street + '\'' +
				", \nhouse='" + house + '\'' +
				", \nhousing='" + housing + '\'' +
				", \napartment='" + apartment + '\'' +
				'}';
	}
}
