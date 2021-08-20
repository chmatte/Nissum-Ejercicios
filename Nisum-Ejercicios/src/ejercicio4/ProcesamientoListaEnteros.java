package ejercicio4;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.mapping;

import java.util.List;

public class ProcesamientoListaEnteros {
	
	public static String filtrarListaEnteros(List<Integer> lista){
		return lista.stream()
		.collect(mapping(i-> ((i%2==0)?"e":"o")+i, joining(",")));
	}
}
