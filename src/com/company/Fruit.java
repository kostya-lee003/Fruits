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

    void reduce_weight(int temperature, int cold, int room_temp) {
        if (temperature < 5) {
            this.weight = weight - cold;
        } else {
            this.weight = weight - room_temp;
        }
    }

    void dry(String sort) {

        switch (sort) {
            case "Big":
                reduce_weight (4, 10, 20);
                break;
            case "Juicy":
                reduce_weight(5, 15, 30);
                break;
            case "Sour":
                reduce_weight(3, 20, 20);
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
