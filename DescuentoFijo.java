public class DescuentoFijo implements AplicableADescuento {
    @SuppressWarnings("FieldMayBeFinal")
    private double cantidadDeDescuento;;

    public DescuentoFijo(double cantidadDeDescuento) {
        this.cantidadDeDescuento = cantidadDeDescuento;
    }

    @Override
    public double aplicarDescuento(double total) {
        double totalConDescuento = total - cantidadDeDescuento;
        return Math.max(totalConDescuento, 0); 
    }
}