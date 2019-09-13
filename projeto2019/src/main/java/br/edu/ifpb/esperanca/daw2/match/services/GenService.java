package br.edu.ifpb.esperanca.daw2.match.services;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import br.edu.ifpb.esperanca.daw2.match.classes.GeneroLit;
import br.edu.ifpb.esperanca.daw2.match.dao.GeneroLitDAO;

@ApplicationScoped
public class GenService implements Serializable, Service<GeneroLit> {

		/**
		 * 
		 */
	private static final long serialVersionUID = -7803325791425670859L;
		
		@Inject
		private GeneroLitDAO genDAO;
		
		/* (non-Javadoc)
		 * @see 
		 * br.edu.ifpb.esperanca.daw2.services.Service#save(br.edu.ifpb.esperanca.daw2.ifoto.entities.Usuario)
		 */
		@Override
		@TransacionalCdi
		public void save(GeneroLit gen) {
			genDAO.save(gen);
		}

		/* (non-Javadoc)
		 * @see
		 *  br.edu.ifpb.esperanca.daw2.services.Service#update(br.edu.ifpb.esperanca.daw2.ifoto.entities.GeneroLit, boolean)
		 */
		@Override
		@TransacionalCdi
		public void update(GeneroLit gen)  {
				genDAO.update(gen);
		}

		/* (non-Javadoc)
		 * @see
		 *  br.edu.ifpb.esperanca.daw2.services.Service#delete(br.edu.ifpb.esperanca.daw2.ifoto.entities.GeneroLit)
		 */
		@Override
		@TransacionalCdi
		public void remove(GeneroLit gen) {
			genDAO.remove(gen);
		}

		/* (non-Javadoc)
		 * @see 
		 * br.edu.ifpb.esperanca.daw2.services.Service#getByID(long)
		 */
		@Override
		public GeneroLit getByID(long genId)  {
				return genDAO.getByID(genId);
		}

		/* (non-Javadoc)
		 * 
		 * @see
		 *  br.edu.ifpb.esperanca.daw2.services.Service#getAll()
		 */
		
		@Override
		public List<GeneroLit> getAll() {
			return genDAO.getAll();
		}
	}
		

