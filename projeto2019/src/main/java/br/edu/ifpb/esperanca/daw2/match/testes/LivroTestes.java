package br.edu.ifpb.esperanca.daw2.match.testes;

import org.junit.jupiter.api.Test;

import br.edu.ifpb.esperanca.daw2.match.classes.Avaliacao;
import br.edu.ifpb.esperanca.daw2.match.classes.Livro;
import br.edu.ifpb.esperanca.daw2.match.classes.Usuario;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.jupiter.api.DisplayName;

@DisplayName("Um teste para a classe Livro")
public class LivroTestes<T> {

	@Test
	@DisplayName("Teste classe Livro")

	public void adicionaLiv() {
		List<Livro> livros = new ArrayList<Livro>();
		List livros1 = null;
		for (int i = 0; i < 100; i++) {
			Livro l = new Livro();
			Usuario usuario = new Usuario();
			usuario.setNome("l" + (100 - i));
			l.setUsuario(usuario);
			livros1.add(l);
		}
		System.out.println(livros1);
		Collections.sort(livros1);
		System.out.println(livros1);

	}

}
