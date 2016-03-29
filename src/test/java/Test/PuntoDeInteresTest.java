package Test;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import Main.PuntoDeInteres;

public class PuntoDeInteresTest {
	
	private PuntoDeInteres pdi;
	
	@Before
	public void setUp() throws Exception {
		this.pdi = new PuntoDeInteres();
	}
	
	@Test
	public void nombreNoVacio() {
		pdi.setNombre("Un nombre cualquiera");
		assertFalse(pdi.getNombre().equals(null));
	}
	
	@Test
	public void longitudNombreNoMayorA60() {
		pdi.setNombre("Un nombre cualquiera que exceda los 60 caracteres para ser testeado");
		assertFalse(pdi.getNombre().toString().length() < 60);
	}
	
	@Test
	public void noSePuedeSetearEnNullElPunto() {
		pdi.setPunto(null);
		assertFalse(pdi.getPunto().equals(null));
	}


}
