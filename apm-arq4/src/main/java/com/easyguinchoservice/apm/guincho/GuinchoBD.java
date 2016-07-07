package com.easyguinchoservice.apm.guincho;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.easyguinchoservice.apm.ed.GuinchoED;

public class GuinchoBD {
	
	EntityManagerFactory factory = Persistence.createEntityManagerFactory("minhaapppersistenceunit");
	EntityManager entityManager = factory.createEntityManager();
	

	public List<GuinchoED> listaGuinchos() {
		List<GuinchoED> listaGuinchos = new ArrayList<GuinchoED>();
		return listaGuinchos;
	}
	
	public void inclui(GuinchoED guincho) {
		entityManager.persist(guincho);
	}
	
	public List<GuinchoED> listaTodosGuinchos() {
		Query result = (Query) entityManager.createNativeQuery("SELECT g FROM GuinchoED g");
		return result.getResultList();
	}
	
	public List<GuinchoED> listaGuinchosProximos(Double longi, Double lati) {
		
		Double longMenos = longi - 100;
		Double latMenos = lati - 100;
		Double longMais = longi + 100;
		Double latMais = lati + 100;
		
		Query query = (Query) entityManager.createNativeQuery("SELECT g FROM GuinchoED g WHERE g.longitude > :longMenos "
				+ "and g.longitude < :longMais and g.latitude > :latiMenos and g.latitude < :latiMais");
		
		query.setParameter("longMenos", longMenos);
		query.setParameter("longMais", longMais);
		query.setParameter("latiMenos", latMenos);
		query.setParameter("latiMais", latMais);
		
		return query.getResultList();
	}
}
