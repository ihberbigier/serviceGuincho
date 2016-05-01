package br.com.serviceGuincho.service;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.com.serviceGuincho.model.GuinchoED;

@Path("guincho")
public class Service {
		
		@GET
		@Produces(MediaType.APPLICATION_JSON)
		public List<GuinchoED> busca() {
			List<GuinchoED> listaGuinchos = new ArrayList<GuinchoED>();
			for(Integer i =0;i< 10;i++) {
				GuinchoED guinchoAux = new GuinchoED();
				guinchoAux.setLatitude(i.longValue());
				guinchoAux.setLongitude(i.longValue());
				guinchoAux.setPlaca("TST +" +i +""+i +""+i);
				guinchoAux.setProprietarioNome("Proprietario " + i);
				guinchoAux.setProprietarioRg("RG " + i);
				listaGuinchos.add(guinchoAux);
			}
			return listaGuinchos;
		}
}
	
