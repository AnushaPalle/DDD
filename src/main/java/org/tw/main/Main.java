package org.tw.main;

import org.tw.domain.ApplePencil;
import org.tw.domain.Cart;
import org.tw.domain.SonyWirelessHeadPhone;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Cart cart = new Cart();
        ApplePencil applePencil = new ApplePencil();
        cart.addItem(applePencil);
        SonyWirelessHeadPhone sonyWirelessHeadPhone = new SonyWirelessHeadPhone();
        cart.addItem(sonyWirelessHeadPhone);
    }
}