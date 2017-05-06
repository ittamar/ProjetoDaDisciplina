package com.br.projetoWeb.entidade;

import java.util.List;

public class Profissional extends Entidade {
	private long codigoDoConselho;
	private long cpf;
	

	//
	// Constructors
	//
	public Profissional() {
		
	};

	//
	// Methods
	//

	//
	// Accessor methods
	//
     
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

	/**
	 * Set the value of codigoDoConselho
	 * 
	 * @param newVar
	 *            the new value of codigoDoConselho
	 */
	private void setCodigoDoConselho(long newVar) {
		codigoDoConselho = newVar;
	}

	/**
	 * Get the value of codigoDoConselho
	 * 
	 * @return the value of codigoDoConselho
	 */
	private long getCodigoDoConselho() {
		return codigoDoConselho;
	}

	//
	// Other methods
	//

}
