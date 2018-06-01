package fi.metatavu.jouko.server.rest;

import fi.metatavu.jouko.server.rest.model.Device;
import fi.metatavu.jouko.server.rest.model.InternalServerError;
import fi.metatavu.jouko.server.rest.model.InterruptionGroup;
import fi.metatavu.jouko.server.rest.model.Unauthorized;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

import io.swagger.annotations.*;

import java.util.Map;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
import java.lang.Exception;

@Path("/admin")

@Api(description = "the admin API")
@Consumes({ "application/json;charset=utf-8" })
@Produces({ "application/json;charset=utf-8" })
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2018-06-01T07:44:53.730Z")


public interface AdminApi  {

    @POST
    @Path("/interruptiongroups/")
    @Consumes({ "application/json;charset&#x3D;utf-8" })
    @Produces({ "application/json;charset&#x3D;utf-8" })
    @ApiOperation(value = "Create interruption group", notes = "", response = InterruptionGroup.class, authorizations = {
        @Authorization(value = "bearer")
    }, tags={ "Interruption Groups",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = InterruptionGroup.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = Unauthorized.class),
        @ApiResponse(code = 500, message = "Internal server error", response = InternalServerError.class) })
    public Response createInterruptionGroup(@Valid InterruptionGroup body) throws Exception;

    @GET
    @Path("/devices")
    @Consumes({ "application/json;charset&#x3D;utf-8" })
    @Produces({ "application/json;charset&#x3D;utf-8" })
    @ApiOperation(value = "List all devices", notes = "", response = Device.class, responseContainer = "List", authorizations = {
        @Authorization(value = "bearer")
    }, tags={ "Devices",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = Device.class, responseContainer = "List"),
        @ApiResponse(code = 401, message = "Unauthorized", response = Unauthorized.class),
        @ApiResponse(code = 500, message = "Internal server error", response = InternalServerError.class) })
    public Response listAllDevices(@QueryParam("firstResult") @NotNull   @ApiParam("The offset of the first result")  Integer firstResult,@QueryParam("maxResults") @NotNull   @ApiParam("The maximum number of results")  Integer maxResults) throws Exception;

    @GET
    @Path("/interruptiongroups/")
    @Consumes({ "application/json;charset&#x3D;utf-8" })
    @Produces({ "application/json;charset&#x3D;utf-8" })
    @ApiOperation(value = "List interruption groups", notes = "", response = InterruptionGroup.class, responseContainer = "List", authorizations = {
        @Authorization(value = "bearer")
    }, tags={ "Interruption Groups",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = InterruptionGroup.class, responseContainer = "List"),
        @ApiResponse(code = 401, message = "Unauthorized", response = Unauthorized.class),
        @ApiResponse(code = 500, message = "Internal server error", response = InternalServerError.class) })
    public Response listInterruptionGroups(@QueryParam("firstResult") @NotNull   @ApiParam("The offset of the first result")  Integer firstResult,@QueryParam("maxResults") @NotNull   @ApiParam("The maximum number of results")  Integer maxResults) throws Exception;

    @GET
    @Path("/interruptiongroups/{groupId}")
    @Consumes({ "application/json;charset&#x3D;utf-8" })
    @Produces({ "application/json;charset&#x3D;utf-8" })
    @ApiOperation(value = "Retreive interruption group", notes = "", response = InterruptionGroup.class, authorizations = {
        @Authorization(value = "bearer")
    }, tags={ "Interruptions",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = InterruptionGroup.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = Unauthorized.class),
        @ApiResponse(code = 500, message = "Internal server error", response = InternalServerError.class) })
    public Response retrieveInterruptionGroup(@PathParam("groupId") @ApiParam("The id of the interruption group") Long groupId) throws Exception;

    @PUT
    @Path("/interruptiongroups/{groupId}")
    @Consumes({ "application/json;charset&#x3D;utf-8" })
    @Produces({ "application/json;charset&#x3D;utf-8" })
    @ApiOperation(value = "Update interruption group", notes = "", response = InterruptionGroup.class, authorizations = {
        @Authorization(value = "bearer")
    }, tags={ "Interruptions" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = InterruptionGroup.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = Unauthorized.class),
        @ApiResponse(code = 500, message = "Internal server error", response = InternalServerError.class) })
    public Response updateInterruptionGroup(@PathParam("groupId") @ApiParam("The id of the interruption group") Long groupId,@Valid InterruptionGroup body) throws Exception;
}
