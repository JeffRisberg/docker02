package com.incra.ratpack;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Jeff Risberg
 * @since 11/30/17
 */
public class Main {
    private static final Logger LOGGER = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) throws Exception {
        LOGGER.error("main starting");

        /*
        RatpackServer.start(s -> s
                .serverConfig(config -> config.baseDir(BaseDir.find()))

                // This is a simple Ratpack-based registration
                .registryOf(registry -> registry.add(new HelloHandler()))
                .registryOf(registry -> registry.add(new UpdateHandler()))

                // This is a Guice-based registration
                .registry(Guice.registry(r ->
                        r.bindInstance(com.incra.ratpack.UserService.class, new com.incra.ratpack.DefaultUserService())
                ))

                .handlers(chain -> chain
                        .path("foo", ctx -> ctx.render("from the foo handler")) // Map to /foo
                        .path("bar", ctx -> ctx.render("from the bar handler")) // Map to /bar
                        .path("hello", ctx -> ctx.get(HelloHandler.class).handle(ctx))
                        .path("update", ctx -> ctx.get(UpdateHandler.class).handle(ctx))
                        .path("users", ctx -> ctx.render(ctx.get(UserService.class).getUsers().toString()))
                        .all(ctx -> ctx.render("root handler!"))
                )
        );
        */
    }
}