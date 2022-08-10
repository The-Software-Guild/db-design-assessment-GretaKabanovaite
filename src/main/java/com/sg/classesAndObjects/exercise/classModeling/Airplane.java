package com.sg.classesAndObjects.exercise.classModeling;

public class Airplane {
    //part of an air traffic control system
    private double positionX;
    private double positionY;
    private double positionZ;
    private int id;
    private String name;
    private String companyName;
    private int capacity;

    public Airplane(int id, String name, String companyName, int capacity) {
        this.id = id;
        this.name = name;
        this.companyName = companyName;
        this.capacity = capacity;
    }

    public void sendMessage(String text){};

    public Airplane(int id){
        this(id, null, null, 0);
    }

    public String getPosition() {
        return positionX + "x" + positionY + "x" + positionZ;
    }

    public void setPositionX(double positionX) {
        this.positionX = positionX;
    }

    public void setPositionY(double positionY) {
        this.positionY = positionY;
    }

    public void setPositionZ(double positionZ) {
        this.positionZ = positionZ;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCompanyName() {
        return companyName;
    }

    public int getCapacity() {
        return capacity;
    }


    //part of a flight simulator
    private double speed;
    private double accelerationRate;
    private int healthMax;
    private int health;

    public Airplane(double accelerationRate, int healthMax){
        this.accelerationRate = accelerationRate;
        this.healthMax = healthMax;
        this.health = healthMax;
    }

    public Airplane(double accelerationRate) {
        this(accelerationRate, 100);
    }

    public void getHit(){}
    public void crash(){}
    public void control(){}

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public double getAccelerationRate() {
        return accelerationRate;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getHealthMax() {
        return healthMax;
    }
}
