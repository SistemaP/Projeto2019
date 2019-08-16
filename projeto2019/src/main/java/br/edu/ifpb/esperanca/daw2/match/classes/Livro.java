package br.edu.ifpb.esperanca.daw2.match.classes;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity 
public class Livro {
@Id
@Column(name="id_livro")
private int ISBN;
private String nome;
private String sinopse;
private int nota;
private String foto;
private String Editora;
private String autor;
private String ondeEncontrar;

public String getNome() {
return nome;
}

public void setNome(String nome) {
this.nome = nome;
}

public String getSinopse() {
return sinopse;
}

public void setSinopse(String sinopse) {
this.sinopse = sinopse;
}

public int getNota() {
return nota;
}

public void setNota(int nota) {
this.nota = nota;
}

public String getFoto() {
return foto;
}

public void setFoto(String foto) {
this.foto = foto;
}

public String getEditora() {
return Editora;
}

public void setEditora(String editora) {
Editora = editora;
}

public String getAutor() {
return autor;
}

public void setAutor(String autor) {
this.autor = autor;
}

public String getOndeEncontrar() {
return ondeEncontrar;
}

public void setOndeEncontrar(String ondeEncontrar) {
this.ondeEncontrar = ondeEncontrar;
}


public static Livro update(Livro liv) {
// TODO Auto-generated method stub
return null;
}

public void remove(Livro liv) {
// TODO Auto-generated method stub

}

public Livro getByID(long livId) {
// TODO Auto-generated method stub
return null;
}

public void setId(Long id) {
	// TODO Auto-generated method stub
	
}

public Object getLivros() {
	// TODO Auto-generated method stub
	return null;
}

public Object getUsuario() {
	// TODO Auto-generated method stub
	return null;
}


}