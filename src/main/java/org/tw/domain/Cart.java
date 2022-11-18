package org.tw.domain;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    List<Product> cartItems = new ArrayList<>();

    public void addItem(Product product){
        cartItems.add(product);
    }
}
