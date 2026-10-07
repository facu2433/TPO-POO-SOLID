import java.util.List;

public class Main {
    public static void main(String[] args) {

        // 1. Productos de los tres tipos
        Producto notebook = new ProductoFisico("Notebook", 1000, 2.0);
        Producto ebook    = new ProductoDigital("Ebook de Java", 50);
        Producto clase    = new ProductoServicio("Clase particular", 200);

        // 2. Descuentos distintos (Tarea E, punto 1)
        AplicableADescuento fijo       = new DescuentoFijo(20);
        AplicableADescuento porcentual = new DescuentoPorcentual(10);

        // 3. Inyección de dependencia: el calculador llega por el constructor
        Carrito carrito = new Carrito(new CalculadorDeTotales());

        carrito.agregarLinea(notebook, 1);
        carrito.agregarLinea(ebook, 2);
        carrito.agregarLinea(clase, 1);

        // 4. Polimorfismo sobre una lista de descuentos (Tarea E, punto 3)
        List<AplicableADescuento> descuentos = List.of(fijo, porcentual);
        System.out.println("=== Descuentos ===");
        for (AplicableADescuento d : descuentos) {
            System.out.println(d.getClass().getSimpleName()
                    + " sobre 1000 -> " + d.aplicarDescuento(1000));
            carrito.agregarDescuento(d);   // el Carrito no sabe cuál es cuál
        }

        // 5. Total final
        System.out.println("\n=== Total ===");
        System.out.println("Total final: $" + carrito.calcularTotal());

        // 6. Polimorfismo sobre una lista de métodos de pago
        List<MetodoDePago> metodos = List.of(
                new TarjetaCredito("1234567890123456", "Ana"),
                new Paypal("ana@mail.com")
        );
        System.out.println("\n=== Pagos ===");
        for (MetodoDePago m : metodos) {
            boolean ok = carrito.procesarCompra(m);
            System.out.println("Resultado: " + (ok ? "aprobado" : "rechazado"));
        }
    }
}
