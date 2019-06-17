import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;

public class Teste {

	private Teste avaliacao;

	@Test
	public void adicionarLivro() {

		Interface livro =null;
		ArrayList<Livro> livros = new ArrayList<Livro>();
		Livro l;
		try {
			
			livro.AdicionaLivro("Teste Livro", livros);
			assertNotNull(l);
			assertEquals(livros, l.getLivros());
		} catch (LivroJaExisteException e) {
			fail();
		}
}


	@Test
		public Avaliacao avaliaLivro () {
			
			avaliacao = null; 
			ArrayList<Avaliacao> avalia  = new ArrayList<Avaliacao>();
			Avaliacao a = avaliacao.AvaliaLivro(" cinco estrelas uau", avalia);
			assertNotNull(a);
			assertEquals(" cinco estrelas uau", a.getAvaliacao());
			return a;
}


	private Avaliacao AvaliaLivro(String string, ArrayList<Avaliacao> avalia) {
		// TODO Auto-generated method stub
		return null;
	}


	@Test
	public GeneroLit adcionaGeneroLit () {
		
		Teste GeneroLit; 
		ArrayList<GeneroLit> adiciona  = new ArrayList<GeneroLit>();
		GeneroLit g = adiciona.adicionaGeneroLit(" romance ", adiciona);
		assertNotNull(g);
		assertEquals(" romance", g.getNomeGeneroLit());
	}
	

	@Test
	public GeneroLit adicionaPerfil () {
		
		Teste Perfil; 
		ArrayList<Perfil> adiciona  = new ArrayList<Perfil>();
		Perfil p = adiciona.adicionaPerfil(" iasmim ", adiciona);
		assertNotNull(p);
		assertEquals(" iasmim", p.getNomePerfil());
	}
	
	@Test
	public GeneroLit adicionaUsuario () {
		
		Teste Usuario; 
		ArrayList<Usuario> adiciona  = new ArrayList<Usuario>();
		Usuario u = adiciona.adicionaUsuario(" iasmim ", adiciona);
		assertNotNull(u);
		assertEquals(" iasmim", u.getNomeUsuario());
	}
}
