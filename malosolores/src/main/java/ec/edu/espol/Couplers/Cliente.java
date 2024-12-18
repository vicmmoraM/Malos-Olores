package ec.edu.espol.Couplers;
public class Cliente {
    private String nombre;
    private final Direccion direccion;

    //La clase no contiene comportamientos, solo datos

    public Cliente(String nombre, Direccion direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    // Mal Olor: Middle Man
    // La clase Cliente no hace más que delegar la llamada a otra clase, lo que la convierte en un "Middle Man"
    public String obtenerCalle() {
        return direccion.getCalle();
    }

    public String obtenerCiudad() {
        return direccion.getCiudad();
    }

    public String obtenerCodigoPostal() {
        return direccion.getCodigoPostal();
    }
}
