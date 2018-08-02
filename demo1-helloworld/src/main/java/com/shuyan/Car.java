package com.shuyan;

import lombok.Data;

@Data
public class Car {
    private String name;
    private int price;
    private int age;

    public Car(){

    }

    public Car(String name, int price, int age) {
        this.name = name;
        this.price = price;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", age=" + age +
                '}';
    }
}
