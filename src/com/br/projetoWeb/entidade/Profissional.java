package com.br.projetoWeb.entidade;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name = "codEntidade")
public class Profissional extends Entidade {
	private long codigoDoConselho;
	private String cpf;

	public Profissional() {

	};

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public long getCodigoDoConselho() {
		return codigoDoConselho;
	}

	public void setCodigoDoConselho(long codigoDoConselho) {
		this.codigoDoConselho = codigoDoConselho;
	}

	@Override
	public String toString() {
		return "Profissional [codigoDoConselho=" + codigoDoConselho + ", cpf=" + cpf + ", getCpf()=" + getCpf()
				+ ", getCodigoDoConselho()=" + getCodigoDoConselho() + ", getCodEntidade()=" + getCodEntidade()
				+ ", getNome()=" + getNome() + ", getEndereco()=" + getEndereco() + ", getTelefone()=" + getTelefone()
				+ ", getDescProfissional()=" + getDescProfissional() + ", getProfissao()=" + getProfissao()
				+ ", getEspecialidade()=" + getEspecialidade() + ", getComentarios()=" + getComentarios()
				+ ", getDataCadastro()=" + getDataCadastro() + ", getLogin()=" + getLogin() + ", getSenha()="
				+ getSenha() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}

}
