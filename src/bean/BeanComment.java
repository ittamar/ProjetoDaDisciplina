package bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import com.br.projetoWeb.entidade.Comentario;
import com.br.projetoWeb.entidade.Profissional;

@ManagedBean
@RequestScoped
public class BeanComment {
	/**
	 * 
	 */

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

	public void addComment() {
		System.out.println(profissional.getEspecialidade());
		profissional.addCoPro(comentario);
		this.comentario = new Comentario();
		this.profissional = new Profissional();

		System.out.println("uuuuuu");

	}

}
