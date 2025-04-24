import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class VehiculoAcelerarTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    public void testAcelerarTC_AC_01() {
        Vehiculo v = new Vehiculo("Toyota", "Corolla", 100);
        v.acelerar(10);
        assertEquals(10, v.getVelocidadActual(), "Debe aumentar en 10 km/h");
    }

    @Test
    public void testAcelerarTC_AC_02() {
        Vehiculo v = new Vehiculo("Toyota", "Corolla", 100);
        v.acelerar(60); // Aceleramos para llegar a 60 inicialmente

        v.acelerar(50); // Intentamos aumentar 50 (60 + 50 = 110 > 100)

        assertEquals(100, v.getVelocidadActual(),
                "La velocidad no debe superar la velocidad máxima de 100 km/h");
    }

    @Test
    void testAcelerarTC_AC_03() {
        Vehiculo v = new Vehiculo("Toyota", "Corolla", 100);
        vehiculo.acelerar(-20);
        assertEquals(0, vehiculo.getVelocidadActual()); // La velocidad inicial es 0
    }
  }
