package ejercicio5;

import java.util.List;
import java.util.stream.Collectors;
import java.util.function.*;


public class LambdaPromedioEmpleado {
	
	
	public static Function<List<Empleado>,Double> promedioEdadesEmpleados()
	{
		
		return empleados->empleados.stream().collect(Collectors.averagingDouble(e->e.getEdad()));
	}
}
