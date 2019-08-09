package br.edu.ifpb.esperanca.daw2.match.classes;

import java.util.Calendar;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Avaliacao {

@Id
@Column (name="id_avaliacao")
private Integer idAva;
private String comentario;
private int nota;

@ManyToMany
@JoinTable(name="avaliacao_usuario", joinColumns=@JoinColumn(name="id_usuario"), inverseJoinColumns=@JoinColumn(name="id_avaliacao"))
private Set<Avaliacao> avaliacoes;

@Temporal(TemporalType.TIMESTAMP)
private Calendar data;
private Usuario usuario;

public Calendar getData() {
return data;
}

public void setData(Calendar data) {
this.data = data;
}

public Usuario getUsuario() {
return getUsuario();
}
public void setUsuario(Usuario usuario) {
this.usuario = usuario;
}



public Object getAvaliacao() {
// TODO Auto-generated method stub
return null;
}


public int getId_ava() {
return idAva;
}

public void setId_ava(int id_ava) {
this.idAva = id_ava;
}

public String getComentario() {
return comentario;
}

public void setComentario(String comentario) {
this.comentario = comentario;
}

public int getNota() {
return nota;
}

public void setNota(int nota) {
this.nota = nota;
}

public void save(Avaliacao ava) {
// TODO Auto-generated method stub

}

public static Avaliacao update(Avaliacao ava) {
// TODO Auto-generated method stub
return null;
}

public void remove(Avaliacao ava) {
// TODO Auto-generated method stub

}

public Avaliacao getByID(long avaId) {
// TODO Auto-generated method stub
return null;
}

public static String getNovoUsuario() {
// TODO Auto-generated method stub
return null;
}
}