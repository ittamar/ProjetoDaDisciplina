package com.br.projetoWeb.entidade;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name = "codEntidade")
public class Empresa extends Entidade {

	private String nomeFantasia;
	private String cnpj;
	@ManyToOne
	Profissional profi;

	public Empresa() {
		super();

	};

	public String getNomeFantasia() {
		return nomeFantasia;
	}

	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}

	public Profissional getProfi() {
		return profi;
	}

	public void setProfi(Profissional profi) {
		this.profi = profi;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	@Override
	public String toString() {
		return "Empresa [nomeFantasia=" + nomeFantasia + ", cnpj=" + cnpj + ", profi=" + profi + "]";
	}

}
