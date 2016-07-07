package com.easyguinchoservice.apm.guincho;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.easyguinchoservice.apm.ed.GuinchoED;

public class GuinchoBD {
	@Inject
	EntityManager em ; 
	public List<GuinchoED> listaGuinchos() {
		List<GuinchoED> listaGuinchos = new ArrayList<GuinchoED>();
		//TODO mocar dados
		return listaGuinchos;
	}
	
	public void inclui(GuinchoED guincho) {
		 em.persist(guincho);
	}
	
	public List<GuinchoED> listaTodosGuinchos() {
		Query result = (Query) em.createNativeQuery("SELECT g FROM GuinchoED g");
		return result.getResultList();
	}
	
	public List<GuinchoED> listaGuinchosProximos(Double longi, Double lati) {
		
		Double longMenos = longi - 100;
		Double latMenos = lati - 100;
		Double longMais = longi + 100;
		Double latMais = lati + 100;
		
		Query query = (Query) em.createNativeQuery("SELECT g FROM GuinchoED g WHERE g.longitude > :longMenos "
				+ "and g.longitude < :longMais and g.latitude > :latiMenos and g.latitude < :latiMais");
		
		query.setParameter("longMenos", longMenos);
		query.setParameter("longMais", longMenos);
		query.setParameter("latiMenos", latMenos);
		query.setParameter("latiMais", latMais);
		
		return query.getResultList();
	}
}
