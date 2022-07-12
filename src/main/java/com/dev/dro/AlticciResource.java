package com.dev.dro;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/alticci")
public class AlticciResource {

  @Inject
  AlticciService alticciService;

  @GET
  @Path("/{index}")
  @Produces(MediaType.APPLICATION_JSON)
  public Integer getAlticciByIndex(Integer index) {
    return alticciService.getAlticciByIndex(index);
  }
}
