package com.incra.endpoints;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

/**
 * @author Jeff Risberg
 * @since 11/30/17
 */
@Path("/incident")
public class IncidentEndpoint {

    public IncidentEndpoint() {
    }

    @GET
    public Response handle() {
        Object results = "Incident report";
        return Response.status(Response.Status.OK).entity(results).build();
    }
}
