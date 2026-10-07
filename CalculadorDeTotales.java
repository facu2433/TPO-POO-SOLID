import java.util.List;

public class CalculadorDeTotales  {

    public double calcularTotalFinal(List<LineaDePedidos> lineasDePedidos, List<AplicableADescuento> descuentos) {
        double total = 0;
        for (LineaDePedidos linea : lineasDePedidos) {
            Producto p= linea.getProducto();
            total += p.getPrecio() * linea.getCantidad();

            if (p instanceof ImpuestoDeEnvio envio) {
                total += envio.calcularImpuestoEnvio();
            }
        }
        for (AplicableADescuento descuento : descuentos) {
            total = descuento.aplicarDescuento(total);
        }
        
        return total;
    
    }
}