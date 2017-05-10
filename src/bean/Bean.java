package bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;

import com.br.projetoWeb.entidade.Empresa;
import com.br.projetoWeb.entidade.Entidade;
import com.br.projetoWeb.entidade.Paciente;
import com.br.projetoWeb.entidade.Profissional;

@ManagedBean(name = "bean")
@ApplicationScoped
public class Bean implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String nome;
	private Entidade entidade;
	private Empresa empresa;
	private Paciente paciente;
	private Profissional profissional;
	Profissional pro = new Profissional();
	private List<Profissional> listProfissional = new ArrayList<Profissional>();
	private List<Empresa> listEmpresa = new ArrayList<Empresa>();

	public Bean() {
		

		entidade = new Entidade();
		profissional = new Profissional();
		listEmpresa = new ArrayList<Empresa>();
		empresa = new Empresa();
		

	}
	
	
	
	
	

	
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






	public static long getSerialversionuid() {
		return serialVersionUID;
	}






	public Profissional getPro() {
		return pro;
	}






	public void setPro(Profissional pro) {
		this.pro = pro;
	}






	public List<Profissional> getListProfissional() {
		return listProfissional;
	}

	public void setListProfissional(List<Profissional> listProfissional) {
		this.listProfissional = listProfissional;
	}

	public String login() {
	      System.out.println(entidade.getNome());

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

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

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
public void addProfissional(){
		
		listProfissional.add(profissional);
		this.entidade = new Entidade();
		this.profissional = new Profissional();
		
		
		//System.out.println(b.getNome());
		//System.out.println(this.entidade.getNome());
	}

public void addEmpresa(){
	listEmpresa.add(empresa);
	this.entidade = new Entidade();
	this.empresa = new Empresa();
	
	//this.entidade = new Entidade();
	
}
}
