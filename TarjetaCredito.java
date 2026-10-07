public class TarjetaCredito implements MetodoDePago {
    
    @SuppressWarnings("FieldMayBeFinal")
    private String numeroTarjeta;
    @SuppressWarnings("FieldMayBeFinal")
    private String titular;


    public TarjetaCredito(String numeroTarjeta, String titular) {
        this.numeroTarjeta = numeroTarjeta;
        this.titular = titular;
    }


    @Override
    public boolean procesarPago(double monto) {
        System.out.println("Procesando pago de " + monto + " con tarjeta de crédito: " + numeroTarjeta + " a nombre de " + titular);
        System.out.println("Pago procesado exitosamente.");
        return true;
    }


}
