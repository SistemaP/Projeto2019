package br.edu.ifpb.esperanca.daw2.match.classes;

import javax.persistence.Column;
import javax.persistence.Entity;

import java.util.ArrayList;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;


@Entity
public class GeneroLit {

@SuppressWarnings("unchecked")
public GeneroLit(Class<GeneroLit> classe) {
super();
// TODO Auto-generated constructor stub
}
@Id
@Column(name="id_generolit")
private int IdGen;

private String nome;

public String getNome() {
return nome;
}

public void setNome(String nome) {
this.nome = nome;
}

public int getIdGen() {
return IdGen;
}

public void setIdGen(int idGen) {
IdGen = idGen;
}


@ManyToMany
@JoinTable(name="generolit_livro", joinColumns=@JoinColumn(name="id_livro"), inverseJoinColumns=@JoinColumn(name="id_generolit"))
private Set<GeneroLit> generos;

public GeneroLit adicionaGeneroLit(String string, ArrayList<GeneroLit> adiciona) {
// TODO Auto-generated method stub
return null;
}

@OneToMany(mappedBy="livro")
private Set<Livro> pertence;

@OneToMany
@JoinColumn(name = "id_Livro")
private Set<Livro> possui;

public void save(GeneroLit gen) {
// TODO Auto-generated method stub

}

public static GeneroLit update(GeneroLit gen) {
// TODO Auto-generated method stub
return null;
}

public void remove(GeneroLit gen) {
// TODO Auto-generated method stub

}

public GeneroLit getByID(long genId) {
// TODO Auto-generated method stub
return null;
}


public Object getNomeGeneroLit() {
// TODO Auto-generated method stub
return null;
}

public void setId(Long id) {
	// TODO Auto-generated method stub
	
}


}

