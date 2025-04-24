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
        if (incremento < 0) {
            throw new IllegalArgumentException("El incremento debe ser positivo.");
        }
        velocidadActual += incremento;
        if (velocidadActual > velocidadMaxima) {
            velocidadActual = velocidadMaxima;
        }
    }

    public void frenar(int decremento) {
        if (decremento < 0) {
            throw new IllegalArgumentException("El decremento debe ser positivo.");
        }
        velocidadActual -= decremento;
        if (velocidadActual < 0) {
            velocidadActual = 0;
        }
    }

    public void parar() {
        velocidadActual = 0;
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

    @Override
    public String toString() {
        return String.format("Vehiculo %s %s - Velocidad: %d km/h", marca, modelo, velocidadActual);
    }
}
