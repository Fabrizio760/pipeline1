import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class VehiculoTest {
	
	static Vehiculo vehic;
	
	@BeforeAll
	public static void inicio() {
		System.out.println("Se inician los test !!");
		vehic = new Vehiculo("G5", Tipo.AVION, "Negro", 200000);
	}
	
	@BeforeEach
    public void beforeTest() {
      System.out.println("Inicio Test"); 
    }
	
    @AfterEach
    public void afterTest() {
      System.out.println("Termina Test");
    }
    
    @AfterAll
    public static void endOfTest() {
    	System.out.println("Se terminan de ejecutar los test!!");
    }
	
	@Test
	void testModelo() {
		System.out.println("Modelo");
		assertEquals("Se obtiene el modelo", "G4", vehic.getModelo());
	}
	
	@Test
	void testTipo() {
		System.out.println("Tipo");
		assertEquals("Se obtiene el tipo", Tipo.AVION , vehic.getTipo());
	}
	
	@Test
	void testColor() {
		System.out.println("Color");
		assertEquals("Se obtiene el color", "Negro", vehic.getColor());
	}
	
	@Test
	void testPrecio() {
		System.out.println("KM");
		assertEquals("Se obtiene el kilometraje", 200000, vehic.getKilometraje());
	}

}
