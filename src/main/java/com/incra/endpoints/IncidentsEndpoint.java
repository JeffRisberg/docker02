package com.incra.endpoints;

import com.google.inject.Singleton;
import com.incra.models.Incident;
import com.incra.services.IncidentService;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

/**
 * @author Jeff Risberg
 * @since 11/30/17
 */
@Singleton
@Path("incidents")
public class IncidentsEndpoint {

    protected IncidentService incidentService;

    @Inject
    public IncidentsEndpoint(IncidentService incidentService) {
        this.incidentService = incidentService;
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response handle() {
        List<Incident> incidents = incidentService.getAll();

        return Response.status(Response.Status.OK).entity(incidents).build();
    }
}
