package br.edu.ifpb.esperanca.daw2.match.services;

import java.io.Serializable;
import java.security.MessageDigest;
import java.util.Base64;
import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import br.edu.ifpb.esperanca.daw2.match.classes.Usuario;
import br.edu.ifpb.esperanca.daw2.match.dao.UsuarioDAO;

@ApplicationScoped
public class UserService implements Serializable, Service<Usuario> {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7803325791425670859L;

	@Inject
	private UsuarioDAO userDAO;

	private Usuario update;

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * br.edu.ifpb.esperanca.daw2.services.Service#save(br.edu.ifpb.esperanca.daw2.
	 * ifoto.entities.Usuario)
	 */
	@Override
	@TransacionalCdi
	public void save(Usuario user) {
		user.setPassword(hash(user.getPassword()));
		userDAO.save(user);
	}

	private String hash(String password) {
		try {
			MessageDigest md;
			md = MessageDigest.getInstance("SHA-256");
			md.update(password.getBytes("UTF-8"));
			byte[] digest = md.digest();
			String output = Base64.getEncoder().encodeToString(digest);
			return output;
		} catch (Exception e) {
			return password;
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * br.edu.ifpb.esperanca.daw2.services.Service#update(br.edu.ifpb.esperanca.daw2
	 * .ifoto.entities.Usuario, boolean)
	 */
	@Override
	@TransacionalCdi
	public void update(Usuario user) {
		userDAO.update(user);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * br.edu.ifpb.esperanca.daw2.services.Service#delete(br.edu.ifpb.esperanca.daw2
	 * .ifoto.entities.Usuario)
	 */
	@Override
	@TransacionalCdi
	public void remove(Usuario user) {
		userDAO.remove(user);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see br.edu.ifpb.esperanca.daw2.services.Service#getByID(long)
	 */
	@Override
	public Usuario getByID(long userId) {
		return userDAO.getByID(userId);
	}

	@Override
	public List getAll() {
		return userDAO.getAll();
	}
	
}
