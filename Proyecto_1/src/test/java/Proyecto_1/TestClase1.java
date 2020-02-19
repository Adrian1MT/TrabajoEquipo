package Proyecto_1;

import org.junit.Test;

public class TestClase1 {

	int valor=0;
	int resultado=0;
	Clase1 Class = new Clase1();
	
	@Test
	public void testResultado() {
		valor= 4;
		resultado = Class.cuadradro(valor);
		org.junit.Assert.assertEquals(resultado, 8);
	}
}
