package com.company.endpoints;

import com.company.models.Incident;
import com.company.models.Message;
import com.company.services.IncidentService;
import com.company.services.MessageService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.inject.Inject;
import javax.inject.Singleton;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

/**
 * @author Jeff Risberg
 * @since 11/30/17
 */
@Singleton
@Path("messages")
public class MessagesEndpoint {
    private static final Logger logger = LoggerFactory.getLogger(MessagesEndpoint.class);

    protected MessageService messageService;

    @Inject
    public MessagesEndpoint(MessageService messageService) {
        this.messageService = messageService;
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response handleOne() {
        List<Message> messages = messageService.getList(0, 999);

        return Response.status(Response.Status.OK).entity(messages).build();
    }

    @GET
    @Path("{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response handleMany(@PathParam("id") Long id) {
        Message message = messageService.getOne(id);

        return Response.status(Response.Status.OK).entity(message).build();
    }

    @POST
    @Path("{sender}/{text}")
    public Response handlePost(String sender, String text) {
        Message message = messageService.create(sender, text);

        return Response.status(Response.Status.OK).entity(message).build();
    }
}
