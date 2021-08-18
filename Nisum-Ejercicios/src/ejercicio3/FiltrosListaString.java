package ejercicio3;

import java.util.List;
import java.util.stream.Collectors;

public class FiltrosListaString {
	public static List<String> filtrarStrings(List<String> lista) {
		return lista.stream()
		.filter(s->s!=null)
		.filter(s->s.charAt(0)=='a')
		.filter(s->s.length() == 3)
		.collect(Collectors.toList());
	}
}
