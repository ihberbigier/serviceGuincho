package com.easyguinchoservice.apm.remote;


import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;
import com.easyguinchoservice.apm.ed.GuinchoED;

@Path("/guinchos")
@Produces(MediaType.APPLICATION_JSON)
public class GuinchosRest {
	
	@Inject
	private GuinchoRN guinchoRN;
	
	
	 @GET
	  @Path("/listar")
	  public List<GuinchoED> teste(@Context HttpHeaders headers) {
	    
	    return guinchoRN.listaGuinchos();
	  }
	

}
