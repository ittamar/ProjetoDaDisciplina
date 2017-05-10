package com.br.projetoWeb.entidade;

import java.util.ArrayList;
import java.util.List;

public class Empresa extends Entidade{

	private String nomeFantasia;
	private long cnpj;
	Profissional profi;
	/*List<Empresa> empresa = new ArrayList<Empresa>();
	private Empresa emp;
	private Entidade ent;*/

	//
	// Constructors
	//
	public Empresa() {
		
      //emp = new Empresa();
      
	};
	

	public String getNomeFantasia() {
		return nomeFantasia;
	}


	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}


	/**
	 * Set the value of nomeFantasia
	 * 
	 * @param newVar
	 *            the new value of nomeFantasia
	 */
	
	

	public Profissional getProfi() {
		return profi;
	}

	/*public List<Empresa> getEmpresa() {
		return empresa;
	}

	public void setEmpresa(List<Empresa> empresa) {
		this.empresa = empresa;
	}*/

	public void setProfi(Profissional profi) {
		this.profi = profi;
	}

	public long getCnpj() {
		return cnpj;
	}

	public void setCnpj(long cnpj) {
		this.cnpj = cnpj;
	}

	/*public void addEmpresa(){
		this.empresa.add(emp);
		this.emp = new Empresa();
		this.ent = new Entidade();
		
		
		
	}*/

}
