package com.incra.services;

import com.incra.models.Incident;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Jeff Risberg
 * @since 11/20/17
 */
public class DefaultIncidentService implements IncidentService {

    public List<Incident> getAll() {
        List<Incident> results = new ArrayList<Incident>();
        Incident incident;

        incident = new Incident(2L, "Account update required",
            "Click on Update link, follow instructions", "Medium");
        results.add(incident);

        incident = new Incident(3L, "No response within timeout interval",
            "Check the network wiring, check for firewall configuration", "Medium");
        results.add(incident);

        incident = new Incident(4L, "Unable to install new application",
            "Check your password for the Apple App Store", "Medium");
        results.add(incident);

        return results;
    }
}
