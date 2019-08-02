package br.edu.ifpb.esperanca.daw2.match.bean;

import java.io.Serializable;
import java.util.Collection;
import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.edu.ifpb.esperanca.daw2.match.classes.Livro;
import br.edu.ifpb.esperanca.daw2.match.services.LivService;

	@ViewScoped
	@Named
	public class LivroBean implements Serializable {

		@Inject
		private LivService service;

		protected Livro entidade;

		protected Collection<Livro> entidades;

		public LivroBean() {
		}
		
		@PostConstruct
		public void init() {
			entidade = newEntidade();
			entidades = (Collection<Livro>) getService().getAll();
		}

		public void remove(Livro entidade) {
			getService().remove(entidade);
		}

		public Livro getEntidade() {
			return entidade;
		}

		public void setEntidade(Livro entidade) {
			this.entidade = entidade;
		}

		public Collection<Livro> getEntidades() {
			return entidades;
		}

		public void setEntidades(Collection<Livro> entidades) {
			this.entidades = entidades;
		}

		public void save() {
			getService().save(entidade);
		}

		public void editar(Long id) {
			this.getEntidade().setId(id);
			save();
		}


		protected Livro newEntidade() {
			return new Livro();
		}

		public LivService getService() {
			return service;
		}


}


