public class Vehiculo {

    private final String marca;
    private final String modelo;
    private final int velocidadMaxima;
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
        if (decremento <= 0) {
            System.out.println("Frenado no válido: debe ser un número entero positivo.");
            return;
        }

        velocidadActual -= decremento;
        if (velocidadActual < 0) {
            velocidadActual = 0;
        }
    }

    public void parar() {
        velocidadActual = 0;
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

    public int getVelocidadActual() {
        return velocidadActual;
    }



}
