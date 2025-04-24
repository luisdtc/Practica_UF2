import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class VehiculoPararTest {

    private Vehiculo vehiculo;

    @BeforeEach
    void setUp() {
        vehiculo = new Vehiculo("Toyota", "Corolla", 100); // Inicializa antes de cada test
    }

    @Test
    void testPararTC_PA_01() {
        vehiculo.acelerar(80);
        vehiculo.parar();
        // Verificar que la velocidad es 0
        assertEquals(0, vehiculo.getVelocidadActual(), "La velocidad debería ser 0 después de parar.");
    }

    @Test
    void testPararTC_PA_02() {
        vehiculo.parar();
        // Verificar que la velocidad sigue siendo 0
        assertEquals(0, vehiculo.getVelocidadActual(), "La velocidad debería seguir siendo 0 si ya estaba parada.");
    }
}
