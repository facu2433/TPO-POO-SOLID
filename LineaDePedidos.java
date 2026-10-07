public class LineaDePedidos {
    @SuppressWarnings("FieldMayBeFinal")
    private Producto producto;
    @SuppressWarnings("FieldMayBeFinal")
    private int cantidad;

    public LineaDePedidos(Producto producto, int cantidad) {
        this.producto = producto;
        this.cantidad = cantidad;
    }

    public Producto getProducto() {
        return producto;
    }

    public int getCantidad() {
        return cantidad;
    }
}

