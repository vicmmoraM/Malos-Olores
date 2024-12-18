package ec.edu.espol.OOA;

public class Vehiculo {
    protected String numeroRegistro;
    protected double velocidad;

    public Vehiculo(String numeroRegistro, double velocidad) {
        this.numeroRegistro = numeroRegistro;
        this.velocidad = velocidad;
    }

    public void acelerar() {
        velocidad += 10;
        System.out.println("Acelerando a " + velocidad + " km/h.");
    }

    // Método que puede no ser relevante para todos los vehículos
    public void estacionar() {
        System.out.println("El vehículo está estacionado.");
    }
}
