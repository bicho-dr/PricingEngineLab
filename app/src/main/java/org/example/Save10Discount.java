package org.example;

public class Save10Discount implements DiscountStrategy {
    public double apply(double subtotal) {
        return subtotal * 0.1;
    }
}