package com.incra.ratpack;

import ratpack.handling.Context;

/**
 * @author Jeff Risberg
 * @since 11/30/17
 */
@GET
public class UpdateEndpoint {

    public UpdateHandler() {
    }

    @Override
    public void handle(Context context) {
        context.render("Update handler");
    }
}
