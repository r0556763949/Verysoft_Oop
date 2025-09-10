package org.example;

import java.util.ArrayList;
import java.util.List;

//  משתמש פרימיום בחנות.
// * מקבל הנחה של 10% על כל המוצרים.
public class PremiumUser implements User{
    private String membershipLevel;
    private String username;//בעיקרון אין אבל חייב בשביל מימוש ההחזרה
    private List<Product> cart = new ArrayList<>();

    public PremiumUser(String membershipLevel, String username) {
        this.username = username;
        this.membershipLevel = membershipLevel;
        this.cart = new ArrayList<>();
    }

    @Override
    public String getUsername() {
        return username;
    }

    @Override
    public void addProductToCart(Product product) {
        //כאן עשיתי פתרון זמני, לא ידעתי אם עובר להוסיף מחלקות - נדבר על זה בראיון...
        Product discounted = new Product(product.getProductId(), product.getName(), product.getPrice() * 0.9) {//בהנחה שההנחה היא 10 אחוז
            @Override
            public String getDescription() {
                return product.getDescription() + " (Discounted)";
            }
        };
        cart.add(discounted);
    }

    @Override
    public List<Product> getCartContents() {
        return cart;
    }
}
