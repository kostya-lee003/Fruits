package com.company;

public class Provider {

    Provider(String fruit) {
        this.fruit = fruit;
    }
    String fruit;

    void get_info() {
        System.out.println(this.fruit);
    }

}
