package org.example;

public class Clothing extends Product{
    private String size;
    public Clothing(String productId, String name, double price, String size) {
        super(productId, name, price);
        this.size = size;
    }
    @Override
    public String getDescription() {
        return "Clothing: " + getName() +
                ", Price: " + getPrice() +
                ", Size: " + size;
    }

}
