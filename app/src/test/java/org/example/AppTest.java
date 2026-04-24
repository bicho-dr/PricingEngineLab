package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {

    @Test
    void testBasicCalculation() {

        double[] prices = {100, 50, 30};
        int[] quantities = {1, 2, 3};

        String customerType = "VIP";
        String discountCode = "SAVE10";

        double subtotal = 0;

        for (int i = 0; i < prices.length; i++) {
            subtotal += prices[i] * quantities[i];
        }

        double discount = 0;

        if (discountCode.equals("SAVE10")) {
            discount = subtotal * 0.1;
        } else if (discountCode.equals("SAVE20")) {
            discount = subtotal * 0.2;
        }

        if (customerType.equals("VIP")) {
            discount += subtotal * 0.05;
        }

        double tax = (subtotal - discount) * 0.19;

        double finalPrice = subtotal - discount + tax;

        assertTrue(subtotal > 0);
        assertTrue(finalPrice > 0);
        assertTrue(tax >= 0);
    }
}