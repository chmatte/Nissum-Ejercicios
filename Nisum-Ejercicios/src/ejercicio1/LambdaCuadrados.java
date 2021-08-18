package ejercicio1;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class LambdaCuadrados {

	public static Supplier<List<Integer>> lamdbaCuadradosPares() {
		return () -> {
			List<Integer> lista = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
			List<Integer> cuadrados = lista.stream().map(i -> i * i).collect(Collectors.toList());
			return cuadrados.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
		};
	}
}
