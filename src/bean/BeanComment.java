package bean;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import com.br.projetoWeb.entidade.Comentario;
import com.br.projetoWeb.entidade.Profissional;

@ManagedBean
@ViewScoped
public class BeanComment implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Comentario comentario = new Comentario();
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

	public void getAdd() {
		comentario = new Comentario();
		System.out.println(comentario.getNome());

	}

}
