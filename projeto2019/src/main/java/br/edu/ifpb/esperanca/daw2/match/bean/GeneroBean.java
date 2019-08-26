package br.edu.ifpb.esperanca.daw2.match.bean;

import java.io.Serializable;
import java.util.Collection;
import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import br.edu.ifpb.esperanca.daw2.match.classes.GeneroLit;
import br.edu.ifpb.esperanca.daw2.match.services.GenService;

	@ViewScoped
	@Named
	public class GeneroBean implements Serializable {

		@Inject
		private GenService service;

		protected GeneroLit entidade;

		protected Collection<GeneroLit> entidades;

		public GeneroBean() {
		}
		
		@PostConstruct
		public void init() {
			entidade = newEntidade();
			entidades = (Collection<GeneroLit>) getService().getAll();
		}

		public void remove(GeneroLit entidade) {
			getService().remove(entidade);
		}

		public GeneroLit getEntidade() {
			return entidade;
		}

		public void setEntidade(GeneroLit entidade) {
			this.entidade = entidade;
		}

		public Collection<GeneroLit> getEntidades() {
			return entidades;
		}

		public void setEntidades(Collection<GeneroLit> entidades) {
			this.entidades = entidades;
		}

		public void save() {
			getService().save(entidade);
		}

		public void editar(Long id) {
			this.getEntidade().setId(id);
			save();
		}


		protected GeneroLit newEntidade() {
			return new GeneroLit();
		}

		public GenService getService() {
			return service;
		}


}


