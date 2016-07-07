package com.easyguinchoservice.apm.ed;


import javax.xml.bind.annotation.XmlType;

@XmlType
public class GuinchoAndroidED {
	
	private String nome;

    private String placa;

    private String distancia;

    private Integer valor;

    private String valorString;

    private String telefone;

    private Double longitude;

    private Double latitude;

    private String nomeGuincheiro;

    private String cpfCnpj;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getDistancia() {
		return distancia;
	}

	public void setDistancia(String distancia) {
		this.distancia = distancia;
	}

	public Integer getValor() {
		return valor;
	}

	public void setValor(Integer valor) {
		this.valor = valor;
	}

	public String getValorString() {
		return valorString;
	}

	public void setValorString(String valorString) {
		this.valorString = valorString;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public Double getLongitude() {
		return longitude;
	}

	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}

	public Double getLatitude() {
		return latitude;
	}

	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}

	public String getNomeGuincheiro() {
		return nomeGuincheiro;
	}

	public void setNomeGuincheiro(String nomeGuincheiro) {
		this.nomeGuincheiro = nomeGuincheiro;
	}

	public String getCpfCnpj() {
		return cpfCnpj;
	}

	public void setCpfCnpj(String cpfCnpj) {
		this.cpfCnpj = cpfCnpj;
	}

    
}
