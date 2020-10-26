package com.company.Exercise1;

public class Test {
		public static void main(String[] args) {
			Person person1 = new Person("Фамилия", "Имя", "Отчество");
			Person person2 = new Person("Фамилия", "Имя", "");
			Person person3 = new Person("Фамилия", "", "");

			System.out.println(person1.getInfo()+"\n"+person2.getInfo()+"\n"+person3.getInfo());
	}
}
