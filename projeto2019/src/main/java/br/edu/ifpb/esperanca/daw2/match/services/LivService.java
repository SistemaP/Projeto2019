package br.edu.ifpb.esperanca.daw2.match.services;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import br.edu.ifpb.esperanca.daw2.match.classes.Identificavel;
import br.edu.ifpb.esperanca.daw2.match.classes.Livro;
import br.edu.ifpb.esperanca.daw2.match.classes.Usuario;
import br.edu.ifpb.esperanca.daw2.match.dao.LivroDAO;


	@ApplicationScoped
	public class LivService implements Serializable, Service<Livro> {

		/**
		 * 
		 */
		private static final long serialVersionUID = -7803325791425670859L;
		
		@Inject
		private LivroDAO livDAO;

		private Livro update;
		
		/* (non-Javadoc)
		 * @see br.edu.ifpb.esperanca.daw2.services.Service#save(br.edu.ifpb.esperanca.daw2.ifoto.entities.Livro)
		 */
		@Override
		@TransacionalCdi
		public void save(Livro liv) {
			livDAO.save(liv);
		}

		/* (non-Javadoc)
		 * @see br.edu.ifpb.esperanca.daw2.services.Service#update(br.edu.ifpb.esperanca.daw2.ifoto.entities.Livro, boolean)
		 */
		@Override
		@TransacionalCdi
		public void update(Livro liv)  {
			livDAO.update(liv);
		}

		/* (non-Javadoc)
		 * @see br.edu.ifpb.esperanca.daw2.services.Service#delete(br.edu.ifpb.esperanca.daw2.ifoto.entities.Livro)
		 */
		@Override
		@TransacionalCdi
		public void remove(Livro liv) {
			livDAO.remove(liv);
		}

		/* (non-Javadoc)
		 * @see br.edu.ifpb.esperanca.daw2.services.Service#getByID(long)
		 */
		@Override
		public Livro getByID(long livId)  {
				return livDAO.getByID(livId);
		}

		@Override
		public List<Livro> getAll() {
			return livDAO.getAll();
		}

	}
