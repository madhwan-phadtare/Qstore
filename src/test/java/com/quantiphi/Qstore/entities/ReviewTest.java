package com.quantiphi.Qstore.entities;

import org.junit.Test;
import static org.junit.Assert.*;

public class ReviewTest {

    @Test
    public void testReview() {
        // Create a new instance of the Review class
        Review review = new Review();

        // Set the values of the review object
        review.setReviewId("R001");
        review.setUserId("U001");
        review.setProductId("P001");
        review.setReviewMessage("This is a test review.");

        // Assert that the values were set correctly
        assertEquals("R001", review.getReviewId());
        assertEquals("U001", review.getUserId());
        assertEquals("P001", review.getProductId());
        assertEquals("This is a test review.", review.getReviewMessage());
    }
}

