public class Paypal implements MetodoDePago {
    @SuppressWarnings("FieldMayBeFinal")
    private String email;

    public Paypal(String email) {
        this.email = email;
    }

    @Override
    public boolean procesarPago(double monto) {
        System.out.println("Procesando pago de " + monto + " con PayPal: " + email);
        System.out.println("Pago procesado exitosamente.");
        return true;
    }
}



