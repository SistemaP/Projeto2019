import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

@ApplicationScoped
public class UserService implements Serializable, Service<Identificavel> {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7803325791425670859L;
	
	@Inject
	private Identificavel userDAO;
	
	/* (non-Javadoc)
	 * @see br.edu.ifpb.esperanca.daw2.services.Service#save(br.edu.ifpb.esperanca.daw2.ifoto.entities.Usuario)
	 */
	@Override
	@TransacionalCdi
	public void save (Usuario user) {
		userDAO.save (user);
	}

	/* (non-Javadoc)
	 * @see br.edu.ifpb.esperanca.daw2.services.Service#update(br.edu.ifpb.esperanca.daw2.ifoto.entities.Usuario, boolean)
	 */
	@TransacionalCdi
	public void update (Usuario user)  {
			userDAO.update1(user);
	}

	/* (non-Javadoc)
	 * @see br.edu.ifpb.esperanca.daw2.services.Service#delete(br.edu.ifpb.esperanca.daw2.ifoto.entities.Usuario)
	 */
	
	@TransacionalCdi
	public void remove(Usuario user) {
		userDAO.remove1(user);
	}

	/* (non-Javadoc)
	 * @see br.edu.ifpb.esperanca.daw2.services.Service#getByID(long)
	 */
	
	public Identificavel getByID1(long userId)  {
			return userDAO.getByID(userId);
	}

	/* (non-Javadoc)
	 * @see br.edu.ifpb.esperanca.daw2.services.Service#getAll()
	 */
	public List<Identificavel> getAll1() {
			return userDAO.getAll();
	}

	@Override
	public void save(Identificavel e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Identificavel e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remove(Identificavel e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Identificavel getByID(long userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public java.awt.List getAll() {
		// TODO Auto-generated method stub
		return null;
	}
		
}