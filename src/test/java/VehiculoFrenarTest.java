import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

    class VehiculoFrenarTest {

    private Vehiculo vehiculo;

    @BeforeEach
    void setUp() {
        vehiculo = new Vehiculo("Seat", "Ibiza", 100);
    }


    @Test
    void testFrenarTC_FR_01() {
        vehiculo.acelerar(50); // Necesitamos acelerar primero para poder frenar
        vehiculo.frenar(10);
        assertEquals(40, vehiculo.getVelocidadActual());
    }

    @Test
    void testFrenarTC_FR_02() {
        vehiculo.acelerar(30);
        vehiculo.frenar(50); // Intentamos frenar más de lo que vamos
        assertEquals(0, vehiculo.getVelocidadActual());
    }

    @Test
    void testFrenarTC_FR_03() {
    Vehiculo v = new Vehiculo("Toyota", "Corolla", 100);

    // Capturar salida por consola
    ByteArrayOutputStream salidaConsola = new ByteArrayOutputStream();
    PrintStream consolaOriginal = System.out;
    System.setOut(new PrintStream(salidaConsola));

    v.frenar(-10);

    // Restaurar consola
    System.setOut(consolaOriginal);

    String salida = salidaConsola.toString().trim();
    assertEquals("Frenado no válido: debe ser un número entero positivo.", salida);
}
}

