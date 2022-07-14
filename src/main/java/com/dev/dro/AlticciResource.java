package com.dev.dro;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response.Status;

@Path("/alticci")
public class AlticciResource {

  @Inject
  AlticciService alticciService;

  @GET
  @Path("/{index}")
  @Produces(MediaType.APPLICATION_JSON)
  public Long getAlticciByIndex(Integer index) {
    if (index == null || index < 0) {
      throw new WebApplicationException(Status.BAD_REQUEST);
    }
    return alticciService.getAlticciByIndex(index);
  }
}
