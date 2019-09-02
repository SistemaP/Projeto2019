package br.edu.ifpb.esperanca.daw2.match.testes;

import org.junit.jupiter.api.Test;
import br.edu.ifpb.esperanca.daw2.match.classes.Avaliacao;
import br.edu.ifpb.esperanca.daw2.match.classes.Usuario;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.junit.jupiter.api.DisplayName;

@DisplayName("Um teste para a classe Avaliacao")
public class AvaliacaoTestes {

	@Test
	@DisplayName("Teste classe Avaliacao")

	public void adicionaAva() {
		List<Avaliacao> avaliacoes = new ArrayList<Avaliacao>();
		List avaliacoes1 = null;
		for (int i = 0; i < 100; i++) {
			Avaliacao a = new Avaliacao();
			Usuario usuario = new Usuario();
			usuario.setNome("a" + (100 - i));
			a.setUsuario(usuario);
			avaliacoes1.add(a);
		}
		System.out.println(avaliacoes1);
		Collections.sort(avaliacoes1);
		System.out.println(avaliacoes1);

	}

}
