package ec.edu.espol.OOA;

public class Barco extends Vehiculo{
    private double profundidad;

    public Barco(String numeroRegistro, double velocidad, double profundidad) {
        super(numeroRegistro, velocidad);
        this.profundidad = profundidad;
    }

    // Herencia Rechazada: Un barco no se estaciona de la misma forma que un auto, pero hereda este método
    @Override
    public void estacionar() {
        // Un barco no se estaciona, pero se ve obligado a implementar este método
    }

    public void anclar() {
        System.out.println("El barco está anclado a " + profundidad + " metros de profundidad.");
    }
}
