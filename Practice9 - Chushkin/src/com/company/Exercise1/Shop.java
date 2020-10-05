package com.company.Exercise1;

import java.util.ArrayList;

public class Shop {
    private final ArrayList<User> data;

    public Shop() {
        data = new ArrayList<>();
        initUser();
    }


    private void initUser() {
        data.add(new User("Александр", "Александрович", "Грин", "123456789123"));
        data.add(new User("Виктор", "Генадьевич", "Москвин", "111111111111"));
    }

    public boolean isUser(User user) throws INNException {
        for(User u : data)
            if(u.getName().equals(user.getName()) && u.getLastName().equals(user.getLastName()) && u.getPatronymic().equals(user.getPatronymic()) && u.getInn().equals(user.getInn())){
                return true;
            }
        throw new INNException();
    }
}
