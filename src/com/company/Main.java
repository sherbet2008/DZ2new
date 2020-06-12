package com.company;


import java.util.Random;

public class Main {
    public static void main(String[] args) {


        Random();
        System.out.println( weather(33,33));
        System.out.println( weather(  4, 22));
        System.out.println( weather(44, 17 ));
        System.out.println( weather(33, 22));
        System.out.println( weather(15, 30));
    }

    public static String weather(int age, int temperature) {
        if (age >= 20 && age < 45 || temperature >= -28 && temperature < 38) {
            System.out.println(" Можно идти гулять ");
        } else if (age < 20 || temperature >= 0 && temperature < 28) {
            System.out.println(" Можно идти гулять ");
        } else if (age > 45 || temperature >= -10 && temperature < 20) {
            System.out.println(" Можно идти гулять ");
        } else {
            System.out.println(" Остовайтесь дома ");

        }
        return " лет " + age + " Температура " + temperature;
    }

    public static void Random() {
        Random random = new Random();


        int random_number1 = random.nextInt(50) + 1;

        System.out.println(" Можно ли идти гулять? " + random_number1);


    }
}

