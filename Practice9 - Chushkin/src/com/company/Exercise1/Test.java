package com.company.Exercise1;

public class Test {
    public static void main(String[] args) throws INNException {
        User user1 = new User("Александр", "Александрович", "Грин", "123456789123");
        User user2 = new User("Виктор", "Генадьевич", "Москвин", "45646111111");

        Shop shop = new Shop();
        System.out.println(shop.isUser(user1));
        System.out.println(shop.isUser(user2));
    }
}
