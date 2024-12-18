package ec.edu.espol.ChangePreventersDispensables;

import ec.edu.espol.Couplers.Cliente;

public class ServicioDeEnvio {
    // Mal Olor: Lazy Class
    // Esta clase tiene muy poca funcionalidad y podría no justificar su existencia
    public void enviarProducto(Producto producto, Cliente cliente) {
        System.out.println("Enviando " + producto.nombre + " a " + cliente.getDireccion());
    }
}
