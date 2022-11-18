package org.tw.domain;

import java.util.Objects;

public class HeadPhone implements Product{
    private String brand;
    private boolean isWireless;

    public HeadPhone(String brand) {
        this.brand = brand;
    }

    public HeadPhone(String brand, boolean isWireless) {
        this.brand = brand;
        this.isWireless = isWireless;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HeadPhone headPhone = (HeadPhone) o;
        return isWireless == headPhone.isWireless && Objects.equals(brand, headPhone.brand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, isWireless);
    }

    @Override
    public String toString() {
        return "HeadPhone{" +
                "brand='" + brand + '\'' +
                ", isWireless=" + isWireless +
                '}';
    }
}
