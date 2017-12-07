package com.incra.models;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class IncidentTest {
    @Test
    public void test1() {
        Incident incident = new Incident();

        incident.setId(1L);
        incident.setTitle("I cannot log in");
        incident.setDescription("No response");
        incident.setSeverity("High");

        assertTrue(incident != null);
    }
}