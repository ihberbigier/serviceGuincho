package com.easyguinchoservice.apm.ed;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;

@Entity
public class GuinchoED {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
    
	@Column(name="nome_motorista")
	private String nome;

	@Column(name="placa")
    private String placa;
    
	@Column(name="nome_motorista")
    private String telefone;
    
	@Column(name="longitude")
    private Double longitude;
    
	@Column(name="latitude")
    private Double latitude;

	@Column(name="id_guincheiro")
    private GuincheiroED guincheiro;
    
	@Transient
	private String valor;
	
	@Transient 
	private String distancia;
	
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

    public String toString() {
        return "Guincho " + nome + " placa: " + placa;
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

	public GuincheiroED getGuincheiro() {
		return guincheiro;
	}

	public void setGuincheiro(GuincheiroED guincheiro) {
		this.guincheiro = guincheiro;
	}

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

	public String getDistancia() {
		return distancia;
	}

	public void setDistancia(String distancia) {
		this.distancia = distancia;
	}

	
}
