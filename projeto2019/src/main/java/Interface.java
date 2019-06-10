public interface Interface {
			
	public Livro adicionarLivro(
			String nomeLivro)
			throws LivroJaExisteException;
			
	public Usuario avaliaLivro(
			String comentarioUsuario,
			int notaUsuario );
	
	public Usuario adicionarUsuario(
			String loginUsuario)
	        throws UsuarioJaExisteException;
	
}