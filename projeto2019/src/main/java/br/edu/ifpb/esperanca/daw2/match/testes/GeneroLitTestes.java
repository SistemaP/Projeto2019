package br.edu.ifpb.esperanca.daw2.match.testes;

import org.junit.jupiter.api.Test;

import br.edu.ifpb.esperanca.daw2.match.classes.GeneroLit;
import br.edu.ifpb.esperanca.daw2.match.classes.Usuario;
import br.edu.ifpb.esperanca.daw2.match.services.AvaService;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.jupiter.api.DisplayName;

@DisplayName("Um teste para a classe GeneroLit")
public class GeneroLitTestes {

	@Test
	@DisplayName("Teste classe GeneroLit")

	public void selecionaGen() {
		GenService service = new GenService();
		GeneroLit g = new GeneroLit();
		service.save(g);
		
		assertNotNull(g.getId());
		
		GeneroLit a2 = service.getByID(g.getId());
		assertEquals(g, a2);
		service.update(g);
		
	}
	}
	