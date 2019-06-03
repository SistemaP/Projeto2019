import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Usuario extends DAO {
 
	public Usuario(Class classe) {
		super(classe);
		// TODO Auto-generated constructor stub
	}

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
	private Set<Livro> avaliado;

	
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

	public Set<Livro> getAvaliado() {
		return avaliado;
	}

	public void setAvaliado(Set<Livro> avaliado) {
		this.avaliado = avaliado;
	}

	
	
}