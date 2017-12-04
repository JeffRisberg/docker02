package com.incra.endpoints;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 * @author Jeff Risberg
 * @since 11/30/17
 */
@Path("/update")
public class UpdateEndpoint {

    public UpdateEndpoint() {
    }

    @GET
    public void handle() {
        System.out.println("Update handler");
    }
}
