package com.easyguinchoservice.apm.guincho;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import com.easyguinchoservice.apm.ed.GuinchoED;


public class GuinchoRN {
	@Inject
	private GuinchoBD guinchoBD;
	
	public List<GuinchoED> listaGuinchos(Double latitude, Double longitude) {
	    
	    return guinchoBD.listaGuinchosProximos(longitude, latitude);
	}
	
	public void inclui(GuinchoED guincho) {
		
		 guinchoBD.inclui(guincho);
	}
}
