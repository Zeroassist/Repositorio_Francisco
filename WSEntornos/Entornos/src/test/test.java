package test;
import modelo.Gato;
import modelo.Perro;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


public class test {

	@Test
	void testSumar() {
		
		Perro p =new Perro("Tobi");
		//Si el perro hace guag deberia salir en verde
		assertEquals("Tobi hace guag", p.ruido());
		
		Gato g = new Gato("Fyra");
		
		//Si el gato hace miau deberia salir en verde
		assertEquals("Fyra hace miau", g.ruido());
	}

}
