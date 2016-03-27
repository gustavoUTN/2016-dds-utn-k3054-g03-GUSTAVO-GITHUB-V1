import static org.junit.Assert.*;
import org.junit.Test;

public class Puntos_de_Interes {

	String nombre = "Pepe";
	Object punto;

	@Test
	public void nombreVacio() {
		Puntos_de_Interes puntos_interes = new Puntos_de_Interes();

		if (puntos_interes.nombre == null) {
			fail("El nombre esta en null");
		} else {
			if (puntos_interes.nombre.isEmpty() == true) {
				fail("El nombre es vacío");
			}
		}
	}

	@Test
	public void masDe60caracteres() {
		Puntos_de_Interes puntos_interes = new Puntos_de_Interes();

		if (puntos_interes.nombre == null) {
			fail("El nombre esta en null");
		} else {
			if (puntos_interes.nombre.length() > 60) {
				fail("El nombre es tiene mas de 60 caracteres");
			}
		}
	}

	@Test
	public void puntoNull() {
		Puntos_de_Interes puntos_interes = new Puntos_de_Interes();

		if (puntos_interes.punto == null) {
			fail("El punto de interes no puede ser null");
		}
	}

}
