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
	public class GeneroLit implements Identificavel {

		@Id
		@Column(name="id_gen")
		private Long id;
		private String nome;
		
		@ManyToMany
		@JoinTable(name = "id_liv")
		private Set<Livro> pertence;

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public Long getId() {
			return id;
		}

		public void setId(Long id_gen) {
			this.id = id_gen;
		}

	
	
	@ManyToMany
	@JoinTable(name="generolit_livro", joinColumns=@JoinColumn(name="id_livro"), inverseJoinColumns=@JoinColumn(name="id_generolit"))
	private Set<GeneroLit> generos;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		GeneroLit other = (GeneroLit) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}

