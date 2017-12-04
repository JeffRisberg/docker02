package com.incra.models;

import junit.framework.TestCase;
import org.junit.Test;

public class UserTest extends TestCase {
    @Test
    public void test1() {
        User user = new User();

        user.setFirstName("Jack");
        user.setLastName("Jones");

        assertTrue(user != null);
    }
}