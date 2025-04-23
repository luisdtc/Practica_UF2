import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VehiculoTest {

    @BeforeEach
    void setUp() {
    }
    @Test
    public void constructorTest() {
        Vehiculo v = new Vehiculo("BMW", "M3", 250);
        assertEquals("BMW", v.getMarca());
        assertEquals("M3", v.getModelo());
        assertEquals(250, v.getVelocidadMaxima());
        assertEquals(0, v.getVelocidadActual());
    }
}