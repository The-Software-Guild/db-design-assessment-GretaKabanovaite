package com.sg.classesAndObjects.exercise.classModeling;

public class House {
    //For the GPS mapping system
    private String address;
    private int floorNr;

    public String getAddress(){
        return address;
    } public int getFloorCount(){
        return floorNr;
    }
    public House(String address){
        this(address, 1);
    }
    public House(String address, int floorCount){
        this.address = address;
        this.setFloorCount(floorCount);
    }

    public void showOnMap(){};

    //For the 3D modelling system
    private int width;
    private int height;
    private int length;
    private int floorCount;
    private int roomCount;

    public House(int width, int height, int length, int floorCount, int roomCount){
        setWidth(width);
        setHeight(height);
        setLength(length);
        setFloorCount(floorCount);
        setRoomCount(roomCount);
    }
    public House(int width, int height, int length) {
        this(width,height, length, 1, 0);
    }
    public House(int width, int height, int length, int floorCount){
        this(width, height, length, floorCount, 0);
    }

    public int getWidth(){
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setFloorCount(int floorCount) {
        this.floorCount = floorCount;
    }

    public int getRoomCount() {
        return roomCount;
    }

    public void setRoomCount(int roomCount) {
        this.roomCount = roomCount;
    }

    public void drawHouse(){};
}
