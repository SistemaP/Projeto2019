import java.util.ArrayList;

public interface Interface {
	public Grupo criarGrupo(
			String nomeGrupo, ArrayList<Usuario> usuarios)
		 	throws GrupoJaExisteException;
			
	public Livros adicionarLivro(
			String nomeLivro)
			throws LivroJaExisteException;
	
	public Usuario adcionaUsuario(
			String nomeUsuario, String interesses, String amigos)
			throws UsuarioJaExisteException;
			
	public Avaliacao avaliaLivro(
			String comentarioAvaliacao,
			int notaAvaliacao );
	
	public Posts adcionarPost(
			String criarPost, );
	
			

}
