import java.util.ArrayList;

public class Grupo {
	private ArrayList<Usuario> usuarios;
	private Integer posts;
	private String conversas;
	
	public ArrayList<Usuario> getUsuarios() {
		return usuarios;
	}    
	
	public void setUsuarios(ArrayList<Usuario> usuarios) {
		this.usuarios = usuarios;
	}
	public Integer getPosts() {
		return posts;
	}
	public void setPosts(Integer posts) {
		this.posts = posts;
	}
	public String getConversas() {
		return conversas;
	}
	public void setConversas(String conversas) {
		this.conversas = conversas;
	}


	

}
