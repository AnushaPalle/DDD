package org.example;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    List<Object> cartItems = new ArrayList<>();

    public void addItem(Object object){
        cartItems.add(object);
    }
}
