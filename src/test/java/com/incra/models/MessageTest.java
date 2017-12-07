package com.incra.models;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class MessageTest {
    @Test
    public void test1() {
        Message message  = new Message();

        message.setId(1L);
        message.setSender("jack@gmail.com");
        message.setText("Please check the network firewall status");

        assertTrue(message != null);
    }
}