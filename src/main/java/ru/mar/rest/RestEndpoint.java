package ru.mar.rest;

import ru.mar.ejb.TestEjb;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;
import java.util.logging.Level;
import java.util.logging.Logger;

@Path("/api")
@ApplicationScoped
public class RestEndpoint {

    Logger log = Logger.getLogger(RestEndpoint.class.getSimpleName());

    @Inject
    private TestEjb testEjb;

    @GET
    @Path("/test")
    public Response testRest() {
        String uuid = testEjb.getUuid();
        log.log(Level.INFO, "Send test uuid: {0}", uuid);
        return Response.ok(uuid).build();
    }

}
