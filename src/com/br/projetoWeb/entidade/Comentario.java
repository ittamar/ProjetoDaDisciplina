package com.br.projetoWeb.entidade;

import java.util.Date;

/*O comentário contém: data do comentário, texto, usuário e com qual entidade está
relacionado.*/
public class Comentario {
	private Date data;//data do comentario
	private String texto;//comentario do usuario
	private String nome;//nome do usuario que coloca o comentario para a entidade
	private String email; //email do usuario
	private String entidade;//o usuario vai escolher uma entidade para comentar. O nome dessa entidade sera colocada nessa variavel
	private Boolean status;
	/*
	 * false - pra comentarios não revisados
	 * true - pra comentarios aprovados
	 * 
	 * */
	public Comentario() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEntidade() {
		return entidade;
	}

	public void setEntidade(String entidade) {
		this.entidade = entidade;
	}
	
	
	
}
