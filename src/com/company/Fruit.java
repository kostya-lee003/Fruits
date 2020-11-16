package com.company;

public class Fruit {

    String sorts[] = {"Big", "Juicy", "Sour"};
    Provider providers[] = {new Provider("Apple"), new Provider("Banana")};
    int weight;
    String colour;

    Fruit(int weight, String colour) {
        this.weight = weight;
        this.colour = colour;
    }

    void setWeight(int weight) {
        this.weight = weight;
    }

    void setColour(String colour) {
        this.colour = colour;
    }

    void dry(String sort, int temperature) {

        switch (sort) {
            case "Big":
                if (temperature < 5) {
                    this.weight = weight - 10;
                } else {
                    this.weight = weight - 20;
                }
                break;
            case "Juicy":
                if (temperature < 5) {
                    this.weight = weight - 15;
                } else {
                    this.weight = weight - 25;
                }
                break;
            case "Sour":
                if (temperature < 5) {
                    this.weight = weight - 20;
                } else {
                    this.weight = weight - 22;
                }
                break;
        }

    }

    void get_providers(int number) {
        if (number <= providers.length) {
            for (int i = 0; i < number; i++) {
                providers[i].get_info();
            }
        } else {
            System.out.println("Too many providers");
        }
    }
}
