import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;

public class Teste {

	@Test
	public void criarGrupo() {

		Interface grupo =null;
		ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
		Grupo g;
		try {
			g = grupo.criarGrupo("Teste grupo", usuarios);
			assertNotNull(g);
			assertEquals(usuarios, g.getUsuarios());
		} catch (GrupoJaExisteException e) {
			fail();
		}
	}

	@Test
		public Grupo adcionaLivro() {
			
			Teste livro; 
			ArrayList<Livros> livros  = new ArrayList<Livros>();
			Grupo g = livro.AdcionaLivro("Teste livro tal", livros);
			void assertNotNull(g);
			assertEquals("Teste livro tal", g.getNomeLivro());			
			
}

	@Test
		public Usuario adcionaUsuario() {
	
			Teste usuario; 
			ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
			Usuario g = usuario.NovoUsuario("iasmim", usuarios);
			void assertNotNull(g);
			assertEquals("iasmim", g.getNomeUsuario());
}

	@Test
		public Avaliacao avaliaLivro () {
			
			Teste avaliacao; 
			ArrayList<Avaliacao> avalia  = new ArrayList<Avaliacao>();
			Grupo g = avaliacao.AvaliaLivro("Teste livro", livros);
			void assertNotNull(g);
			assertEquals("Teste livro", g.getNomeAvaliacao());
}

	@Test
		public Posts adcionaPost() {
				
			Teste posts; 
			ArrayList<Posts> adcionados  = new ArrayList<Posts>();
			Grupo g = posts.AdcionaPosts("Teste adciona posts", posts);
			void assertNotNull(g);
			assertEquals("Teste adciona posts", g.getNomePosts());			
}
}
