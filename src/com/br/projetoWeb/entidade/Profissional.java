package com.br.projetoWeb.entidade;

public class Profissional extends Entidade {
	  private long codigoDoConselho;
	  private long cpf;
	  
	  //
	  // Constructors
	  //
	  public Profissional () { };
	  
	  
	  
	  //
	  // Methods
	  //


	  //
	  // Accessor methods
	  //
       
	  public long getCpf() {
		return cpf;
	}



	public void setCpf(long cpf) {
		this.cpf = cpf;
	}



	/**
	   * Set the value of codigoDoConselho
	   * @param newVar the new value of codigoDoConselho
	   */
	  private void setCodigoDoConselho (long newVar) {
	    codigoDoConselho = newVar;
	  }

	  /**
	   * Get the value of codigoDoConselho
	   * @return the value of codigoDoConselho
	   */
	  private long getCodigoDoConselho () {
	    return codigoDoConselho;
	  }

	  //
	  // Other methods
	  //

}
