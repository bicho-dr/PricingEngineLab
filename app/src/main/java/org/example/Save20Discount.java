package org.example;

public class Save20Discount implements DiscountStrategy {
    public double apply(double subtotal) {
        return subtotal * 0.2;
    }
}