package org.tw.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Cart {
    List<Item> cartItems = new ArrayList<>();
    List<Product> cartItemsRemoved = new ArrayList<>();


    public void addItem(Item item){
        cartItems.add(item);
    }

    public void removeItem(Item item){
//        cartItems.stream().filter(item1 -> item1.equals(item)).
//     cartItems.stream().map(item1 -> {
//            item1.equals(item);
//            cartItems.remove(item1);
//        }).collect(Collectors.toList());

        for(Item item1 : cartItems){
            if(item1.equals(item)){
                cartItemsRemoved.add(item.getProduct());
                cartItems.remove(item);
            }
        }
    }

    public List<Product> getCartItemsRemoved() {
        return cartItemsRemoved;
    }
}
