import java.util.ArrayList;

public interface Interface {
	public Grupo criarGrupo(
			String nomeGrupo, ArrayList<Grupo> grupos)
		 	throws GrupoJaExisteException;
			
	public Livros adicionarLivro(
			String nomeLivro, ArrayList<Livros> Livros)
			throws LivroJaExisteException;
	
	public Usuario adcionaUsuario(
			String nomeUsuario, ArrayList<Usuario>usuarios)
			throws UsuarioJaExisteException;
			
	public Avaliacao avaliaLivro(
			String comentarioAvaliacao, ArrayList <Avaliacao> avalia, 
			String notaAvaliacao , ArrayList <Avaliacao> avaliar);
	
	public Posts adcionarPost(
			String criarPost, ArrayList<Posts> adcionados);
	
			

}
