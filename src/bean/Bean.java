package bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import com.br.projetoWeb.entidade.Empresa;
import com.br.projetoWeb.entidade.Entidade;
import com.br.projetoWeb.entidade.Profissional;

@ManagedBean(name = "bean")
@SessionScoped
public class Bean implements Serializable {

	private String nome;
	private Entidade entidade = new Entidade();
	private Empresa empresa = new Empresa();
	private Profissional profissional = new Profissional();
	private List<Empresa> listEmpresa = new ArrayList<Empresa>();
	private List<Profissional> listProfissional = new ArrayList<Profissional>();
	// private Comentario comment = new Comentario();

	public Bean() {

		entidade = new Entidade();
		profissional = new Profissional();
		empresa = new Empresa();
		// comment = new Comentario();

	}

	/*
	 * public Comentario getComment() { return comment; }
	 * 
	 * public void setComment(Comentario comment) { this.comment = comment; }
	 */
	public List<Empresa> getListEmpresa() {
		return listEmpresa;
	}

	public void setListEmpresa(List<Empresa> listEmpresa) {
		this.listEmpresa = listEmpresa;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Profissional> getListProfissional() {
		return listProfissional;
	}

	public void setListProfissional(List<Profissional> listProfissional) {
		this.listProfissional = listProfissional;
	}

	public String login() {

		if (entidade.getLogin().equals("admin") && entidade.getSenha().equals("admin")) {

			FacesContext.getCurrentInstance().addMessage(null,
					new FacesMessage("Login ou senha informados Incorretamente!"));

			return "admin?faces-redirect=true";

		} else {
			FacesContext.getCurrentInstance().addMessage(null,
					new FacesMessage("Login ou senha informados Incorretamente!"));

		}
		return null;
	}

	public Empresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}

	/*
	 * public Paciente getPaciente() { return paciente; }
	 * 
	 * public void setPaciente(Paciente paciente) { this.paciente = paciente; }
	 */

	public Entidade getEntidade() {
		return entidade;
	}

	public void setEntidade(Entidade entidade) {
		this.entidade = entidade;
	}

	public Profissional getProfissional() {
		return profissional;
	}

	public void setProfissional(Profissional profissional) {
		this.profissional = profissional;
	}

	public void addEmpresa() {

		listEmpresa.add(empresa);
		this.empresa = new Empresa();

	}

	public void addPro() {

		listProfissional.add(profissional);
		this.profissional = new Profissional();

	}

	// método para remover profissional
	public void removerListaProfissional(Profissional profissional) {
		this.profissional = new Profissional();
		listProfissional.remove(profissional);

	}

	// método para remover empresa
	public void removerEmpresa(Empresa empresa) {
		this.empresa = new Empresa();
		listEmpresa.remove(empresa);

	}

}
