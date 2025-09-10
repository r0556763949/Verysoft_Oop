package org.example;

public class ECommerceSystem {
    public static void main(String[] args) {

        Product phone1 = new Electronics("E001", "4X4", 200, 5);
        Product phone2 = new Electronics("E002", "5X5", 300, 5);
        Product shirt1 = new Clothing("C001", "T-Shirt", 100, "M");
        Product shirt2 = new Clothing("C002", "T-Shirt", 100, "L");

        User regular = new RegularUser("Gili");
        User premium = new PremiumUser("Basic", "Ruth");

        regular.addProductToCart(phone1);
        regular.addProductToCart(shirt1);

        premium.addProductToCart(phone2);
        premium.addProductToCart(shirt2);

        System.out.println("Regular User Cart:");
        regular.getCartContents()
                .forEach(p -> System.out.println(p.getDescription()));

        System.out.println("\nPremium User Cart:");
        premium.getCartContents()
                .forEach(p -> System.out.println(p.getDescription()));
    }

}
