package ec.edu.espol.OOA;

public class Viaje {
    private String origen;
    private String destino;
    private double distancia;
    private double peaje;

    public Viaje(String origen, String destino, double distancia) {
        this.origen = origen;
        this.destino = destino;
        this.distancia = distancia;
    }

    public void calcularPeaje(boolean tienePeajes) {
        if (tienePeajes) {
            peaje = distancia * 0.05; // Ejemplo de cálculo de peaje
        } else {
            peaje = 0.0;
        }
    }

    public double obtenerCostoTotal(double costoCombustiblePorKm) {
        return distancia * costoCombustiblePorKm + peaje;
    }

    // `peaje` es un campo temporal, usado solo si hay carreteras con peaje
}
