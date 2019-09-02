package br.edu.ifpb.esperanca.daw2.match.testes;

import org.junit.jupiter.api.Test;
import br.edu.ifpb.esperanca.daw2.match.classes.GeneroLit;
import br.edu.ifpb.esperanca.daw2.match.classes.Usuario;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.jupiter.api.DisplayName;

@DisplayName("Um teste para a classe GeneroLit")
public class GeneroLitTestes {

	@Test
	@DisplayName("Teste classe GeneroLit")

	public void adicionaGen() {
		List<GeneroLit> generos = new ArrayList<GeneroLit>();
		List generos1 = null;
		for (int i = 0; i < 100; i++) {
			GeneroLit g = new GeneroLit();
			Usuario usuario = new Usuario();
			usuario.setNome("g" + (100 - i));
			g.setUsuario(usuario);
			generos1.add(g);
		}
		System.out.println(generos1);
		Collections.sort(generos1);
		System.out.println(generos1);

	}

}