package clases.aed.EJERCICIO_1_1_1;

public class Cliente {
    
    protected  String nombre;
    protected int codigo;
    protected  String direccion;
    protected  String numero_movil;
    protected  String email;

    public Cliente(String nombre) {
        this.nombre = nombre;
    }
    /////////////////
    public Cliente(int codigo) {
        this.codigo = codigo;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNumero_movil() {
        return numero_movil;
    }

    public void setNumero_movil(String numero_movil) {
        this.numero_movil = numero_movil;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
}
