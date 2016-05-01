package br.com.serviceGuincho.model;

public class GuinchoED {
	
	private String placa;
	
	private String proprietarioNome;
	
	private String proprietarioRg;
	
	private Long longitude;
	
	private Long latitude;
	
	public void guinchoED(String plac, String nomeProp, String rgProp,Long lng, Long lat){
		this.placa =  plac;
		this.proprietarioNome = nomeProp;
		this.setProprietarioRg(rgProp);
		this.latitude = lat;
		this.longitude = lng;
		
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getProprietarioNome() {
		return proprietarioNome;
	}

	public void setProprietarioNome(String proprietarioNome) {
		this.proprietarioNome = proprietarioNome;
	}

	public Long getLongitude() {
		return longitude;
	}

	public void setLongitude(Long longitude) {
		this.longitude = longitude;
	}

	public Long getLatitude() {
		return latitude;
	}

	public void setLatitude(Long latitude) {
		this.latitude = latitude;
	}

	public String getProprietarioRg() {
		return proprietarioRg;
	}

	public void setProprietarioRg(String proprietarioRg) {
		this.proprietarioRg = proprietarioRg;
	}

}
