package br.edu.ifpb.esperanca.daw2.match.dao;

import java.util.List;

import br.edu.ifpb.esperanca.daw2.match.classes.Avaliacao;

public class AvaliacaoDAO extends DAO<Avaliacao> {
		
		public AvaliacaoDAO() {
			super(Avaliacao.class);
		}

		public List<Avaliacao> findBy(Avaliacao filtro) {
			return null;
		}
}


