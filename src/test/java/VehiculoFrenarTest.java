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
    public void testFrenarTC_FR_01() {
        Vehiculo vehiculo = new Vehiculo("Seat", "Ibiza", 150);
        vehiculo.acelerar(50); // Necesitamos acelerar primero para poder frenar
        vehiculo.frenar(10);
        assertEquals(40, vehiculo.getVelocidadActual());
    }

    @Test
    public void testFrenarTC_FR_02() {
        Vehiculo vehiculo = new Vehiculo("Seat", "Ibiza", 150);
        vehiculo.acelerar(30);
        vehiculo.frenar(50); // Intentamos frenar más de lo que vamos
        assertEquals(0, vehiculo.getVelocidadActual());
    }


    @Test
    public void testFrenarTC_FR_03() {
        Vehiculo v = new Vehiculo("Seat", "Ibiza", 150);
        Vehiculo vehiculo = new Vehiculo("MarcaX", "ModeloY", 100);
        vehiculo.acelerar(20);
        vehiculo.frenar(-5);
        assertEquals(20, vehiculo.getVelocidadActual());
    }
}

