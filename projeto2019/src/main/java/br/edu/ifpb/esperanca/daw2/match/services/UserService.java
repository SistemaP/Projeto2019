package br.edu.ifpb.esperanca.daw2.match.services;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import br.edu.ifpb.esperanca.daw2.match.classes.Identificavel;
import br.edu.ifpb.esperanca.daw2.match.classes.Usuario;

	@ApplicationScoped
	public abstract class UserService implements Serializable, Service<Usuario> {

		/**
		 * 
		 */
		private static final long serialVersionUID = -7803325791425670859L;
		
		@Inject
		private Usuario userDAO;

		private Usuario update;
		
		/* (non-Javadoc)
		 * @see br.edu.ifpb.esperanca.daw2.services.Service#save(br.edu.ifpb.esperanca.daw2.ifoto.entities.Usuario)
		 */
		@Override
		@TransacionalCdi
		public void save(Usuario user) {
			userDAO.save(user);
		}

		/* (non-Javadoc)
		 * @see br.edu.ifpb.esperanca.daw2.services.Service#update(br.edu.ifpb.esperanca.daw2.ifoto.entities.Usuario, boolean)
		 */
		@Override
		@TransacionalCdi
		public void update(Usuario user)  {
				update = Usuario.update(user);
		}

		/* (non-Javadoc)
		 * @see br.edu.ifpb.esperanca.daw2.services.Service#delete(br.edu.ifpb.esperanca.daw2.ifoto.entities.Usuario)
		 */
		@Override
		@TransacionalCdi
		public void remove(Usuario user) {
			userDAO.remove(user);
		}

		/* (non-Javadoc)
		 * @see br.edu.ifpb.esperanca.daw2.services.Service#getByID(long)
		 */
		@Override
		public Usuario getByID(long userId)  {
				return userDAO.getByID(userId);
		}

		/* (non-Javadoc)
		 * @see br.edu.ifpb.esperanca.daw2.services.Service#getAll()
		 */
		@Override
		public String getUsuario() {
				return (String) Usuario.getNovoUsuario();
		}

		@Override
		public java.awt.List getAll() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public Identificavel getByID1(long userId) {
			// TODO Auto-generated method stub
			return null;
		}
}
