package br.edu.ifpb.esperanca.daw2.match.dao;

import java.util.List;

import br.edu.ifpb.esperanca.daw2.match.classes.Usuario;

	public class UsuarioDAO extends DAO<Usuario> {
		
		public UsuarioDAO() {
			super(Usuario.class);
		}

		public List<Usuario> findBy(Usuario filtro) {
			return null;
		}
}
