package EJERCICIO_1_2_1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ImprimirPagable {

    public void imprimirDatos() {

        Scanner scanner = new Scanner(System.in);

        Pagable[] objetos = new Pagable[6];
        int i = 0;
        int cantidad;
        double precioPorProducto, salario;
        boolean es = true;
        boolean esUnNombre = true;
        String codigo, descripcion, nom, ape, seguridadSocial;

        for (i = 0; i < 3; i++) {

            System.out.println("Ingrese los datos de la Factura " + (i + 1));
            System.out.print("Introducir codigo de 3 digitos: ");
            codigo = scanner.nextLine();
            
            try {

                es = codigoDeTresDigitos(codigo);

                if (!es) {
                    throw new IllegalArgumentException();
                }

            } catch (IllegalArgumentException e) {

                while (!es) {

                    System.out.print(e.toString() + "Solo codigos de tres digitos. >>--> Indicar el codigo: ");
                    codigo = scanner.nextLine();
                    es = codigoDeTresDigitos(codigo);

                }

            }

            System.out.print("Descripción: ");
            descripcion = scanner.nextLine();

            try {

                es = esUnNombre(descripcion);
                if (!es) {
                    throw new IllegalArgumentException();
                }

            } catch (IllegalArgumentException e) {

                while (!es) {

                    System.out.print(e.toString() + " Nose admiten numeros ni simbolos. ");
                    System.out.print("Introduce descripcion del producto: ");
                    descripcion = scanner.nextLine();
                    es = esUnNombre(descripcion);

                }

            }

            System.out.print("Cantidad: ");
            cantidad = scanner.nextInt();

            try {

                es = esNumeroNegativo(cantidad);
                if (es) {
                    throw new IllegalArgumentException();
                }

            } catch (IllegalArgumentException e) {

                while (es) {
                    System.out.print("Atencion, no se permiten numeros negativos. ");
                    System.out.print("Introducir cantidad del producto: ");
                    cantidad = scanner.nextInt();
                    es = esNumeroNegativo(cantidad);
                }

            }

            System.out.print("Precio por Producto: ");
            precioPorProducto = scanner.nextDouble();
            
            try {

                es = esNumeroNegativo(precioPorProducto);
                
                if (es)
                    throw new IllegalArgumentException();
                

            } catch (IllegalArgumentException e) {

                while (es) {
                    System.out.print("Atencion, no se permiten numeros negativos. ");
                    System.out.print("Introducir el precio del producto: ");
                    precioPorProducto = scanner.nextDouble();
                    es = esNumeroNegativo(precioPorProducto);
                }

            }

            objetos[i] = new Factura(codigo, descripcion, cantidad, precioPorProducto);
            scanner.nextLine();
        }
        
        int sys = 1;
        
        for (i = 3; i < objetos.length; i++) {
            
            System.out.println("Ingrese los datos del cliente " + sys);
            System.out.print("Nombre: ");
            nom = scanner.nextLine();
            
            try {

                esUnNombre = esUnNombre(nom);
                
                if (!esUnNombre)
                    throw new IllegalArgumentException();

            } catch (IllegalArgumentException e) {

                while (!esUnNombre) {

                    System.out.println("La cadena no admite números ni sí­mbolos. ");
                    System.out.print("--> Introduce el nombre del cliente: ");
                    nom = scanner.nextLine();
                    esUnNombre = esUnNombre(nom);
                }
            }

            System.out.print("Apellido: ");
            ape = scanner.nextLine();
            try {

                esUnNombre = esUnNombre(ape);
                
                if(!esUnNombre)
                    throw new IllegalArgumentException();

            } catch (IllegalArgumentException e) {

                while (!esUnNombre) {

                    System.out.println("La cadena no admite números ni sí­mbolos. ");
                    System.out.print("--> Introduce el apellido del cliente: ");
                    ape = scanner.nextLine();
                    esUnNombre = esUnNombre(ape);
                }
            }
            
            System.out.print("Indica numero de la seguridad social con formato XXX-XX-XXXX: ");
            seguridadSocial = scanner.nextLine();
            
            try {

                es = validarSeguridadSocial(seguridadSocial);

                if (es == false) {

                    throw new InputMismatchException();
                }

            } catch (InputMismatchException e) {

                while (!es) {

                    System.out.println("El numero de la seguridad social no sigue en formato XXX-XX-XXXX");
                    System.out.print("--> Indica numero de la seguridad social: ");
                    seguridadSocial = scanner.nextLine();
                    es = validarSeguridadSocial(seguridadSocial);
                }
            }

            System.out.print("Indicar el salario: ");
            salario = scanner.nextDouble();
            
            try {
            
                es = esNumeroNegativo(salario);
                if(es)
                    throw new IllegalArgumentException();
                
            }catch(IllegalArgumentException e) {
            
                while (es) {
                    System.out.print("Atencion, no se permiten numeros negativos. ");
                    System.out.print("Introducir salario del cliente: ");
                    salario = scanner.nextDouble();
                    es = esNumeroNegativo(salario);
                }
                
            }

            objetos[i] = new EmpleadoAsalariado(nom, ape, seguridadSocial, salario);
            sys++;
            scanner.nextLine();

        }

        System.out.println("####Facturas y Empleados procesados polimorficamente####");
        
        for (int j = 0; j < objetos.length; j++) {

            System.out.println(objetos[j]);

        }
    }

    private boolean validarSeguridadSocial(String ss) {

        return ss.matches("\\d{3}-\\d{2}-\\d{4}");
    }

    private boolean esUnNombre(String nombre) {

        return nombre.matches("^[\\p{L}\\s]+$");

    }

    private boolean codigoDeTresDigitos(String codigo) {

        return codigo.matches("\\d{3}");
    }

    private boolean esNumeroNegativo(int numero) {

        if (numero < 0) {
            return true;
        }

        return false;
    }

    private boolean esNumeroNegativo(double numero) {

        if (numero < 0) {
            return true;
        }

        return false;
    }
    

}
