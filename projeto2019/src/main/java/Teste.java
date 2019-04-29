import java.util.ArrayList;

public class Teste {

		@Test
		public Grupo criarGrupo;
			
			Teste grupo; 
			ArrayList<Grupo> grupos  = new ArrayList<Grupo>();
			Grupo g = grupo.CriarGrupo("Teste grupo", grupos);
			void assertNotNull(g);
			assertEquals("Teste grupo", g.getNomeGrupo());
			
}

		@Test
		public Grupo adcionaLivro;
			
			Teste livro; 
			ArrayList<Livros> livros  = new ArrayList<Livros>();
			Grupo g = livro.AdcionaLivro("Teste livro tal", livros);
			void assertNotNull(g);
			assertEquals("Teste Livro tal", g.getNomeLivro());			
			
}

		@Test
		public Usuario adcionaUsuario;
	
			Teste usuario; 
			ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
			Usuario g = usuario.NovoUsuario("iasmim", usuarios);
			void assertNotNull(g);
			assertEquals("iasmim", g.getNomeUsuario());
}
			
		@Test
		public Avaliacao avaliaLivro;
			
			Teste avaliacao; 
			ArrayList<Avaliacao> avalia  = new ArrayList<Avaliacao>();
			Grupo g = avaliacao.AvaliaLivro("Teste livro", livros);
			void assertNotNull(g);
			assertEquals("Teste livro", g.getNomeAvaliacao());
}
			
		@Test
		public Posts adcionaPost;
				
			Teste posts; 
			ArrayList<Posts> adcionados  = new ArrayList<Posts>();
			Grupo g = posts.AdcionaPosts("Teste adciona posts", posts);
			void assertNotNull(g);
			assertEquals("Teste adciona posts", g.getNomePosts());			
}

