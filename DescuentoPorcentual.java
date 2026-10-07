public class DescuentoPorcentual implements AplicableADescuento {
    @SuppressWarnings("FieldMayBeFinal")
    private double porcentajeDeDescuento;


    public DescuentoPorcentual(double porcentajeDeDescuento){
        this.porcentajeDeDescuento=porcentajeDeDescuento;
    }


    @Override
    public double aplicarDescuento(double total) {
        double totalConDescuento= total * (porcentajeDeDescuento/100);
        return totalConDescuento;
    }



}
