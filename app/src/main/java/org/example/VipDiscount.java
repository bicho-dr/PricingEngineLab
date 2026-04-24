package org.example;

public class VipDiscount implements DiscountStrategy {
    public double apply(double subtotal) {
        return subtotal * 0.05;
    }
}