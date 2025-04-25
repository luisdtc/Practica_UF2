public class Vehiculo {
    private String marca;
    private String modelo;
    private int velocidadMaxima;
    private int velocidadActual;

    public Vehiculo(String marca, String modelo, int velocidadMaxima) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidadMaxima = velocidadMaxima;
        this.velocidadActual = 0;
    }

    public void acelerar(int incremento) {
        if (incremento <= 0) {
            System.out.println("Aceleración no válida: debe ser un número entero positivo.");
            return;
        }

        velocidadActual += incremento;
        if (velocidadActual > velocidadMaxima) {
            velocidadActual = velocidadMaxima;
        }
    }

    public void frenar(int decremento) {
        if (decremento < 0) {
            System.out.println("Frenado no válido: debe ser un número entero positivo.");
            return;
        }
        velocidadActual -= decremento;
        if (velocidadActual < 0) {
        velocidadActual = 0;
        }    
    } 
    public void parar() {
        this.velocidadActual = 0;
    }
  
    public boolean esDeportivo() {
    	return this.velocidadMaxima > 200;
  	}
  
    public int getVelocidadActual() {
        return velocidadActual;
    }


    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }
}
