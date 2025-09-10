package org.example;

//מחלקה שמייצגת מוצר אלקטרוני.
public class Electronics extends Product{
    private int warrantyPeriod;// תקופת האחריות בחודשים

    public Electronics(String productId, String name, double price, int warrantyPeriod) {
        super(productId, name, price);
        this.warrantyPeriod = warrantyPeriod;
    }

    @Override
    public String getDescription() {
        return "Electronics: " + getName() +
                ", Price: " + getPrice() +
                ", Warranty: " + warrantyPeriod + " months";
    }

}
