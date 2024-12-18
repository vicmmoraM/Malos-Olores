package ec.edu.espol.ChangePreventersDispensables;

public class ProductoElectronico extends Producto{
    public ProductoElectronico(String nombre, double precio) {
        super(nombre, precio);
    }

    @Override
    public double calcularPrecioFinal() {
        return precio; 
    }
}
