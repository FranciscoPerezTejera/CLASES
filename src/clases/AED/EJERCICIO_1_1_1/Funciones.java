package aed.EJERCICIO_1_1_1;

import clases.AED.EJERCICIO_1_1_1.NumeroIncorrectoException;
import clases.AED.EJERCICIO_1_1_1.NombreIncorrectoException;
import java.io.IOException;
import java.security.SecureRandom;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Funciones {

    protected int codigo;

    public Funciones() {

    }

    public int generarNumeroRamdon(int codigo) {

        return new SecureRandom().nextInt(000000000, 999999699) + codigo;

    }

    public void lanzamientoPrograma() throws IOException {

        Scanner in = new Scanner(System.in);

        Cliente[] clientes = new Cliente[3];
        Estudiante[] estudiantes = new Estudiante[3];
        Empleado[] empleados = new Empleado[3];
        Facultativo[] facultativos = new Facultativo[3];
        Funciones funcion = new Funciones();
        int i = 0;
        int j = 0;
        int sys = 0;
        int code = 0;
        boolean es = true;

        for (i = 0; i < clientes.length; i++) {

            sys = i + 1;
            System.out.print("--> Introduce el nombre del cliente n " + sys + " : ");
            clientes[i] = new Cliente(in.nextLine());

            try {

                es = funcion.esUnNOmbre(clientes[i].getNombre());

                if (es == false) {

                    throw new NombreIncorrectoException();

                }
            } catch (NombreIncorrectoException e) {

                while (!es) {

                    System.out.print(e.toString() + " " + sys + " Solo se admiten letras \n El formato es primer nombre y primer apellido (Las iniciales de cada palabra en mayúsculas). \n << Pulsa ENTER para continuar >>");
                    in.nextLine();
                    System.out.print("--> Introduce el nombre del cliente n " + sys + " (Primer nombre y Primer Apellido) : ");
                    clientes[i] = new Cliente(in.nextLine());
                    es = funcion.esUnNOmbre(clientes[i].getNombre());

                }

            }

            es = true;
            System.out.print("Indicar codigo: ");
            code = in.nextInt();
            es = funcion.entreCienYTresciento(code);

            try {

                if (es == false) {

                    throw new NumeroIncorrectoException();

                } else {

                    clientes[i].setCodigo(funcion.generarNumeroRamdon(code));

                }

            } catch (NumeroIncorrectoException e) {

                while (!es) {

                    System.out.print(e.toString() + " " + sys + " Solo códigos entre 100 y 300. >>--> Indicar el código: ");
                    code = in.nextInt();
                    es = funcion.entreCienYTresciento(code);
                }

                clientes[i].setCodigo(funcion.generarNumeroRamdon(code));

            }
            es = true;
            sys = 0;
            in.nextLine();

        }

        for (i = 0; i < estudiantes.length; i++) {

            sys = i + 1;
            System.out.print("--> Introduce el nombre del estudiante n " + sys + " : ");
            estudiantes[i] = new Estudiante(in.nextLine());
            sys = 0;

        }
        for (i = 0; i < empleados.length; i++) {

            sys = i + 1;
            System.out.print("--> Introduce el nombre del esmpleado n " + sys + " : ");
            empleados[i] = new Empleado(in.nextLine());
            sys = 0;

        }

        for (i = 0; i < facultativos.length; i++) {

            sys = i + 1;
            System.out.print("--> Introduce el nombre del facultativo n " + sys + " : ");
            facultativos[i] = new Facultativo(in.nextLine());
            sys = 0;

        }

        funcion.imprimirResultado(clientes, estudiantes, empleados, facultativos);

    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public boolean esUnNOmbre(String nombre) throws IOException {

        return nombre.matches("^[A-ZÑa-zñáéíóúÁÉÍÓÚ ]+$");

    }

    public boolean entreCienYTresciento(int numero) throws IOException {

        if (numero < 100 | numero > 300) {

            return false;

        }

        return true;
    }

    public void imprimirResultado(Cliente[] c, Estudiante[] es, Empleado[] emp, Facultativo[] f) {

        int i;
        int sys = 0;
        System.out.println("**********ACCESO A DATOS**********");

        for (i = 0; i < c.length; i++) {

            sys = i + 1;
            System.out.println("[" + sys + "]" + "Cliente: " + c[i].getNombre() + ", Código seguro ---[" + c[i].getCodigo() + "]");
        }

        sys = 0;
        for (i = 0; i < es.length; i++) {

            sys = i + 1;
            System.out.println("[" + sys + "]" + "Estudiante: " + es[i].getNombre());

        }

        sys = 0;
        for (i = 0; i < emp.length; i++) {

            sys = i + 1;
            System.out.println("[" + sys + "]" + "Empleado: " + emp[i].getNombre());

        }
        sys = 0;
        for (i = 0; i < f.length; i++) {

            sys = i + 1;
            System.out.println("[" + sys + "]" + "Facultativo: " + f[i].getNombre());

        }
    }

}
