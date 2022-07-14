package com.dev.dro;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response.Status;
import org.eclipse.microprofile.openapi.annotations.Operation;
import org.eclipse.microprofile.openapi.annotations.media.Content;
import org.eclipse.microprofile.openapi.annotations.media.Schema;
import org.eclipse.microprofile.openapi.annotations.parameters.Parameter;
import org.eclipse.microprofile.openapi.annotations.responses.APIResponse;

@Path("/alticci")
public class AlticciResource {

  @Inject
  AlticciService alticciService;

  @GET
  @Path("/{index}")
  @Produces(MediaType.APPLICATION_JSON)
  @APIResponse(responseCode = "200",
      description = "Returns the value referring to the given sequence index",
      content = @Content(
          mediaType = MediaType.APPLICATION_JSON,
          schema = @Schema(implementation = Long.class)))
  @Operation(summary = "The value referring to the given sequence index")
  public Long getAlticciByIndex(
      @Parameter(description = "Index of the sequence for which we want to get the value", required = true)
      @PathParam("index") Integer index) {
    if (index == null || index < 0) {
      throw new WebApplicationException(Status.BAD_REQUEST);
    }
    return alticciService.getAlticciByIndex(index);
  }
}
