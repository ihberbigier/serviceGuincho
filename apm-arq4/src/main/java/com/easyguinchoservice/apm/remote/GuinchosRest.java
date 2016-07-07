package com.easyguinchoservice.apm.remote;


import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;

import com.easyguinchoservice.apm.ed.GuincheiroED;
import com.easyguinchoservice.apm.ed.GuinchoAndroidED;
import com.easyguinchoservice.apm.ed.GuinchoED;
import com.easyguinchoservice.apm.guincho.GuinchoRN;
import com.google.gson.Gson;

@Path("/guinchos")
@Produces(MediaType.APPLICATION_JSON)
public class GuinchosRest {
	
	@Inject
	private GuinchoRN guinchoRN;
	
	
	 @GET
	  @Path("/listartodos")
	  public List<GuinchoED> listaGuinchos(@Context HttpHeaders headers) {
	    
	    return guinchoRN.listaGuinchos(null,null);
	  }
	 
	 
     @GET
	  @Path("/listar")
	  public List<GuinchoED> listaGuinchos(@QueryParam("latitude") Double latitude,@QueryParam("longitude") Double longitude) {
	    
	    return guinchoRN.listaGuinchos(latitude,longitude);
	  }
     
     
	  
     @POST
     @Path("/inclui/")
     @Produces("application/json ; charset=UTF-8")
	  public void inclui(String json) {
    	 GuinchoED guincho = new GuinchoED();
    	 GuinchoAndroidED guinchoAnd = new Gson().fromJson(json,GuinchoAndroidED.class);
    	 guincho = this.androidToService(guinchoAnd);
    	 guinchoRN.inclui(guincho);
	  }

     private GuinchoED androidToService(GuinchoAndroidED guinchoAnd) {
    	 GuinchoED guincho = new GuinchoED();
    	 GuincheiroED guincheiro = new GuincheiroED();
    	 guincheiro.setNome_guincheiro(guinchoAnd.getNomeGuincheiro());
    	 guincheiro.setCpf_cnpj(guinchoAnd.getCpfCnpj());
    	 guincho.setGuincheiro(guincheiro);
    	 guincho.setLatitude(guinchoAnd.getLatitude());
    	 guincho.setLongitude(guinchoAnd.getLongitude());
    	 guincho.setPlaca(guinchoAnd.getPlaca());
    	 guincho.setNome(guinchoAnd.getNome());
    	 guincho.setTelefone(guinchoAnd.getTelefone());
    	 return guincho;

     }
}
