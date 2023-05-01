package com.quantiphi.Qstore.entities;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.Arrays;

public class UserTest {

    // Test case for the User class
    @Test
    public void testUser() {
        // Create a new User object
        User user = new User();

        // Set the user's properties
        user.setUserId("U001");
        user.setCartId("C001");
        user.setName("John Doe");
        user.setEmailId("johndoe@example.com");
        user.setOrderIds(Arrays.asList("O001", "O002"));

        // Verify that the user's properties have been set correctly
        assertEquals("U001", user.getUserId());
        assertEquals("C001", user.getCartId());
        assertEquals("John Doe", user.getName());
        assertEquals("johndoe@example.com", user.getEmailId());
        assertEquals(Arrays.asList("O001", "O002"), user.getOrderIds());
    }
}
