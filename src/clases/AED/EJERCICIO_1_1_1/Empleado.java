package clases.aed.EJERCICIO_1_1_1;

import java.util.Calendar;

public class Empleado extends Cliente{
    
    protected boolean Turno = false;
    protected double Salario;
    protected Calendar Contrato;

    public Empleado(String nombre) {
        super(nombre);
    }

    public boolean isTurno() {
        return Turno;
    }

    public void setTurno(boolean Turno) {
        this.Turno = Turno;
    }

    public double getSalario() {
        return Salario;
    }

    public void setSalario(double Salario) {
        this.Salario = Salario;
    }

    public Calendar getContrato() {
        return Contrato;
    }

    public void setContrato(Calendar Contrato) {
        this.Contrato = Contrato;
    }
    
    
    
}
