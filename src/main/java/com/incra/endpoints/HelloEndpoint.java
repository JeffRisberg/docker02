package com.incra.ratpack;

import ratpack.handling.Context;
import ratpack.handling.Handler;

/**
 * @author Jeff Risberg
 * @since 11/30/17
 */
public class HelloEndpoint {

    public HelloEndpoint() {
    }

    @Override
    public void handle(Context context) {
        context.render("Hello, World!");
    }
}
