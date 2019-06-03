import java.util.ArrayList;

public interface Interface {
			
	public Livro adicionarLivro(
			String nomeLivro)
			throws LivroJaExisteException;
	
	public Usuario adcionaUsuario(
			String nomeUsuario, String interesses, String amigos)
			throws UsuarioJaExisteException;
			
	public Avaliacao avaliaLivro(
			String comentarioAvaliacao,
			int notaAvaliacao );
	
	public Selecionar selecionarLivro(
			int id);
	
}