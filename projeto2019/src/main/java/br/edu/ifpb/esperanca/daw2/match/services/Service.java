package br.edu.ifpb.esperanca.daw2.match.services;


import java.util.List;

import br.edu.ifpb.esperanca.daw2.match.classes.Identificavel;
import br.edu.ifpb.esperanca.daw2.match.classes.Usuario;

public interface Service<E extends Identificavel> {

	void save(E e);

	void update(E e);

	void remove(E e);

	E getByID(long userId);

	List getAll();

	void save(Usuario user);

	void update(Usuario user);

	void remove(Usuario user);

	Identificavel getByID1(long userId);

	String getNome();

	String getUsuario();

	String getGeneroLit();

	String getAvaliacao();

	String getLivro();

}
