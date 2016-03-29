package ar.edu.utn.d2s;

import static org.junit.Assert.*;
import org.junit.Test;

public class Puntos_de_Interes {

	String nombre = "Pepe";
	Object punto ="hola";

	@Test
	public void noNombreVacio() {
		Puntos_de_Interes puntos_interes = new Puntos_de_Interes();

		assertFalse(puntos_interes.nombre == null);
		assertFalse(puntos_interes.nombre.isEmpty());
	}

	@Test
	public void noMasDe60caracteres() {
		Puntos_de_Interes puntos_interes = new Puntos_de_Interes();

		if (puntos_interes.nombre != null) {
			assertFalse("Tiene mas de 60 caracteres?", puntos_interes.nombre.length() > 60);
		}
	}

	@Test
	public void noPuntoNull() {
		Puntos_de_Interes puntos_interes = new Puntos_de_Interes();

		assertNotNull(puntos_interes.punto);

	}
}
