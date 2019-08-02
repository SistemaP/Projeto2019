package br.edu.ifpb.esperanca.daw2.match.bean;

import java.io.Serializable;
import java.util.Collection;
import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.edu.ifpb.esperanca.daw2.match.classes.Avaliacao;
import br.edu.ifpb.esperanca.daw2.match.services.AvaService;

	@ViewScoped
	@Named
	public class AvaliacaoBean implements Serializable {

		@Inject
		private AvaService service;

		protected Avaliacao entidade;

		protected Collection<Avaliacao> entidades;

		public AvaliacaoBean() {
		}
		
		@PostConstruct
		public void init() {
			entidade = newEntidade();
			entidades = (Collection<Avaliacao>) getService().getAll();
		}

		public void remove(Avaliacao entidade) {
			getService().remove(entidade);
		}

		public Avaliacao getEntidade() {
			return entidade;
		}

		public void setEntidade(Avaliacao entidade) {
			this.entidade = entidade;
		}

		public Collection<Avaliacao> getEntidades() {
			return entidades;
		}

		public void setEntidades(Collection<Avaliacao> entidades) {
			this.entidades = entidades;
		}

		public void save() {
			getService().save(entidade);
		}

		public void editar(Long id) {
			this.getEntidade().setId(id);
			save();
		}


		protected Avaliacao newEntidade() {
			return new Avaliacao();
		}

		public AvaService getService() {
			return service;
		}


}


