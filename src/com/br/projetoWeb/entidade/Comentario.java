package com.br.projetoWeb.entidade;

public class Comentario {
	private String nome;
	private String telefone;
	private String email;
	// private Profissional pro;

	public Comentario() {
		super();
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
