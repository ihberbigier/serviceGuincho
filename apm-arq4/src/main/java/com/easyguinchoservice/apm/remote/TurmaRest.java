package com.easyguinchoservice.apm.remote;


import javax.ws.rs.GET;
import javax.ws.rs.Path;

import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;


@Path("/turma")
@Produces(MediaType.APPLICATION_JSON)
public class TurmaRest {
	
	
//	@GET
//	@Path("/list")
//	public Response lista(@Context HttpHeaders headers) {
//		List<TurmaED> list = turmaRN.lista(new TurmaPesqED());
//		return Response.status(200).entity(list).build();
//	}
	
	 @GET
	  @Path("/teste")
	  public String teste(@Context HttpHeaders headers) {
	    
	    return "teste";
	  }
	
//	@GET
//	@Path("{id}")
//	public Response consulta(@Context HttpHeaders headers, @PathParam("id") Long id) {
//		TurmaED turmaED = turmaRN.consulta(id);
//		turmaED.setHorarios(null); // TODO referencia circular (turma--horario--turma--horario--etc)
//		return Response.status(200).entity(turmaED).build();
//	}

}
