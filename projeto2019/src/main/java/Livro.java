import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;

@Entity 
public class Livro {
	@Id
	private int ISBN;
	private String nome;
	private String sinopse;
	private int nota;
	private String foto;
	private String Editora;
	private String autor;
	private String ondeEncontrar;
	
	@OneToMany
	@JoinTable(

			name = "livros_usuario", joinColumns = @JoinColumn(name = "liv_id"), inverseJoinColumns = @JoinColumn(name = "usuario_id"))

	private Set<Livro> direciona;
	
	@OneToMany
	
	@JoinColumn(name = "id_Livro")
	private Set<Perfil> direciona1;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSinopse() {
		return sinopse;
	}

	public void setSinopse(String sinopse) {
		this.sinopse = sinopse;
	}

	public int getNota() {
		return nota;
	}

	public void setNota(int nota) {
		this.nota = nota;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public String getEditora() {
		return Editora;
	}

	public void setEditora(String editora) {
		Editora = editora;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getOndeEncontrar() {
		return ondeEncontrar;
	}

	public void setOndeEncontrar(String ondeEncontrar) {
		this.ondeEncontrar = ondeEncontrar;
	}
	
}
