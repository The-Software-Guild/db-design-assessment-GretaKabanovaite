package com.sg.classesAndObjects.exercise.classModeling;

public class IceCream {
    //part of the control system at a factory
    private int id;
    private String name;
    private String packaging;
    private String model;

    public IceCream(int id, String name, String packaging, String model) {
        this.id = id;
        this.name = name;
        this.packaging = packaging;
        this.model = model;
    }

    public void makeIceCream(int count){}

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPackaging() {
        return packaging;
    }

    public String getModel() {
        return model;
    }

    //part of the stocking system at grocery shop
    private int prodId;
    private int qty;
    private String prodName;
    private String company;
    private double price;

    public IceCream(int prodId, int qty, String prodName, String company, double price) {
        this.prodId = prodId;
        this.setQty(qty);
        this.prodName = prodName;
        this.company = company;
        this.setPrice(price);
    }
    public void setDiscount(int percentage){}

    public int getProdId() {
        return prodId;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public String getProdName() {
        return prodName;
    }

    public String getCompany() {
        return company;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
