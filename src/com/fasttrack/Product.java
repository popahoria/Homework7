package com.fasttrack;

public class Product {
    private String name;
    private double price;
    private int quantity;
    private String category;

    private boolean open;

    public Product(String name, double price, int quantity, String category) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.category = category;
    }

    public String getName() {
        return this.name;
    }

    public double getPrice() {
        return this.price;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public String getCategory() {
        return this.category;
    }

    public boolean hasStock() {
        return this.quantity > 0;
    }

    public boolean isCategory(String category) {
        return this.category == category;
    }

    @Override
    public String toString() {
        return "For " + this.name +
                " the price is " + this.price + " $" +
                " and there are " + this.quantity + " left";
    }
}
