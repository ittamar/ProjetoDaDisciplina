package bean;

import java.io.Serializable;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import com.br.projetoWeb.entidade.Empresa;
import com.br.projetoWeb.entidade.Entidade;
import com.br.projetoWeb.entidade.Paciente;
import com.br.projetoWeb.entidade.Profissional;

@ManagedBean (name="bean")
@RequestScoped
public class Bean implements Serializable {
	private Entidade entidade;
	private Empresa empresa;
	private Paciente paciente;
	private Profissional profissional;
	List<Profissional> empregado;
	public Bean() {
		super();
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
	public List<Profissional> getEmpregado() {
		return empregado;
	}
	public void setEmpregado(List<Profissional> empregado) {
		this.empregado = empregado;
	}
	
	

}
