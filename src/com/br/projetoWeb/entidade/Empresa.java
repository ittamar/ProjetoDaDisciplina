package com.br.projetoWeb.entidade;

public class Empresa extends Entidade{
	

	  private String nomeFantasia;
	  private long cnpj;
	  
	  //
	  // Constructors
	  //
	  public Empresa () { };
	  
	 
	  /**
	   * Set the value of nomeFantasia
	   * @param newVar the new value of nomeFantasia
	   */
	  
	  private void setNomeFantasia (String newVar) {
	    nomeFantasia = newVar;
	  }

	  public long getCnpj() {
		return cnpj;
	}


	public void setCnpj(long cnpj) {
		this.cnpj = cnpj;
	}


	/**
	   * Get the value of nomeFantasia
	   * @return the value of nomeFantasia
	   */
	  private String getNomeFantasia () {
	    return nomeFantasia;
	  }


}
