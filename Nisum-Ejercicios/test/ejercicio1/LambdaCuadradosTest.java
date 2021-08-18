package ejercicio1;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

public class LambdaCuadradosTest {
	
	

	@Test
	public void testingLamdba_SonCuadrados() {
		List<Integer> cuadrados = LambdaCuadrados.lamdbaCuadradosPares().get();
		
		for (Integer cuadrado : cuadrados) {
			double raiz = Math.sqrt(cuadrado);
			if(raiz-Math.floor(raiz) != 0) {
				fail(String.format("%s no es un cuadrado", cuadrado));
			}
		}
	}
	
	@Test
	public void testingLambda_SonPares() {
		List<Integer> pares = LambdaCuadrados.lamdbaCuadradosPares().get();
		for (Integer par : pares) {
			if(par%2!=0) {
				fail(String.format("%s no es un par", par));
			}
		}
	}
	
	@Test
	public void testingLambdaList_SizeCorrecto() {
		List<Integer> pares = LambdaCuadrados.lamdbaCuadradosPares().get();
		if(pares.size()!= 5) {
			fail("La lista no tiene 5 elementos pares");
		}
	}
	
	
	

}
