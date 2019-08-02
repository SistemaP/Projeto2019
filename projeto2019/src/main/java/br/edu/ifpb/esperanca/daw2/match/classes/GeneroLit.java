package br.edu.ifpb.esperanca.daw2.match.classes;

	import java.util.Set;

	import javax.persistence.Entity;
	import javax.persistence.Id;
	import javax.persistence.JoinColumn;
	import javax.persistence.OneToMany;


	@Entity
	public class GeneroLit {
		
		@SuppressWarnings("unchecked")
		public GeneroLit(Class<GeneroLit> classe) {
			super();
			// TODO Auto-generated constructor stub
		}
		@Id
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
		
		}



