package com.incra.endpoints;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

/**
 * @author Jeff Risberg
 * @since 11/30/17
 */
@Path("/update")
public class UpdateEndpoint {

    public UpdateEndpoint() {
    }

    @GET
    public Response handle() {
        Object results = "GET UPDATE";

        return Response.status(Response.Status.OK).entity(results).build();
    }

    @POST
    public Response handlePost() {
        Object results = "POST UPDATE";

        return Response.status(Response.Status.OK).entity(results).build();
    }
}
