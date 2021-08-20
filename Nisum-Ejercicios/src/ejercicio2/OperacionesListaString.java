package ejercicio2;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class OperacionesListaString {
	
	public static List<String> listToUpperCase(List<String> lista){
		return lista.stream()
				.map(s->s.toUpperCase())
				.collect(Collectors.toList());
	}
	
	public static double promedioEnteros(List<Integer> enteros) throws NoSuchElementException{
		return enteros.stream().mapToInt(i->i).average().getAsDouble();
	}
	
}
