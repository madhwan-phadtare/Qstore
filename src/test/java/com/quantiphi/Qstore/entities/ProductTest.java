package com.quantiphi.Qstore.entities;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.Arrays;

public class ProductTest {

    // Test case for the Product class
    @Test
    public void testProduct() {
        // Create a new Product object
        Product product = new Product();

        // Set the product's properties
        product.setProductId("P001");
        product.setSellerId("S001");
        product.setProductName("Example Product");
        product.setDescription("This is an example product.");
        product.setCategory("Example Category");
        product.setPrice("10.00");
        product.setAvgRating("4.5");
        product.setImageUrl(Arrays.asList("https://example.com/image1.jpg", "https://example.com/image2.jpg"));
        product.setReviewIds(Arrays.asList("R001", "R002"));
        product.setRatingIds(Arrays.asList("RT001", "RT002"));

        // Verify that the product's properties have been set correctly
        assertEquals("P001", product.getProductId());
        assertEquals("S001", product.getSellerId());
        assertEquals("Example Product", product.getProductName());
        assertEquals("This is an example product.", product.getDescription());
        assertEquals("Example Category", product.getCategory());
        assertEquals("10.00", product.getPrice());
        assertEquals("4.5", product.getAvgRating());
        assertEquals(Arrays.asList("https://example.com/image1.jpg", "https://example.com/image2.jpg"), product.getImageUrl());
        assertEquals(Arrays.asList("R001", "R002"), product.getReviewIds());
        assertEquals(Arrays.asList("RT001", "RT002"), product.getRatingIds());
    }
}
