package bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.component.html.HtmlDataTable;
import javax.faces.context.FacesContext;

import org.primefaces.event.SelectEvent;

import com.br.projetoWeb.entidade.Comentario;
import com.br.projetoWeb.entidade.Empresa;
import com.br.projetoWeb.entidade.Entidade;
import com.br.projetoWeb.entidade.Profissional;

@ManagedBean(name = "bean")
@SessionScoped
public class Bean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Entidade entidade = new Entidade();
	private Empresa empresa = new Empresa();
	private Profissional profissional = new Profissional();
	private List<Empresa> listEmpresa = new ArrayList<Empresa>();
	private List<Profissional> listProfissional = new ArrayList<Profissional>();
	private Comentario comentario;
	private HtmlDataTable htmlDataTable;

	public Bean() {

		entidade = new Entidade();
		profissional = new Profissional();
		empresa = new Empresa();
		comentario = new Comentario();

	}

	public HtmlDataTable getHtmlDataTable() {
		return htmlDataTable;
	}

	public void setHtmlDataTable(HtmlDataTable htmlDataTable) {
		this.htmlDataTable = htmlDataTable;
	}

	public Comentario getComentario() {
		return comentario;
	}

	public void setComentario(Comentario comentario) {
		this.comentario = comentario;
	}

	public List<Empresa> getListEmpresa() {
		return listEmpresa;
	}

	public void setListEmpresa(List<Empresa> listEmpresa) {
		this.listEmpresa = listEmpresa;
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

	public void addComentario(SelectEvent e) {
		System.out.println("ola java doido1");
		profissional.addCoPro(comentario);
		profissional = new Profissional();
		comentario = new Comentario();
		System.out.println("ola java doido2");
	}

}
