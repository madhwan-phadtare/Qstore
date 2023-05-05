package com.quantiphi.Qstore.entities;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;


public class CartTest {

    @Test
    public void testCart() {
        // Create a new Cart object and set its properties
        Cart cart = new Cart();
        cart.setCartId("C001");
        cart.setProductIds(Arrays.asList("P001", "P002"));

        // Check that the values were set correctly
        assertEquals("C001", cart.getCartId());
        assertEquals(Arrays.asList("P001", "P002"), cart.getProductIds());
    }
}

