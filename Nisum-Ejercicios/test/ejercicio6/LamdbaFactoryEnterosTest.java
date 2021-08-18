package ejercicio6;

import static org.junit.Assert.*;

import org.junit.Test;

public class LamdbaFactoryEnterosTest {

	@Test
	public void testMainMethod_10arguments() {
		String[] args = {"1 5","2 27","2 103","1 1008","3 50405","3 123321","3 -1002001","2 -5","2 1","3 0"};
		LamdbaFactoryEnteros.main(args);
	}
}
