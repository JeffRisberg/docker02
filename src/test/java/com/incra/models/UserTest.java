package com.incra.models;

public class UserTest extends TestCase {
    @Test
    public void test1() {
        User user = new User();
        assertNotNull(user);
    }
}