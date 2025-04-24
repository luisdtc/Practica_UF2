import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class VehiculoPararTest {

    private Vehiculo vehiculo;

    @BeforeEach
    public void setUp() {
        vehiculo = new Vehiculo("Toyota", "Corolla", 100);
    }

    @Test
    public void testPararVehiculoEnMarcha() {
        vehiculo.acelerar(80);
        vehiculo.parar();
        assertEquals(0, vehiculo.getVelocidadActual());
    }

    @Test
    public void testPararVehiculoDetenido() {
        vehiculo.parar();
        assertEquals(0, vehiculo.getVelocidadActual());
    }
}
