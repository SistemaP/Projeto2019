import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Usuario {
 
	@Id
	@Column(name="id_usuario")
	private int idUsu;
	private String interesses;
	private String nome;
	private String amigos;
	
	@Column(name="grupo_disc")
	private String grupoDeDiscussoes;

	@OneToMany(mappedBy="usuario")
	private Set<Usuario> avalia;
	
	@OneToMany
	@JoinColumn(name = "id_Usuario")
	private Set<Livros> avaliado;

	
	public int getIdUsu() {
		return idUsu;
	}

	public void setIdUsu(int idUsu) {
		this.idUsu = idUsu;
	}

	public String getInteresses() {
		return interesses;
	}

	public void setInteresses(String interesses) {
		this.interesses = interesses;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getAmigos() {
		return amigos;
	}

	public void setAmigos(String amigos) {
		this.amigos = amigos;
	}

	public String getGrupoDeDiscussoes() {
		return grupoDeDiscussoes;
	}

	public void setGrupoDeDiscussoes(String grupoDeDiscussoes) {
		this.grupoDeDiscussoes = grupoDeDiscussoes;
	}

	public Set<Usuario> getAvalia() {
		return avalia;
	}

	public void setAvalia(Set<Usuario> avalia) {
		this.avalia = avalia;
	}

	public Set<Livros> getAvaliado() {
		return avaliado;
	}

	public void setAvaliado(Set<Livros> avaliado) {
		this.avaliado = avaliado;
	}

	
	
}