package com.br.projetoWeb.entidade;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Entidade extends Comentario {

	// private static final GenerationType strategy = null;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long codEntidade;
	private String nome;
	private String endereco;
	private String telefone;
	private String descProfissional;
	private String profissao;
	private String especialidade;
	private String dataCadastro;
	private String login;
	private String senha;
	private List<Comentario> listComentarios = new ArrayList<Comentario>();

	public Entidade() {
		super();

	}

	public List<Comentario> getListComentarios() {
		return listComentarios;
	}

	public void setListComentarios(List<Comentario> listComentarios) {
		this.listComentarios = listComentarios;
	}

	public long getCodEntidade() {
		return codEntidade;
	}

	public void setCodEntidade(long codEntidade) {
		this.codEntidade = codEntidade;
	}

	@Override
	public String getNome() {
		return nome;
	}

	@Override
	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	@Override
	public String getTelefone() {
		return telefone;
	}

	@Override
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getDescProfissional() {
		return descProfissional;
	}

	public void setDescProfissional(String descProfissional) {
		this.descProfissional = descProfissional;
	}

	public String getProfissao() {
		return profissao;
	}

	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}

	public String getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(String dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

}
