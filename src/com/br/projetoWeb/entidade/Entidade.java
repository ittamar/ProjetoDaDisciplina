package com.br.projetoWeb.entidade;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="entidade")
public class Entidade {
	   @Id
	   @GeneratedValue//paraou aqui pesquisar sobre chave candidata
	 // private long cpf;
	  private String nome;
	  private String endereco;
	  private long telefone;
	  private String descProfissional;
	  private String profissao;
	  private String especialidade;
	  private String comentario;
	  private String dataCadastro;
	  private long cnpj;
	  private String login;
	  private String senha;
	  
	  //
	  // Constructors
	  //
	  public Entidade () { };
	  
	  //
	  // Methods
	  //


	  //
	  // Accessor methods
	  //

	  /**
	   * Set the value of nome
	   * @param newVar the new value of nome
	   */
	  private void setNome (String newVar) {
	    nome = newVar;
	  }

	  /**
	   * Get the value of nome
	   * @return the value of nome
	   */
	  private String getNome () {
	    return nome;
	  }

	  /**
	   * Set the value of endereco
	   * @param newVar the new value of endereco
	   */
	  private void setEndereco (String newVar) {
	    endereco = newVar;
	  }

	  /**
	   * Get the value of endereco
	   * @return the value of endereco
	   */
	  private String getEndereco () {
	    return endereco;
	  }

	  /**
	   * Set the value of telefone
	   * @param newVar the new value of telefone
	   */
	  private void setTelefone (long newVar) {
	    telefone = newVar;
	  }

	  /**
	   * Get the value of telefone
	   * @return the value of telefone
	   */
	  private long getTelefone () {
	    return telefone;
	  }

	  /**
	   * Set the value of descProfissional
	   * @param newVar the new value of descProfissional
	   */
	  private void setDescProfissional (String newVar) {
	    descProfissional = newVar;
	  }

	  /**
	   * Get the value of descProfissional
	   * @return the value of descProfissional
	   */
	  private String getDescProfissional () {
	    return descProfissional;
	  }

	  /**
	   * Set the value of profissao
	   * @param newVar the new value of profissao
	   */
	  private void setProfissao (String newVar) {
	    profissao = newVar;
	  }

	  /**
	   * Get the value of profissao
	   * @return the value of profissao
	   */
	  private String getProfissao () {
	    return profissao;
	  }

	  /**
	   * Set the value of especialidade
	   * @param newVar the new value of especialidade
	   */
	  private void setEspecialidade (String newVar) {
	    especialidade = newVar;
	  }

	  /**
	   * Get the value of especialidade
	   * @return the value of especialidade
	   */
	  private String getEspecialidade () {
	    return especialidade;
	  }

	  /**
	   * Set the value of comentario
	   * @param newVar the new value of comentario
	   */
	  private void setComentario (String newVar) {
	    comentario = newVar;
	  }

	  /**
	   * Get the value of comentario
	   * @return the value of comentario
	   */
	  private String getComentario () {
	    return comentario;
	  }

	  /**
	   * Set the value of dataCadastro
	   * @param newVar the new value of dataCadastro
	   */
	  private void setDataCadastro (String newVar) {
	    dataCadastro = newVar;
	  }

	  /**
	   * Get the value of dataCadastro
	   * @return the value of dataCadastro
	   */
	  private String getDataCadastro () {
	    return dataCadastro;
	  }

	  /**
	   * Set the value of cpf
	   * @param newVar the new value of cpf
	   */
	 /* private void setCpf (long newVar) {
	    cpf = newVar;
	  }

	  *//**
	   * Get the value of cpf
	   * @return the value of cpf
	   *//*
	  private long getCpf () {
	    return cpf;
	  }
*/
	  /**
	   * Set the value of cnpj
	   * @param newVar the new value of cnpj
	   */
	  private void setCnpj (long newVar) {
	    cnpj = newVar;
	  }

	  /**
	   * Get the value of cnpj
	   * @return the value of cnpj
	   */
	  private long getCnpj () {
	    return cnpj;
	  }

	  /**
	   * Set the value of login
	   * @param newVar the new value of login
	   */
	  private void setLogin (String newVar) {
	    login = newVar;
	  }

	  /**
	   * Get the value of login
	   * @return the value of login
	   */
	  private String getLogin () {
	    return login;
	  }

	  /**
	   * Set the value of senha
	   * @param newVar the new value of senha
	   */
	  private void setSenha (String newVar) {
	    senha = newVar;
	  }

	  /**
	   * Get the value of senha
	   * @return the value of senha
	   */
	  private String getSenha () {
	    return senha;
	  }

	  //
	  // Other methods
	  //

	
}
