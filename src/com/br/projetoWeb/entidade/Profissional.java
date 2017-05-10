package com.br.projetoWeb.entidade;

import java.util.ArrayList;
import java.util.List;

public class Profissional extends Entidade {
	private long codigoDoConselho;
	private long cpf;	
	
	

	//
	// Constructors
	//
	public Profissional() {
	
	};
	
  /*  public void addProfissional(Profissional profissional){
    	this.profissional = new ArrayList<Profissional>();
    	this.profissional.add(profissional);
    	Profissional pf = new Profissional();
    	System.out.println(this.profissional.get(0));
    	
    }*/
	//
	// Methods
	//

	//
	// Accessor methods
	//
     
	


	public long getCpf() {
		return cpf;
	}


	/*public void addComentario(String e){
		comentario.add(e);
		
	}
	public long getCpf() {

		return cpf;
	}

	public List<String> getComentário() {
		return comentario;
	}

	public void setComentário(List<String> comentário) {
		this.comentario = comentário;
	}
*/
	public void setCpf(long cpf) {
		this.cpf = cpf;
	}


	public long getCodigoDoConselho() {
		return codigoDoConselho;
	}


	public void setCodigoDoConselho(long codigoDoConselho) {
		this.codigoDoConselho = codigoDoConselho;
	}

	@Override
	public String toString() {
		return "Profissional [codigoDoConselho=" + codigoDoConselho + ", cpf=" + cpf + ", getCpf()=" + getCpf()
				+ ", getCodigoDoConselho()=" + getCodigoDoConselho() + ", getNome()=" + getNome() + ", getEndereco()="
				+ getEndereco() + ", getTelefone()=" + getTelefone() + ", getDescProfissional()="
				+ getDescProfissional() + ", getProfissao()=" + getProfissao() + ", getEspecialidade()="
				+ getEspecialidade() + ", getComentario()=" + getComentario() + ", getDataCadastro()="
				+ getDataCadastro() + ", getLogin()=" + getLogin() + ", getSenha()=" + getSenha() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

	/**
	 * Set the value of codigoDoConselho
	 * 
	 * @param newVar
	 *            the new value of codigoDoConselho
	 *            
	 */
	
	//
	// Other methods
	//

}
