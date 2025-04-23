import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class VehiculoFrenarTest {

	@BeforeEach
	void setUp() {
	}

	@Test
	void testesDeportivoTC_DE_01() {
    	Vehiculo vehiculo = new Vehiculo("Ford", "GT90", 250);
    	assertTrue(vehiculo.esDeportivo());
	}

	@Test
	void testesDeportivoTC_DE_02()  {
    	Vehiculo vehiculo = new Vehiculo("Toyota", "CHR", 170);
    	assertFalse(vehiculo.esDeportivo());
	}
}
