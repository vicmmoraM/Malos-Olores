package ec.edu.espol.ChangePreventersDispensables;

public class DescuentoElectronico extends Descuento{
    @Override
    public double aplicarDescuento(Producto producto) {
        return producto.precio * 0.9; // 10% de descuento para productos electrónicos
    }
}
