package com.company.Exercise2;

public class Test {
	public static void main(String[] args) {
		String address = "Россия, Воронежский, Воронеж, Кольцовская, 110б, 2, 4";
		String address1 = "Россия. Воронежский. Воронеж. Кольцовская. 110б. 2. 4";
		String address2 = "Россия; Воронежский; Воронеж; Кольцовская; 110б; 2; 4";
		String address3 = "Россия, Воронежский, Воронеж, Кольцовская, 110б, 2, 4";
		System.out.println(new Address(address)+"\n-----");
		System.out.println(new Address(address1, ".")+"\n-----");
		System.out.println(new Address(address2, ";")+"\n-----");
		System.out.println(new Address(address3, ","));
	}
}
