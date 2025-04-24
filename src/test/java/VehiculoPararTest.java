import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class VehiculoPararTest {

    private Vehiculo vehiculo; // Se necesita declarar la variable

    @BeforeEach
    void setUp() {
        vehiculo = new Vehiculo("Toyota", "Corolla", 100); // Inicialización común si aplica
    }

    @Test
    void testPararTC_PA_01() {
        vehiculo.acelerar(80);
        vehiculo.parar();
        // Verificar que la velocidad es 0
        assertEquals(0, vehiculo.getVelocidadActual());
    }

    @Test
    void testPararTC_PA_02() {
        vehiculo.parar();
        // Verificar que la velocidad sigue siendo 0
        assertEquals(0, vehiculo.getVelocidadActual());
    }
}
