import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.*;

class VehiculoPararTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void testPararTC_PA_01() {
        vehiculo = new Vehiculo("Toyota", "Corolla", 100);
        vehiculo.acelerar(80);
        vehiculo.parar();
        // Verificar que la velocidad es 0
        assertEquals(0, vehiculo.getVelocidadActual());
    }

    @Test
    void testPararTC_PA_02() {
        vehiculo = new Vehiculo("Toyota", "Corolla", 100);
        vehiculo.parar();
        // Verificar que la velocidad sigue siendo 0
        assertEquals(0, vehiculo.getVelocidadActual());
    }
}
