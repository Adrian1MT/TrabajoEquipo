package Proyecto_1;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestClase2 {
	private String resultado;
	private String resultadoesperado;

	@Test
	public void test() {
		resultado="Buenos dias";
		resultadoesperado="Buenos dias";
		
		assertSame(resultado,resultadoesperado);
		
		//org.junit.Assert.assertEquals(resultado,resultadoesperado);
	}

}
