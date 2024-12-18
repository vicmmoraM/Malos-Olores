package ec.edu.espol.ChangePreventersDispensables;
public class ProductoAlimenticio extends Producto{
    public ProductoAlimenticio(String nombre, double precio) {
        super(nombre, precio);
    }
    
    @Override
    public double calcularPrecioFinal() {
        return precio; // Podría tener lógica específica para productos alimenticios
    }
}
