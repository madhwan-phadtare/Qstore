package com.quantiphi.Qstore.entities;

import org.junit.Test;
import static org.junit.Assert.*;

public class RatingTest {

    @Test
    public void testRating() {
        // Create a new rating object
        Rating rating = new Rating();
        rating.setRatingId("R001");
        rating.setUserId("U001");
        rating.setProductId("P001");
        rating.setScore("4");

        // Test the getter methods
        assertEquals("R001", rating.getRatingId());
        assertEquals("U001", rating.getUserId());
        assertEquals("P001", rating.getProductId());
        assertEquals("4", rating.getScore());

        // Test changing the values using the setter methods
        rating.setRatingId("R002");
        rating.setUserId("U002");
        rating.setProductId("P002");
        rating.setScore("3");

        // Test the getter methods after changing the values
        assertEquals("R002", rating.getRatingId());
        assertEquals("U002", rating.getUserId());
        assertEquals("P002", rating.getProductId());
        assertEquals("3", rating.getScore());
    }
}
