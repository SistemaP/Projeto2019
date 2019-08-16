package br.edu.ifpb.esperanca.daw2.match.testes;

import org.junit.jupiter.api.Test;

import br.edu.ifpb.esperanca.daw2.match.classes.Livro;
import br.edu.ifpb.esperanca.daw2.match.classes.Usuario;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.jupiter.api.DisplayName;

@DisplayName("Um teste para a classe Livro")
public class LivroTestes<T> {

@Test
@DisplayName("Teste classe Livro")

public void adicionaPet() {
List<Livro> livross = new ArrayList<Livro>();
List livros = null;
for (int i = 0; i < 100; i++) {
Livro l = new Livro();
l.setNome("a"+(100-i));
List<Livro> livro;
livro.add(l);
}
System.out.println(livross);
Collections.sort((List<T>) livross);
char[] l;
System.out.println(l);

}


}
