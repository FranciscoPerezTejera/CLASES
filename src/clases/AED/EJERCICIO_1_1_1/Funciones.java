package aed.EJERCICIO_1_1_1;

import java.security.SecureRandom;
import java.util.Scanner;

public class Funciones {

    protected int codigo;

    public Funciones() {

    }

    public void testNombre(Cliente cliente) {

        String name = cliente.getNombre();

    }

    public int generarNumeroRamdon(int codigo) {

        return new SecureRandom().nextInt(000000000, 999999699) + codigo;

    }

    public void lanzamientoPrograma() {

        Scanner in = new Scanner(System.in);

        Cliente[] clientes = new Cliente[3];
        Estudiante[] estudiantes = new Estudiante[3];
        Empleado[] empleados = new Empleado[3];
        Facultativo[] facultativos = new Facultativo[3];
        Funciones funcion = new Funciones();
        int i = 0;
        int j = 0;
        int sys = 0;
        boolean es = true;

        for (i = 0; i < clientes.length; i++) {

            sys = i + 1;
            System.out.print("--> Introduce el nombre del cliente n " + sys + " : ");
            clientes[i] = new Cliente(in.nextLine());

            System.out.print("Indicar codigo: ");
            clientes[i].setCodigo(funcion.generarNumeroRamdon(in.nextInt()));
            sys = 0;

            in.nextLine();

        }

        for (i = 0; i < estudiantes.length; i++) {

            sys = i + 1;
            System.out.print("--> Introduce el nombre del estudiante n " + sys + " : ");
            estudiantes[i] = new Estudiante(in.nextLine());
            sys = 0;

            in.nextLine();

        }
        for (i = 0; i < empleados.length; i++) {

            sys = i + 1;
            System.out.print("--> Introduce el nombre del esmpleado n " + sys + " : ");
            empleados[i] = new Empleado(in.nextLine());
            sys = 0;

            in.nextLine();

        }

        for (i = 0; i < facultativos.length; i++) {

            sys = i + 1;
            System.out.print("--> Introduce el nombre del facultativo n " + sys + " : ");
            facultativos[i] = new Facultativo(in.nextLine());
            sys = 0;

            in.nextLine();

        }

        System.out.println("**********ACCESO A DATOS**********");

        sys = 0;

        while (j < clientes.length) {

            if (es) {
                
                sys = j + 1;
                System.out.println("[" + sys + "]" + " Cliente: " + clientes[j].getNombre() + ", " + "Codigo seguro ---[" + clientes[j].getCodigo() + "]");
                sys = 0;
                
            } else {
                
                sys = j + 1;
                System.out.println("Estudiante: " + estudiantes[i].getNombre());
                sys = 0;

            }
           
            j++;

        }

    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

}
