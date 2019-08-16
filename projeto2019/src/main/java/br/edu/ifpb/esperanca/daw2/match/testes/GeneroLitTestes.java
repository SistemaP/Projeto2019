package br.edu.ifpb.esperanca.daw2.match.testes;

import org.junit.jupiter.api.Test;

import br.edu.ifpb.esperanca.daw2.match.classes.GeneroLit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.jupiter.api.DisplayName;

@DisplayName("Um teste para a classe GeneroLit")
public class GeneroLitTestes {

@Test
@DisplayName("Teste classe GeneroLit")

public void adicionaGeneroLit() {
List<GeneroLit> generos = new ArrayList<GeneroLit>();
List geneross = null;
for (int i = 0; i < 100; i++) {
GeneroLit g = new GeneroLit(null);
g.setNome("g"+(100-i));
generos.add(g);
}
System.out.println(geneross);
Collections.sort(geneross);
System.out.println(geneross);

}

}
