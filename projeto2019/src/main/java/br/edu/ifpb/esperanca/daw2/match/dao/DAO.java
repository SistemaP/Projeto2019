package br.edu.ifpb.esperanca.daw2.match.dao;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;

import br.edu.ifpb.esperanca.daw2.match.classes.Identificavel;
import br.edu.ifpb.esperanca.daw2.match.classes.Usuario;


@ApplicationScoped
public abstract class DAO<E extends Identificavel> {

	@Inject
	private static EntityManager em;

	private Class<Usuario> classe;

	public DAO(Class<Usuario> class1) {
		this.classe = class1;
	}

	public void save(Usuario obj) {
		if(obj.getId() == null) {
			em.persist(obj);
		} else {
			update(obj);
		}
	}

	public static Usuario update(Usuario usuario) {
		Usuario resultado = usuario;
		resultado = em.merge(usuario);
		return resultado;
	}

	public void remove(Usuario user) {
		user = getByID(user.getId());
		em.remove(user);
	}

	public Usuario getByID(Object object) {
		return em.find(classe, object);
	}

}