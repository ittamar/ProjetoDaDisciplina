package com.br.projetoWeb.entidade;

public class Comentario {
	private String nome;
	private String telefone;
	private String email;
	private String comentar;
	private String data;
	// private Profissional pro;

	public Comentario() {
		super();
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getComentar() {
		return comentar;
	}

	public void setComentario(String comentar) {
		this.comentar = comentar;
	}

	/*
	 * public Profissional getPro() { return pro; }
	 * 
	 * public void setPro(Profissional pro) { this.pro = pro; }
	 */
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void addComentarios() {

	}

}
