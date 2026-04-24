package org.example;

import org.example.DiscountService;
import org.example.TaxService;

public class App {

    public static void main(String[] args) {

        double[] prices = {100, 50, 30};
        int[] quantities = {1, 2, 3};

        String customerType = "VIP";
        String discountCode = "SAVE10";

        double subtotal = 0;

        for (int i = 0; i < prices.length; i++) {
            subtotal += prices[i] * quantities[i];
        }

        double discount = DiscountService.calculateDiscount(subtotal, discountCode, customerType);
        double tax = TaxService.calculateTax(subtotal - discount);

        double finalPrice = subtotal - discount + tax;

        System.out.println("Subtotal: " + subtotal);
        System.out.println("Discount: " + discount);
        System.out.println("Tax: " + tax);
        System.out.println("Final Price: " + finalPrice);
    }
}