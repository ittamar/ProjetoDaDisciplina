package bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.br.projetoWeb.entidade.Comentario;
import com.br.projetoWeb.entidade.Profissional;

@ManagedBean(name = "beanComment")
@SessionScoped
public class BeanComment {
	private Comentario comentario;
	private Profissional profissional = new Profissional();

	public BeanComment() {

		comentario = new Comentario();
		profissional = new Profissional();

	}

	public Comentario getComentario() {
		return comentario;
	}

	public void setComentario(Comentario comentario) {
		this.comentario = comentario;
	}

	public Profissional getProfissional() {
		return profissional;
	}

	public void setProfissional(Profissional profissional) {
		this.profissional = profissional;
	}

}
