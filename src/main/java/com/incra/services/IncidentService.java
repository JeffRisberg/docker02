package com.incra.services;

import com.incra.models.Incident;

import java.util.List;

/**
 * @author Jeff Risberg
 * @since 11/20/17
 */
public interface IncidentService {

    public Incident getOne(Long id);

    public List<Incident> getList(int limit, int offset);
}
