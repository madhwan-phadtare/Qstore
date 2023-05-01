package com.quantiphi.Qstore.entities;


import org.junit.Test;
import static org.junit.Assert.*;

import java.util.Arrays;

public class SellerTest {

    /**
     * Test case for verifying the behavior of the Seller class.
     */
    @Test
    public void testSeller() {
        // Create a new seller object and set its properties
        Seller seller = new Seller();
        seller.setSellerId("S001");
        seller.setSellerName("Example Seller");
        seller.setProducts(Arrays.asList("P001", "P002"));

        // Verify that the seller object's properties were set correctly
        assertEquals("S001", seller.getSellerId());
        assertEquals("Example Seller", seller.getSellerName());
        assertEquals(Arrays.asList("P001", "P002"), seller.getProducts());
    }
}

