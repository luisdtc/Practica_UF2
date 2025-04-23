public class Vehiculo {

    private String marca;
    private String modelo;
    private int velocidadMaxima;
    private int velocidadActual;

    public Vehiculo(String marca, String modelo, int velocidadMaxima) {
        System.out.println("constructor vehiculo");
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
