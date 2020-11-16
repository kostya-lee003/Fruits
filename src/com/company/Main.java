package com.company;

public class Main {

    public static void main(String[] args) {

        Apple apple = new Apple(150, "green");
        Orange orange = new Orange(170, "orange");

        apple.dry("Sour", 3);
        System.out.println(apple.weight);

    }
}
