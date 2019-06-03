import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;

public class Teste {

	@Test
	public void adicionarLivro() {

		Interface livro =null;
		ArrayList<Livro> livros = new ArrayList<Livro>();
		Livro l;
		try {
			
			livro.AdicionaLivro("Teste Livro", livros);
			assertNotNull(l);
			assertEquals(livros, l.getLivro());
		} catch (LivroJaExisteException e) {
			fail();
		}
	}
			


	@Test
		public Usuario adcionaUsuario() {
	
			Teste usuario; 
			ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
			Usuario u = usuario.NovoUsuario("iasmim", usuarios);
			assertNotNull(u);
			assertEquals("iasmim", u.setNovoUsuario());
}

	private Usuario NovoUsuario(String string, ArrayList<Usuario> usuarios) {
		// TODO Auto-generated method stub
		return null;
	}



	@Test
		public Avaliacao avaliaLivro () {
			
			Teste avaliacao; 
			ArrayList<Avaliacao> avalia  = new ArrayList<Avaliacao>();
			Avaliacao a = avaliacao.AvaliaLivro(" cinco estrelas uau", avalia);
			assertNotNull(a);
			assertEquals(" cinco estrelas uau", a.getNomeAvaliacao());
}



	private Avaliacao AvaliaLivro(String string, ArrayList<Avaliacao> avalia) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
