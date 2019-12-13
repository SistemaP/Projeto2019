package br.edu.ifpb.esperanca.daw2.match.bean;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.util.Collection;

import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.PhaseId;
import javax.inject.Inject;
import javax.inject.Named;

import org.primefaces.event.FileUploadEvent;
import org.primefaces.model.DefaultStreamedContent;
import org.primefaces.model.StreamedContent;
import org.primefaces.model.UploadedFile;

import br.edu.ifpb.esperanca.daw2.match.classes.Livro;
import br.edu.ifpb.esperanca.daw2.match.services.LivService;

@SessionScoped
@Named
public class LivroBean implements Serializable {

	@Inject
	private LivService service;

	protected Livro entidade;

	protected Collection<Livro> entidades;

	private UploadedFile foto;

	public LivroBean() {
	}

	public UploadedFile getFoto() {
		return foto;
	}

	public void setFoto(UploadedFile foto) {
		this.foto = foto;
	}

	@PostConstruct
	public void init() {
		entidade = newEntidade();
		entidades = (Collection<Livro>) getService().getAll();
	}

	public void remove(Livro entidade) {
		getService().remove(entidade);
	}

	public Livro getEntidade() {
		return entidade;
	}

	public void setEntidade(Livro entidade) {
		this.entidade = entidade;
	}

	public Collection<Livro> getEntidades() {
		return entidades;
	}

	public void setEntidades(Collection<Livro> entidades) {
		this.entidades = entidades;
	}

	public void save() throws Exception {
		getService().save(entidade);
		if (foto != null) {
			File file = new File("C:\\Users\\Aluno\\git\\Projeto20192\\projeto2019\\src\\main\\webapp\\capas",
					entidade.getId() + ".PNG");
			OutputStream out = new FileOutputStream(file);
			out.write(foto.getContents());
			out.close();
		}
		entidades = (Collection<Livro>) getService().getAll();
	}

	public StreamedContent getStreamedImageById(Long id) throws FileNotFoundException {
		if (id == null)
			id = 3l;
		File file = new File("C:\\Users\\Aluno\\git\\Projeto20192\\projeto2019\\src\\main\\webapp\\capas", id + ".PNG");
		FileInputStream in = new FileInputStream(file);
		return new DefaultStreamedContent(in, "image/png");
	}

	public void editar(Long id) throws Exception {
		this.getEntidade().setId(id);
		save();
	}

	protected Livro newEntidade() {
		return new Livro();
	}

	public LivService getService() {
		return service;
	}

	public void setService(LivService service) {
		this.service = service;
	}

	public void handleFileUpload(FileUploadEvent event) {
		System.out.println("Successful" + event.getFile().getFileName() + " is uploaded.");
	}

}
