package br.edu.ifpb.esperanca.daw2.match.testes;

import org.junit.jupiter.api.Test;
import br.edu.ifpb.esperanca.daw2.match.classes.Avaliacao;
import br.edu.ifpb.esperanca.daw2.match.classes.Usuario;
import br.edu.ifpb.esperanca.daw2.match.services.AvaService;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.junit.jupiter.api.DisplayName;

@DisplayName("Um teste para a classe Avaliacao")
public class AvaliacaoTestes {

	@Test
	@DisplayName("Teste classe Avaliacao")
	
	public void adicionaAvaliacao() {
		AvaService service = new AvaService();
		Avaliacao a = new Avaliacao();
		a.setComentario("otimo");
		service.save(a);
		
		assertNotNull(a.getId());
		
		Avaliacao a2 = service.getByID(a.getId());
		assertEquals(a, a2);
		service.update(a);
		
		Avaliacao a3 = service.getByID(0);
		assertEquals("bom" , a3.getComentario());
		
		service.remove(a2);
		
		Avaliacao a4 = service.getByID(0);
		assertNull(a4);		
		
	}
	}