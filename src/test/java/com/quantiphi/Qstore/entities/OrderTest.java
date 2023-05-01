package com.quantiphi.Qstore.entities;

import org.junit.Test;
import static org.junit.Assert.*;

import java.time.LocalDateTime;
import java.util.Arrays;

public class OrderTest {

    @Test
    public void testOrder() {
        // Create a new Order object and set its properties
        Order order = new Order();
        order.setOrderId("O001");
        order.setOrderStatus("PAID");
        order.setAmount("100.00");
        order.setDateTime(LocalDateTime.now());
        order.setProductIds(Arrays.asList("P001", "P002"));

        // Assert that the values of the Order object's properties are set correctly
        assertEquals("O001", order.getOrderId());
        assertEquals("PAID", order.getOrderStatus());
        assertEquals("100.00", order.getAmount());
        assertNotNull(order.getDateTime());
        assertEquals(Arrays.asList("P001", "P002"), order.getProductIds());
    }
}

