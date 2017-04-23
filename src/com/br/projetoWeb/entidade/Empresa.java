package com.br.projetoWeb.entidade;

public class Empresa extends Entidade{
	

	  private String nomeFantasia;
	  
	  //
	  // Constructors
	  //
	  public Empresa () { };
	  
	  //
	  // Methods
	  //


	  //
	  // Accessor methods
	  //

	  /**
	   * Set the value of nomeFantasia
	   * @param newVar the new value of nomeFantasia
	   */
	  private void setNomeFantasia (String newVar) {
	    nomeFantasia = newVar;
	  }

	  /**
	   * Get the value of nomeFantasia
	   * @return the value of nomeFantasia
	   */
	  private String getNomeFantasia () {
	    return nomeFantasia;
	  }


}
