package aed.EJERCICIO_1_1_1;

public class Estudiante extends Cliente {
    
    public int Titulado = 1;
    public int Temporal = 2;

    public Estudiante(String nombre) {
        super(nombre);
    }

    public int getTitulado() {
        return Titulado;
    }

    public void setTitulado(int Titulado) {
        this.Titulado = Titulado;
    }

    public int getTemporal() {
        return Temporal;
    }

    public void setTemporal(int Temporal) {
        this.Temporal = Temporal;
    }

}
