package org.foobarspam.MockitoEjemplo;

import static org.mockito.Mockito.*;
import static org.junit.Assert.*;

import org.junit.Test;

public class TarifaTest {

	@Test
	public void getCosteTotalEsperadoTest () {
		Tarifable tarifaMocked = mock(Tarifable.class);

		Carrera carrerita = new Carrera("123456");
		
		//carrerita.tarifa = tarifaMocked;
		
		double totalEsperado = 5.4;
		
		when(tarifaMocked.getCosteTotalEsperado(carrerita)).thenReturn(totalEsperado);
		assertEquals(totalEsperado, carrerita.getCosteEsperado(tarifaMocked), 0.001);
	}

}