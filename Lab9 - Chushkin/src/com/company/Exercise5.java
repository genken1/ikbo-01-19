package com.company;

public class Exercise5 {
    public static void main(String[] args) {
        getDetails(null);
    }

    public static void getDetails(String key) {
        if (key == null) {
            throw new NullPointerException("null key in getDetails");
        }
        try{
            System.out.println(Integer.parseInt(key));
        }catch (NumberFormatException e){
            e.printStackTrace();
        }finally {
            System.out.println("Ваш ключ = "+key);
        }
    }
}
