package br.edu.ifpb.esperanca.daw2.match.testes;

import org.junit.jupiter.api.Test;

import br.edu.ifpb.esperanca.daw2.match.classes.Livro;
import br.edu.ifpb.esperanca.daw2.match.classes.Livro;
import br.edu.ifpb.esperanca.daw2.match.classes.Usuario;
import br.edu.ifpb.esperanca.daw2.match.services.LivService;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.jupiter.api.DisplayName;

@DisplayName("Um teste para a classe Livro")
public class LivroTestes<T> {

	@Test
	@DisplayName("Teste classe Livro")

	public void adicionaLiv() {
		LivService service = new LivService();
		Livro l = new Livro();
		l.setSinopse("HÁ MUITO TEMPO");
		service.save(l);
		
		assertNotNull(l.getId());
		
		Livro l2 = service.getByID(l.getId());
		assertEquals(l, l2);
		service.update(l);
		
		Livro l3 = service.getByID(0);
		assertEquals("bom" , l3.getSinopse());
		
		service.remove(l2);
		
		Livro l4 = service.getByID(0);
		assertNull(l4);		
		
	}
	}