package com.incra.endpoints;

import com.google.inject.Inject;
import com.incra.services.IncidentService;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

/**
 * @author Jeff Risberg
 * @since 11/30/17
 */
@Path("/incidents")
public class IncidentEndpoint {

    protected IncidentService incidentService;

    @Inject
    public IncidentEndpoint(IncidentService incidentService) {
        this.incidentService = incidentService;
    }

    @GET
    public Response handle() {
        Object results = "Incident report";
        return Response.status(Response.Status.OK).entity(results).build();
    }
}
