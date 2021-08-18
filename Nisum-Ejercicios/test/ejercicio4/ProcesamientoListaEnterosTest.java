package ejercicio4;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

public class ProcesamientoListaEnterosTest {

	@Test
	public void test() {
		String result = ProcesamientoListaEnteros.filtrarListaEnteros(List.of(1,2,3,4,5,6,7,8,9));
		String expected = "o1,e2,o3,e4,o5,e6,o7,e8,o9";
		
		
		assertEquals(result, expected);
	}

}
