import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class Posts {
	@Id
	private int idPost;
	private String CriarPost;
	private Integer curtidas;
	private String comentarios;
    
	@ManyToMany
	@JoinColumn(name= "idPost")
	
	public String getCriarPost() {
		return CriarPost;
	}

	public void setCriarPost(String criarPost) {
		CriarPost = criarPost;
	}

	public Integer getCurtidas() {
		return curtidas;
	}

	public void setCurtidas(Integer curtidas) {
		this.curtidas = curtidas;
	}

	public String getComentarios() {
		return comentarios;
	}

	public void setComentarios(String comentarios) {
		this.comentarios = comentarios;
	}
}
