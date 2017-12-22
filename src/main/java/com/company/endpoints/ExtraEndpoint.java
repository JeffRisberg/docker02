package com.company.endpoints;

import javax.inject.Inject;
import javax.inject.Singleton;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

/**
 * @author Jeff Risberg
 * @since 12/10/17
 */
@Singleton
@Path("extra")
public class ExtraEndpoint {

    @Inject
    public ExtraEndpoint() {
    }

    @GET
    public Response handle() {
        Object results = "Extra endpoint";
        return Response.status(Response.Status.OK).entity(results).build();
    }
}
