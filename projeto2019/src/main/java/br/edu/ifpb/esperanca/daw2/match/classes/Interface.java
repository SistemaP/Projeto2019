package br.edu.ifpb.esperanca.daw2.match.classes;

import java.util.ArrayList;

	public interface Interface {
		public Livro adicionarLivro(
			String nomeLivro)
			throws LivroJaExisteException;
			
		public Usuario avaliaLivro(
			String comentarioUsuario,
			int notaUsuario );
	
		public Usuario adicionarUsuario(
			String nomeUsuario);

		public void AdicionaLivro(String string, ArrayList<Livro> livros);
	

}
