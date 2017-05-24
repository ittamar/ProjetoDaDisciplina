package bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.br.projetoWeb.entidade.Comentario;
import com.br.projetoWeb.entidade.Entidade;

@ManagedBean(name = "comentarioBean")
@SessionScoped
public class ComentarioBean {
	private Comentario comentario;
	private Entidade entidade;

	public ComentarioBean() {
		super();
		this.comentario = new Comentario();
		this.entidade = new Entidade();
	}

	public Entidade getEntidade() {
		return entidade;
	}

	public void setEntidade(Entidade entidade) {
		this.entidade = entidade;
	}

	public Comentario getComentario() {
		return comentario;
	}

	public void setComentario(Comentario comentario) {
		this.comentario = comentario;
	}

}
