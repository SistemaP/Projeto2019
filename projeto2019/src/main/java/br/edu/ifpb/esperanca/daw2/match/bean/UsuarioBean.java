package br.edu.ifpb.esperanca.daw2.match.bean;

import java.io.Serializable;
import java.util.Collection;
import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.edu.ifpb.esperanca.daw2.match.classes.Usuario;
import br.edu.ifpb.esperanca.daw2.match.services.UserService;

	@ViewScoped
	@Named
	public class UsuarioBean implements Serializable {

		@Inject
		private UserService service;

		protected Usuario entidade;

		protected Collection<Usuario> entidades;

		public UsuarioBean() {
		}
		
		@PostConstruct
		public void init() {
			entidade = newEntidade();
			entidades = (Collection<Usuario>) getService().getAll();
		}

		public void remove(Usuario entidade) {
			getService().remove(entidade);
		}

		public Usuario getEntidade() {
			return entidade;
		}

		public void setEntidade(Usuario entidade) {
			this.entidade = entidade;
		}

		public Collection<Usuario> getEntidades() {
			return entidades;
		}

		public void setEntidades(Collection<Usuario> entidades) {
			this.entidades = entidades;
		}

		public void save() {
			getService().save(entidade);
		}

		public void editar(Long id) {
			this.getEntidade().setId(id);
			save();
		}


		protected Usuario newEntidade() {
			return new Usuario();
		}

		public UserService getService() {
			return service;
		}


}


