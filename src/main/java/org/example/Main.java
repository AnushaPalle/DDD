package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Cart cart = new Cart();
        ApplePencil applePencil = new ApplePencil();
        cart.addItem(applePencil);
    }
}