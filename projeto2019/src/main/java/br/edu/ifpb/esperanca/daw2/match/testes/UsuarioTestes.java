package br.edu.ifpb.esperanca.daw2.match.testes;

import org.junit.jupiter.api.Test;

import br.edu.ifpb.esperanca.daw2.match.classes.Usuario;
import br.edu.ifpb.esperanca.daw2.match.services.UserService;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.jupiter.api.DisplayName;

@DisplayName("Um teste para a classe usu")
public class UsuarioTestes<T> {

	@Test
	@DisplayName("Teste classe usu")

	public void adicionaUsu () {
		UserService service = new UserService();
		Usuario u = new Usuario();
		u.setNome("eu");
		service.save(u);
		
		assertNotNull(u.getId());
		
		Usuario u2 = service.getByID(u.getId());
		assertEquals(u, u2);
		service.update(u);
		
		Usuario u3 = service.getByID(0);
		assertEquals("bom" , u3.getNome());
		
		service.remove(u2);
		
		Usuario u4 = service.getByID(0);
		assertNull(u4);		
		
	}
	}