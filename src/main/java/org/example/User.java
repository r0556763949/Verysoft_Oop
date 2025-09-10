package org.example;

import java.util.List;

//  ממשק שמייצג משתמש בחנות.
//  כל משתמש חייב לממש את המתודות הבסיסיות:
public interface User {
    String getUsername();
    void addProductToCart(Product product);
    List<Product> getCartContents();

}
