import java.util.ArrayList;
import java.util.List;

public class Carrito {
    @SuppressWarnings("FieldMayBeFinal")
    private List<LineaDePedidos> lineas = new ArrayList<>();
    @SuppressWarnings("FieldMayBeFinal")
    private List<AplicableADescuento> descuentos = new ArrayList<>();
    CalculadorDeTotales calculador ;


    public Carrito(CalculadorDeTotales calculador) {
        this.calculador = calculador;
    }

    public void agregarLinea(Producto producto, int cantidad) {
        LineaDePedidos linea = new LineaDePedidos(producto, cantidad);
        lineas.add(linea);
    }

    public void agregarDescuento(AplicableADescuento descuento) {
        descuentos.add(descuento);
    }

    public double calcularTotal() {
        return calculador.calcularTotalFinal(lineas, descuentos);
    }

    public boolean procesarCompra(MetodoDePago metodo) {
        return metodo.procesarPago(calcularTotal());
    }


    public List<LineaDePedidos> getLineas() {
        return lineas;
    }

    public List<AplicableADescuento> getDescuentos() {
        return descuentos;
    }

}
