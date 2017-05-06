package com.br.projetoWeb.entidade;

import java.util.List;

public class Empresa{
	

	  private String nomeFantasia;
	  private long cnpj;
	  Profissional profi;
	  List<Profissional> profissional;
	 
	  
	  //
	  // Constructors
	  //
	  public Empresa () { 
		  
		 	  };
	  
	 
	  /**
	   * Set the value of nomeFantasia
	   * @param newVar the new value of nomeFantasia
	   */
	  
	  
	  public void addProfissional(){
		  profissional.add(profi);
		  Profissional profi = new Profissional();
		  
		  
		  
		  
		  
	  }
	  
	  
	  
	  public Profissional getProfi() {
		return profi;
	}


	public void setProfi(Profissional profi) {
		this.profi = profi;
	}


	private void setNomeFantasia (String newVar) {
	    nomeFantasia = newVar;
	  }

	  public List<Profissional> getProfissional() {
		return profissional;
	}


	public void setProfissional(List<Profissional> profissional) {
		this.profissional = profissional;
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
