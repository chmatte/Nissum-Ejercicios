package ejercicio2;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

public class OperacionesListaStringTest {

	@Test
	public void testingListToUpperCaseHelloMyGoodWorld() {
		List<String> result = OperacionesListaString.listToUpperCase(List.of("hello"," My"," good"," wOrld"));
		List<String> expected = List.of("HELLO"," MY"," GOOD"," WORLD");
		
		
		assertEquals(result.size(), expected.size());
		assertEquals(result, expected);
	}

	@Test
	public void testingPromedioEnteros5Numeros() {
		double result = OperacionesListaString.promedioEnteros(List.of(1,2,5,7,8));
		double expected = 4.6;
		
		
		assertEquals(result, expected,0.05);
	}

}
