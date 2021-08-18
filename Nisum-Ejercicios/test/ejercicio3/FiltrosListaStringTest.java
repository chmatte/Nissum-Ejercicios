package ejercicio3;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

public class FiltrosListaStringTest {

	@Test
	public void testingFiltrarStrings_numeros1a9() {
		List<String> result = FiltrosListaString.filtrarStrings(List.of("asdf","aaa","sdf","jkl","no","lal","asd"));
		List<String> expected = List.of("aaa","asd");
		
		
		assertEquals(result, expected);		
	}

}
