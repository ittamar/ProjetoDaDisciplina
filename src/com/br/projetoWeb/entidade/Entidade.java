package com.br.projetoWeb.entidade;

import java.util.ArrayList;
import java.util.List;

/*@Entity
@Table (name="entidade")*/
public class Entidade {
	  /* @Id
	   @GeneratedValue//paraou aqui pesquisar sobre chave candidata
*/	 
	  private String nome;
	  private String endereco;
	  private String telefone;
	  private String descProfissional;
	  private String profissao;
	  private String especialidade;
      private List<Comentario> comentarios = new ArrayList<Comentario>();
	  private String dataCadastro;
	  private String login;
	  private String senha;
	  
	  //
	  // Constructors
	  //
	
	  public Entidade () { }

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

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

	

	public List<Comentario> getComentarios() {
		return comentarios;
	}

	public void setComentarios(List<Comentario> comentarios) {
		this.comentarios = comentarios;
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
	};
	  
	  //
	  // Methods
	  //


	  //
	  // Accessor methods
	  //
	  
	  

	
}
