package com.easyguinchoservice.apm.remote;

import java.util.ArrayList;
import java.util.List;

import com.easyguinchoservice.apm.ed.GuinchoED;

public class GuinchoRN {
	public List<GuinchoED> listaGuinchos() {
	    List<GuinchoED> listaGuinchos = new ArrayList<GuinchoED>();
	    for(Integer i = 0; i<9 ;i++) {
	        GuinchoED guincho = new GuinchoED();
	        guincho.setNome("guincho " + i.toString());
	        guincho.setPlaca("IGJ"+"000"+i.toString());
	        guincho.setTelefone("51 3245120" + i);
	        guincho.setLatitude(i.longValue() + 101231232);
	        guincho.setLongitude(i.longValue()+ 231232);
	        listaGuinchos.add(guincho);
	    }
	    return listaGuinchos;
	}
}
