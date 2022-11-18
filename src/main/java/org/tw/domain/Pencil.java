package org.tw.domain;

import java.util.Objects;

public class Pencil implements Product {

    private final String brand;

    public Pencil(String brand) {
        this.brand = brand;
    }

    public void write(){
        //TODO
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pencil pencil = (Pencil) o;
        return Objects.equals(brand, pencil.brand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand);
    }

    @Override
    public String toString() {
        return "Pencil{" +
                "brand='" + brand + '\'' +
                '}';
    }
}
