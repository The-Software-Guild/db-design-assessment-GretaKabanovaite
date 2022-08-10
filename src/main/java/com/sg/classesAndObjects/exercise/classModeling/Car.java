package com.sg.classesAndObjects.exercise.classModeling;

import java.time.LocalDate;

public class Car {
    //part of an inventory system for a car dealership
    private int id;
    private double price;
    private LocalDate receivedDate;
    private boolean isUsed;
    private LocalDate manufacturedDate;
    private String colour;

    public Car(int id, double price, LocalDate receivedDate, boolean isUsed, LocalDate manufacturedDate, String colour) {
        this.id = id;
        setPrice(price);
        this.receivedDate = receivedDate;
        this.isUsed = isUsed;
        this.manufacturedDate = manufacturedDate;
        setColour(colour);
    }
    public Car(int id, LocalDate manufacturedDate, String colour){
        this(id, 0.0, LocalDate.now(), false, manufacturedDate, colour);
    }
    public void setPriceWithDiscount(double price, int percent) {}

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getId() {
        return id;
    }

    public LocalDate getReceivedDate() {
        return receivedDate;
    }

    public boolean isUsed() {
        return isUsed;
    }

    public LocalDate getManufacturedDate() {
        return manufacturedDate;
    }

    //part of a video game
    private String name;
    private int maxSpeed;
    private double accelerationRate;
    private int maxHealth;
    private int health;
    private String carColour;

    public Car(String name, int maxSpeed, double accelerationRate, int maxHealth, String carColour){
        this.name = name;
        this.maxSpeed = maxSpeed;
        this.accelerationRate = accelerationRate;
        this.maxHealth = maxHealth;
        this.setHealth(maxHealth);
    }

    public void getHit(int dmg){}
    public void explode(){}
    public void repair(){}

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public String getCarColour() {
        return carColour;
    }

    public void setCarColour(String carColour) {
        this.carColour = carColour;
    }

    public String getName() {
        return name;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public double getAccelerationRate() {
        return accelerationRate;
    }

    public int getMaxHealth() {
        return maxHealth;
    }
}
