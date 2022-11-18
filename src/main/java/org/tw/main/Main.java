package org.tw.main;

import org.tw.domain.*;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Cart cart = new Cart();
        Pencil applePencil = new Pencil("Apple");
        cart.addItem(new Item(applePencil));
        HeadPhone sonyWirelessHeadPhone = new HeadPhone("sony",true);
        cart.addItem(new Item(sonyWirelessHeadPhone,1));
        List<Product> cartItemsRemoved = cart.getCartItemsRemoved();
        System.out.println(cartItemsRemoved);
    }
}