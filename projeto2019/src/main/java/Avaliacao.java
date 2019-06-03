import java.util.Calendar;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
public class Avaliacao extends DAO {

	public Avaliacao(Class classe) {
		super(classe);
		// TODO Auto-generated constructor stub
	}
	@Id
	private Integer id;
	
	@ManyToOne
	@JoinColumn(name="id_usuario")
	private Usuario usuario;
	
	private String comentario;
	private Integer nota;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Calendar data;
	
	public Calendar getData() {
		return data;
	}
	
	public void setData(Calendar data) {
		this.data = data;
	}
	
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	public String getComentario() {
		return comentario;
	}
	public void setComentario(String comentario) {
		this.comentario = comentario;
	}
	public Integer getNota() {
		return nota;
	}
	public void setNota(Integer nota) {
		this.nota = nota;
	}
	
	
	
	
}
