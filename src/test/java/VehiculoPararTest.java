import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.*;

public class VehiculoPararTest {

    private Vehiculo vehiculo;

    @BeforeEach
    void setUp() {
        vehiculo = new Vehiculo("Toyota", "Corolla", 100);
    }

    @Test
    void testPararTC_PA_01() {
        vehiculo.acelerar(80);
        vehiculo.parar();
        assertEquals(0, vehiculo.getVelocidadActual());
    }

    @Test
    void testPararTC_PA_02() {
        vehiculo.parar();
        assertEquals(0, vehiculo.getVelocidadActual());
    }
}
