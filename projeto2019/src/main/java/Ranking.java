import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;

@Entity

public class Ranking {
	
@Id

private int posicao;
private int idRank;
int numeroPaginas;
@OneToMany
@JoinTable(

name = "rankingMeta",
joinColumns = @JoinColumn(name = "rankId"),
inverseJoinColumns = @JoinColumn(name = "rankId"))

private Set<Ranking> posiciona;

@OneToMany
@JoinColumn(name = "ranking")

private Set<Meta> estabelece;
public int getNumero_paginas() {

return numeroPaginas;
}
public int getPosicao() {
return posicao;
}
public void setPosicao(int posicao) {
this.posicao = posicao;
}
public void setNumero_paginas(int numero_paginas) {
this.numero_paginas = numero_paginas;
}
public int getMeta_paginas() {
return meta_paginas;
}
public void setMeta_paginas(int meta_paginas) {
this.meta_paginas = meta_paginas;
}

public int getIdRank() {
	return idRank;
}
public void setIdRank(int idRank) {
	this.idRank = idRank;
}

private int numero_paginas;
private int meta_paginas;

}