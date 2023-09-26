package EJERCICIO_1_2_1;

public class Factura implements Pagable {

    private String codigo;
    private String Descripcion;
    private int cantidad;
    private double precioPorProducto;

    public Factura() {

    }

    public Factura(String codigo, String Descripcion, int cantidad, double precioPorProducto) {

        this.codigo = codigo;
        this.Descripcion = Descripcion;
        this.cantidad = cantidad;
        this.precioPorProducto = precioPorProducto;
    }

    @Override
    public double obtenerImportePagable() {

        return cantidad * precioPorProducto;

    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecioPorProducto() {
        return precioPorProducto;
    }

    public void setPrecioPorProducto(double precioPorProducto) {
        this.precioPorProducto = precioPorProducto;
    }

    @Override
    public String toString() {
        return "--> Código: " + codigo + "(" + Descripcion + ") \n" + "--> Cantidad: " + 
                cantidad + "\n" + "--> Precio por producto: " + precioPorProducto + " €\n" + "--> Importe: ";
    }

}
