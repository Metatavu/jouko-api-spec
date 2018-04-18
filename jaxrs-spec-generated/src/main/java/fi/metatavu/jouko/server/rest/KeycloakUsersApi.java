package fi.metatavu.jouko.server.rest;

import java.util.UUID;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

import io.swagger.annotations.*;

import java.util.Map;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
import java.lang.Exception;

@Path("/keycloakUsers")

@Api(description = "the keycloakUsers API")
@Consumes({ "application/json;charset=utf-8" })
@Produces({ "application/json;charset=utf-8" })
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2018-04-18T13:16:01.324Z")


public interface KeycloakUsersApi  {

    @GET
    @Path("/{keycloakId}")
    @Consumes({ "application/json;charset&#x3D;utf-8" })
    @Produces({ "application/json;charset&#x3D;utf-8" })
    @ApiOperation(value = "Get an user by keycloak id", notes = "", response = Void.class, authorizations = {
        @Authorization(value = "bearer")
    }, tags={ "Users" })
    @ApiResponses(value = {  })
    public Response getUserByKeycloakId(@PathParam("userId") @ApiParam("The keycloak id of the user to look up") UUID userId) throws Exception;
}
