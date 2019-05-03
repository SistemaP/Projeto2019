import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;

@Entity
public class Grupo {

	@Id
	private int idGru;
	private String nome;
	private ArrayList<Usuario> usuarios;
	private Integer posts;
	private String conversas;

	@ManyToMany
	@JoinColumn(name = "idUsu")

	public ArrayList<Usuario> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(ArrayList<Usuario> usuarios) {
		this.usuarios = usuarios;
	}

	public Integer getPosts() {
		return posts;
	}

	public void setPosts(Integer posts) {
		this.posts = posts;
	}

	public String getConversas() {
		return conversas;
	}

	public void setConversas(String conversas) {
		this.conversas = conversas;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
