package br.edu.ifpb.esperanca.daw2.match.classes;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class Usuario implements Identificavel {

	@Id
	@Column(name = "id_usuario")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String nome;
	private String biografia;
	private String email;
	private String foto;
	private String username;
	private String password;
	private String grupo;
	

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getGrupo() {
		return grupo;
	}

	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}

	@OneToMany
	@JoinColumn(name = "id_livro")
	private Set<Livro> adiciona;

	public Set<Livro> getAdiciona() {
		return adiciona;
	}

	public void setAdiciona(Set<Livro> adiciona) {
		this.adiciona = adiciona;
	}

	public Set<Livro> getAvalia() {
		return avalia;
	}

	public void setAvalia(Set<Livro> avalia) {
		this.avalia = avalia;
	}

	public Set<GeneroLit> getSeleciona() {
		return seleciona;
	}

	public void setSeleciona(Set<GeneroLit> seleciona) {
		this.seleciona = seleciona;
	}

	@OneToMany
	@JoinColumn(name = "id_livro")
	private Set<Livro> avalia;

	@OneToMany
	@JoinColumn(name = "id_Gen")
	private Set<GeneroLit> seleciona;

	public Long getId() {
		return id;
	}

	public void setId(Long IdUsu) {
		this.id = IdUsu;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getBiografia() {
		return biografia;
	}

	public void setBiografia(String biografia) {
		this.biografia = biografia;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}
