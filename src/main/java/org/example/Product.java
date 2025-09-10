package org.example;

// מחלקה אבסטרקטית המייצגת מוצר כללי בחנות.
public abstract class Product {
    private String productId;
    private String name;
    protected double price;

    public Product(String productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    public String getProductId() {
        return productId;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    // מחלקות יורשות חייבות לממש את המתודה הזו
    public abstract String getDescription();

}
