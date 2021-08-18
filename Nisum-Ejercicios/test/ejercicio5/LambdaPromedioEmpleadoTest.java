package ejercicio5;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

public class LambdaPromedioEmpleadoTest {

	@Test
	public void test() {
		List<Empleado> empleados = List.of(new Empleado("Juan","Martinez",45),
				new Empleado("Eduardo","Gallardo",21),
				new Empleado("Ana","Cornejo",50),
				new Empleado("Marcela","Santos",25));
		double result = LambdaPromedioEmpleado.promedioEdadesEmpleados().apply(empleados);
		double expected = 35.25;
		
		assertEquals(result, expected,0.005);
	}

}
