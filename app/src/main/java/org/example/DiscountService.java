package org.example;

public class DiscountService {

    private DiscountStrategy strategy;

    public DiscountService(DiscountStrategy strategy) {
        this.strategy = strategy;
    }

    public double calculate(double subtotal) {
        return strategy.apply(subtotal);
    }
}