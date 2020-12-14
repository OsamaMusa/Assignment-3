package com.example.assignment3;

public class Car {
    int model ,image;
    String name , city;
    double price;
    public static final Car[] cars ={
            new Car("BMW","USA",2020,200000,R.drawable.bmw),
            new Car("Audi","Palestine",2018,120000,R.drawable.audi)
    };

    public Car(String name, String city , int model , double price , int image ) {
        this.model = model;
        this.name = name;
        this.city = city;
        this.price = price;
        this.image=image;
    }

    public void setModel(int model) {
        this.model = model;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getModel() {
        return model;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public double getPrice() {
        return price;
    }
}
