package EJERCICIO_1_2_1;


public class EmpleadoAsalariado extends Empleado {
    
    private double salarioSemanal;

    public EmpleadoAsalariado() {
        
        
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
    public double obtenerImportePagable() {
        return super.obtenerImportePagable();
    }
    
    
    
    
}
