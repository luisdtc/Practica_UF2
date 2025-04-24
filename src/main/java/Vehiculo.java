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
        velocidadActual = Math.max(velocidadActual - decremento, 0);
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

