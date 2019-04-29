import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;

@Entity 
public class Livros {
	@Id
	private int idLiv;
	private String titulo;
	private String descricao;
	private String avaliacoes_de_usuarios;
	private String quem_ja_leu;
	private String dialogos;
	private String site;
	@OneToMany
	@JoinTable(

			name = "livros_paginaPrincipal", joinColumns = @JoinColumn(name = "liv_id"), inverseJoinColumns = @JoinColumn(name = "paginaprincipal_id"))

	private Set<Livros> direciona;
	
	@OneToMany
	
	@JoinColumn(name = "id_Livros")
	private Set<PaginaPrincipal> direciona1;

	public int getIdLiv() {
		return idLiv;
	}

	public void setId(int idLiv) {
		this.idLiv = idLiv;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;

	}

	
	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getAvaliacoes_de_usuarios() {
		return avaliacoes_de_usuarios;
	}

	public void setAvaliacoes_de_usuarios(String avaliacoes_de_usuarios) {
		this.avaliacoes_de_usuarios = avaliacoes_de_usuarios;
	}

	public String getQuem_ja_leu() {
		return quem_ja_leu;
	}

	public void setQuem_ja_leu(String quem_ja_leu) {
		this.quem_ja_leu = quem_ja_leu;
	}

	public String getSite() {
		return site;
	}

	public void setSite(String site) {
		this.site = site;
	}

	public String getDialogos() {
		return dialogos;
	}

	public void setDialogos(String dialogos) {
		this.dialogos = dialogos;
	}
}
