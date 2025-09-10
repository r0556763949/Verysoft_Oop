package org.example;

import java.util.ArrayList;
import java.util.List;

public class RegularUser implements User{

    private String username;
    private List<Product> cart = new ArrayList<>();

    public RegularUser(String username) {
        this.username = username;
    }

    @Override
    public String getUsername() {
        return username;
    }

    @Override
    public void addProductToCart(Product product) {
        cart.add(product);
    }

    @Override
    public List<Product> getCartContents() {
        return cart;
    }

}

