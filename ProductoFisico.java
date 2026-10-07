public class ProductoFisico extends Producto implements ImpuestoDeEnvio {
    @SuppressWarnings("FieldMayBeFinal")
    private double peso;
    

    public double getPeso() {
        return peso;
    }


    public ProductoFisico(String nombre, double precio, double peso){
        super(nombre, precio);
        this.peso=peso;
    }


    @Override
    public double calcularImpuestoEnvio() {
        return  peso*100;
    }


    
}
