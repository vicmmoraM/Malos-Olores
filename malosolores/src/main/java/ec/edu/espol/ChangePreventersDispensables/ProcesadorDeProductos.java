package ec.edu.espol.ChangePreventersDispensables;

public class ProcesadorDeProductos {
// Este método aplica descuentos a los productos
    public void procesarProductos(Producto producto) {
        // Calcula el precio final del producto electrónico
        if (producto instanceof ProductoElectronico) {
            DescuentoElectronico descuento = new DescuentoElectronico();
            double precioFinal = descuento.aplicarDescuento(producto);
            System.out.println("Precio final del producto electrónico: " + precioFinal);
        }

        // Calcula el precio final del producto alimenticio
        if (producto instanceof ProductoAlimenticio) {
            DescuentoAlimenticio descuento = new DescuentoAlimenticio();
            double precioFinal = descuento.aplicarDescuento(producto);
            System.out.println("Precio final del producto alimenticio: " + precioFinal);
        }

        // Otro comentario innecesario que explica algo obvio
    }

    // Mal Olor: Dead Code
    public void metodoInnecesario() {
        // Este método no se usa en ninguna parte del código
        System.out.println("Esto es código muerto.");
    }
}
