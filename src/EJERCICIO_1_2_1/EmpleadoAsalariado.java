package EJERCICIO_1_2_1;


public class EmpleadoAsalariado extends Empleado {
    
    private double salarioSemanal;

    public EmpleadoAsalariado(String nombre, String apellido, String seguridadSocial, double salarioSemanal) {
        super(nombre, apellido, seguridadSocial);
        if (salarioSemanal < 0) {
            throw new IllegalArgumentException("El salario semanal no puede ser negativo.");
        }
        this.salarioSemanal = salarioSemanal;
    }
    
    @Override
    public double obtenerImportePagable() {
        return salarioSemanal;
    }
    
    public EmpleadoAsalariado(double salarioSemanal) {
        this.salarioSemanal = salarioSemanal;
    }

    public double getSalarioSemanal() {
        return salarioSemanal;
    }

    public void setSalarioSemanal(double salarioSemanal) {
        this.salarioSemanal = salarioSemanal;
    }
    
    @Override
    public String toString() {
        return String.format("Empleado de Servicios [Nombre: %s, Apellido: %s, Seguridad Social: %s, Salario Semanal: %.2f Eur]",
                getNombre(), getApellido(), getSeguridadSocial(), salarioSemanal);
    }
}
