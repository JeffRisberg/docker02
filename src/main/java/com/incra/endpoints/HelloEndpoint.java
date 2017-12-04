package com.incra.endpoints;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 * @author Jeff Risberg
 * @since 11/30/17
 */
@Path("/hello")
public class HelloEndpoint {

    public HelloEndpoint() {
    }

    @GET
    public void handle() {
        System.out.println("handle");
    }
}
