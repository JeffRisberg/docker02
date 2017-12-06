package com.incra.endpoints;

import com.incra.models.User;
import com.incra.services.UserService;

import javax.inject.Inject;
import javax.inject.Singleton;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
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
@Path("users")
public class UsersEndpoint {

    protected UserService userService;

    @Inject
    public UsersEndpoint(UserService userService) {
        this.userService = userService;
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response handle() {
        List<User> users = userService.getUsers();

        return Response.status(Response.Status.OK).entity(users).build();
    }

    @POST
    public Response handlePost() {
        Object results = "POST UPDATE";

        return Response.status(Response.Status.OK).entity(results).build();
    }
}
