package br.edu.ifpb.esperanca.daw2.match.services;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import br.edu.ifpb.esperanca.daw2.match.classes.Avaliacao;
import br.edu.ifpb.esperanca.daw2.match.dao.AvaliacaoDAO;

@ApplicationScoped
public abstract class AvaService implements Serializable, Service<Avaliacao> {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7803325791425670859L;

	@Inject
	private AvaliacaoDAO avaDAO;

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * br.edu.ifpb.esperanca.daw2.services.Service#save(br.edu.ifpb.esperanca.daw2.
	 * ifoto.entities.Avaliacao)
	 */
	@Override
	@TransacionalCdi
	public void save(Avaliacao ava) {
		avaDAO.save(ava);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * br.edu.ifpb.esperanca.daw2.services.Service#update(br.edu.ifpb.esperanca.daw2
	 * .ifoto.entities.Avaliacao, boolean)
	 */
	@Override
	@TransacionalCdi
	public void update(Avaliacao ava) {
		avaDAO.update(ava);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * br.edu.ifpb.esperanca.daw2.services.Service#delete(br.edu.ifpb.esperanca.daw2
	 * .ifoto.entities.Avaliacao)
	 */
	@Override
	@TransacionalCdi
	public void remove(Avaliacao ava) {
		avaDAO.remove(ava);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see br.edu.ifpb.esperanca.daw2.services.Service#getByID(long)
	 */
	@Override
	public Avaliacao getByID(long avaId) {
		return avaDAO.getByID(avaId);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see br.edu.ifpb.esperanca.daw2.services.Service#getAll()
	 */
	@Override
	public List<Avaliacao> getAll() {
		return avaDAO.getAll();
	}

}
