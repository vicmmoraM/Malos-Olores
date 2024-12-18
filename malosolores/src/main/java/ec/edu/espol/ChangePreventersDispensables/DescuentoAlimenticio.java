package ec.edu.espol.ChangePreventersDispensables;

public class DescuentoAlimenticio extends Descuento{
    @Override
    public double aplicarDescuento(Producto producto) {
        return producto.precio * 0.85; // 15% de descuento para productos alimenticios
    }
}
