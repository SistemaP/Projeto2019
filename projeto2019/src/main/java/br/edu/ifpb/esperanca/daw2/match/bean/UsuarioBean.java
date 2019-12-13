package br.edu.ifpb.esperanca.daw2.match.bean;

import java.io.IOException;
import java.io.Serializable;
import java.security.Principal;
import java.util.Collection;

import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import br.edu.ifpb.esperanca.daw2.match.classes.Usuario;
import br.edu.ifpb.esperanca.daw2.match.services.UserService;

@SessionScoped
@Named
public class UsuarioBean implements Serializable {

	@Inject
	private UserService service;

	protected Usuario entidade;

	protected Collection<Usuario> entidades;

	public UsuarioBean() {
	}

	@PostConstruct
	public void init() {
		entidade = newEntidade();
		entidades = (Collection<Usuario>) getService().getAll();
	}
	
	public String getUserLogin() {
		FacesContext facesContext = FacesContext.getCurrentInstance();
		ExternalContext externalContext = facesContext.getExternalContext();
		Principal userPrincipal = externalContext.getUserPrincipal();
		if (userPrincipal == null) {
			return "";
		}
		return userPrincipal.getName();
	}
	
	public void efetuarLogout() throws IOException, ServletException {
		FacesContext fc = FacesContext.getCurrentInstance();
		ExternalContext ec = fc.getExternalContext();
		HttpSession session = (HttpSession) ec.getSession(false);
		session.invalidate();
		HttpServletRequest request = (HttpServletRequest) ec.getRequest();
		request.logout();
		ec.redirect(ec.getApplicationContextPath());
	}
	
	public boolean isUserInRole(String role) {
		FacesContext facesContext = FacesContext.getCurrentInstance();
		ExternalContext externalContext = facesContext.getExternalContext();
		return externalContext.isUserInRole(role);
	}


	public void remove(Usuario entidade) {
		getService().remove(entidade);
	}

	public Usuario getEntidade() {
		return entidade;
	}

	public void setEntidade(Usuario entidade) {
		this.entidade = entidade;
	}

	public Collection<Usuario> getEntidades() {
		return entidades;
	}

	public void setEntidades(Collection<Usuario> entidades) {
		this.entidades = entidades;
	}

	public void save() {
		getService().save(entidade);
	}

	public void editar(Long id) {
		this.getEntidade().setId(id);
		save();
	}

	protected Usuario newEntidade() {
		return new Usuario();
	}

	public UserService getService() {
		return service;
	}

	public void setService(UserService service) {
		this.service = service;
	}

}
