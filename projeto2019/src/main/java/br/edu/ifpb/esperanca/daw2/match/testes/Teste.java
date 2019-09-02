package br.edu.ifpb.esperanca.daw2.match.testes;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.fail;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import br.edu.ifpb.esperanca.daw2.match.classes.Avaliacao;
import br.edu.ifpb.esperanca.daw2.match.classes.GeneroLit;
import br.edu.ifpb.esperanca.daw2.match.classes.Interface;
import br.edu.ifpb.esperanca.daw2.match.classes.Livro;
import br.edu.ifpb.esperanca.daw2.match.classes.LivroJaExisteException;
import br.edu.ifpb.esperanca.daw2.match.classes.Usuario;
import br.edu.ifpb.esperanca.daw2.match.classes.UsuarioJaExistenceException;

	public class Teste {

		private Teste avaliacao;

		@Test
		public void adicionarUsuario() {

			Interface usuario =null;
			ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
			Livro l;
			try {
				
				usuario.AdicionaUsuario("Teste Usuario", usuarios);
				assertNotNull(l);
				assertEquals(usuarios, l.getUsuario());
			} catch (UsuarioJaExisteException e) {
				fail();
			}
	}


		@Test
			public Avaliacao avaliaLivro () {
				
				avaliacao = null; 
				ArrayList<Avaliacao> avalia  = new ArrayList<Avaliacao>();
				Avaliacao a = avaliacao.AvaliaLivro(" cinco estrelas uau", avalia);
				assertNotNull(a);
				assertEquals(" cinco estrelas uau", a.getNome());
	}




		@Test
		public GeneroLit adicionaGeneroLit () {
			
			Teste GeneroLit; 
			ArrayList<GeneroLit> adiciona  = new ArrayList<GeneroLit>();
			GeneroLit g = adiciona.adicionaGeneroLit(" romance ", adiciona);
			assertNotNull(g);
			assertEquals("romance", g.getNome());
		}
		

		
		@Test
		public GeneroLit adicionaUsuario () {
			
			Teste Usuario; 
			ArrayList<Usuario> adiciona  = new ArrayList<Usuario>();
			Usuario u = adiciona.adicionaUsuario(" iasmim ", adiciona);
			assertNotNull(u);
			assertEquals("iasmim", u.getNome());
		}
	}

}
