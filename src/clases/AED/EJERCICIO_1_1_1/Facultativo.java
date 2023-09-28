package clases.aed.EJERCICIO_1_1_1;


public class Facultativo extends Empleado{
    
    public int Tecnico = 1;
    public int Licenciado = 2;
    protected String Horario;
    protected int Especialidad;

    public Facultativo(String nombre) {
        super(nombre);
    }

    public int getTecnico() {
        return Tecnico;
    }

    public void setTecnico(int Tecnico) {
        this.Tecnico = Tecnico;
    }

    public int getLicenciado() {
        return Licenciado;
    }

    public void setLicenciado(int Licenciado) {
        this.Licenciado = Licenciado;
    }

    public String getHorario() {
        return Horario;
    }

    public void setHorario(String Horario) {
        this.Horario = Horario;
    }

    public int getEspecialidad() {
        return Especialidad;
    }

    public void setEspecialidad(int Especialidad) {
        this.Especialidad = Especialidad;
    }
    
    
}
