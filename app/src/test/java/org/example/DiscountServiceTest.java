package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class DiscountServiceTest {

    @Test
    void testSave10Discount() {
        DiscountStrategy strategy = new Save10Discount();
        DiscountService service = new DiscountService(strategy);

        double result = service.calculate(100);

        assertEquals(10, result);
    }

    @Test
    void testSave20Discount() {
        DiscountStrategy strategy = new Save20Discount();
        DiscountService service = new DiscountService(strategy);

        double result = service.calculate(100);

        assertEquals(20, result);
    }

    @Test
    void testVipDiscount() {
        DiscountStrategy strategy = new VipDiscount();
        DiscountService service = new DiscountService(strategy);

        double result = service.calculate(100);

        assertEquals(5, result);
    }
}