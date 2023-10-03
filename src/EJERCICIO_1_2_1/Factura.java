package EJERCICIO_1_2_1;

public class Factura implements Pagable {

    private String codigo;
    private String descripcion;
    private int cantidad;
    private double precioPorProducto;

    public Factura() {

    }

    public Factura(String codigo, String Descripcion, int cantidad, double precioPorProducto) {

        this.codigo = codigo;
        this.descripcion = Descripcion;
        this.cantidad = cantidad;
        this.precioPorProducto = precioPorProducto;
    }

    @Override
    public double obtenerImportePagable() {

        return cantidad * precioPorProducto;

    }
    
    @Override
    public String toString() {
        return String.format("[i]Factura: %n-->Codigo: %s %n-->Descripcion: %s %n-->Cantidad: %d %n-->Precio Por Producto: %.2f (Eur) %n-->Importe: %.2f (Eur)",
                codigo, descripcion, cantidad, precioPorProducto, obtenerImportePagable());
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.descripcion = Descripcion;
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

}
