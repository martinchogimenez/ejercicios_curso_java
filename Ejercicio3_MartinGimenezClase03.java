import java.util.Scanner;

/**
 * <h1>Curso de Programación Java - Clase 03 - Estructuras de Control</h1><br>
 * 
 * <h3>Ejercicio 3</h3><br>
 * 3) Crear un programa Java para calcular el resto
 * 
 * y cociente de dos números por medio de restas sucesivas.<br>
 * 
 * @author Martin Gimenez
 * 
 * @version 1.0
 */

public class Ejercicio3_MartinGimenezClase03 {
    public static void main(String args[]) {
        calcularRestoCocienteWhile();
        calcularRestoCocienteFor();
        calcularRestoCocienteDoWhile();
    }

    public static void calcularRestoCocienteWhile() {
        int cociente = 0;
        int dividendo = 0;
        int divisor = 0;
        boolean b = false;
        int cont = 1;

        Scanner s = new Scanner(System.in);
        while (b || cont == 1) {
            try {
                System.out.println("Ingrese el dividendo:");
                dividendo = s.nextInt();
                System.out.println("Ingrese el divisor:");
                divisor = s.nextInt();
                b = false;
                cont++;
            } catch (Exception e) {
                System.out.println("Número erróneo ingresado");
                b = true;
                s.next();
                cont++;
            }
        }
        int resto = dividendo;
        while (resto >= divisor) {
            cociente++;
            resto -= divisor;
        }
        System.out.println("El cociente es " + cociente + " y el resto es " + resto + " usando WHILE");
    }

    public static void calcularRestoCocienteFor() {
        int cociente = 0;
        int dividendo = 0;
        int divisor = 0;
        boolean b = false;
        int cont;
        Scanner s = new Scanner(System.in);
        for (cont = 1; b || cont == 1; cont++) {
            try {
                System.out.println("Ingrese el dividendo:");
                dividendo = s.nextInt();
                System.out.println("Ingrese el divisor:");
                divisor = s.nextInt();
                b = false;
            } catch (Exception e) {
                System.out.println("Número erróneo ingresado");
                b = true;
                s.next();
            }
        }
        int resto;
        for (resto = dividendo; resto >= divisor; resto -= divisor) {
            cociente++;
        }
        System.out.println("El cociente es " + cociente + " y el resto es " + resto + " usando FOR");
    }

    public static void calcularRestoCocienteDoWhile() {
        int cociente = 0;
        int dividendo = 0;
        int divisor = 0;
        boolean b = false;
        Scanner s = new Scanner(System.in);
        do {
            try {
                System.out.println("Ingrese el dividendo:");
                dividendo = s.nextInt();
                System.out.println("Ingrese el divisor:");
                divisor = s.nextInt();
                b = false;
            } catch (Exception e) {
                System.out.println("Número erróneo ingresado");
                b = true;
                s.next();
            }
        } while (b);
        int resto = dividendo;
        do {
            cociente++;
            resto = resto - divisor;
        } while (resto >= divisor);
        System.out.println("El cociente es " + cociente + " y el resto es " + resto + " usando DO WHILE");
    }
}
