package EJERCICIO_1_2_1;

public class Empleado implements Pagable {
    
    private String nombre;
    private String apellido;
    private String seguridadSocial;

    public Empleado() {
    }
    
    
    public Empleado(String nombre, String apellido, String seguridadSocial) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.seguridadSocial = seguridadSocial;
        
    }
    
    @Override
    public double obtenerImportePagable() {
        // En esta implementación, los empleados no tienen importe pagable.
        return 0.0;
    }
    
    @Override
    public String toString() {
        return String.format("%s %s (Seguridad Social: %s)", nombre, apellido, seguridadSocial);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getSeguridadSocial() {
        return seguridadSocial;
    }

    public void setSeguridadSocial(String seguridadSocial) {
        this.seguridadSocial = seguridadSocial;
    }
    
    
    
    
    
}
