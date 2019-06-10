import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
      public class Usuario extends DAO {
	 

	  public Usuario() {
              super(Usuario.class);
      // TODO Auto-generated constructor stub
     	
}
	@Id
	@Column(name="id_usuario")
	private int IdUsu;
	private String nome;
	private String biografia;
	private String email;
	private String foto;
	

	@OneToMany(mappedBy="livro")
	private Set<Livro> avalia;
	
	@OneToMany
	@JoinColumn(name = "id_Usuario")
	private Set<Livro> avaliado;

	@OneToMany(mappedBy="generoLit")
	private Set<GeneroLit> seleciona;
	
	@OneToMany
	@JoinColumn(name = "id_Gen")
	private Set<GeneroLit> selecionado;
	
	public int getIdUsu() {
		return IdUsu;
	}

	public void setIdUsu( int IdUsu) {
		this.IdUsu = IdUsu ;
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
	
	public Object getId() {
		// TODO Auto-generated method stub
		return null;
	}

	public Object getNovoUsuario() {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Usuario> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	
	
}