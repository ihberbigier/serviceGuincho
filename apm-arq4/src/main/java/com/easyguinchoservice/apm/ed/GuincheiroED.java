package com.easyguinchoservice.apm.ed;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class GuincheiroED {
 
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@Column(name="nome_motorista")
	private String nome_guincheiro;
	
	@Column(name="cnpj_cpf")
	private String cpf_cnpj;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome_guincheiro() {
		return nome_guincheiro;
	}

	public void setNome_guincheiro(String nome_guincheiro) {
		this.nome_guincheiro = nome_guincheiro;
	}

	public String getCpf_cnpj() {
		return cpf_cnpj;
	}

	public void setCpf_cnpj(String cpf_cnpj) {
		this.cpf_cnpj = cpf_cnpj;
	}
	
	

}
