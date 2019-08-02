package br.edu.ifpb.esperanca.daw2.match.bean;

import java.io.Serializable;
import java.util.Collection;
import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.edu.ifpb.esperanca.daw2.match.classes.Genero;
import br.edu.ifpb.esperanca.daw2.match.services.GenService;

	@ViewScoped
	@Named
	public class GeneroBean implements Serializable {

		@Inject
		private GenService service;

		protected Genero entidade;

		protected Collection<Genero> entidades;

		public GeneroBean() {
		}
		
		@PostConstruct
		public void init() {
			entidade = newEntidade();
			entidades = (Collection<Genero>) getService().getAll();
		}

		public void remove(Genero entidade) {
			getService().remove(entidade);
		}

		public Genero getEntidade() {
			return entidade;
		}

		public void setEntidade(Genero entidade) {
			this.entidade = entidade;
		}

		public Collection<Genero> getEntidades() {
			return entidades;
		}

		public void setEntidades(Collection<Genero> entidades) {
			this.entidades = entidades;
		}

		public void save() {
			getService().save(entidade);
		}

		public void editar(Long id) {
			this.getEntidade().setId(id);
			save();
		}


		protected Genero newEntidade() {
			return new Genero();
		}

		public GenService getService() {
			return service;
		}


}


