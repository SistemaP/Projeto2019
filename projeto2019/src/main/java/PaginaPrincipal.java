import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;

@Entity

public class PaginaPrincipal {
private int idPag;
 
@OneToMany
@JoinTable(
 
name = "paginaprincipal_livros",
joinColumns = @JoinColumn(name = "pag_id"),
inverseJoinColumns = @JoinColumn(name = "livros_id"))

private Set<PaginaPrincipal> destaca ;

@OneToMany

@JoinColumn(name = "idLivros")
private Set<Avaliacao> direciona;

public int getIdPag() {
	return idPag;
}

public void setIdPag(int idPag) {
	this.idPag = idPag;
}
}