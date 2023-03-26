import java.util.Scanner;

/**
 * <h1>Curso de Programación Java - Clase 03 - Estructuras de Control</h1><br>
 * 
 * <h3>Ejercicio 7</h3><br>
 * Crear un programa Java que permita calcular el factorial de
 * 
 * un numero N.<br>
 * 
 * @author Martin Gimenez
 * 
 * @version 1.0
 */

public class Ejercicio7_MartinGimenezClase03 {
    public static void main(String args[]) {
        generarFactorialWhile();
        generarFactorialFor();
        generarFactorialDoWhile();
    }

    public static void generarFactorialWhile() {
        Scanner s = new Scanner(System.in);
        int numero = 0;
        boolean b = false;
        int cont = 1;
        while (b || cont == 1) {
            try {
                System.out.println("Ingrese un número");
                numero = s.nextInt();
                b = false;
                cont++;
            } catch (Exception e) {
                System.out.println("Numero erróneo ingresado");
                b = true;
                s.next();
                cont++;
            }
        }
        int i = numero - 1;
        int factorial;
        factorial = numero;
        if (numero == 0) {
            System.out.println("El factorial con WHILE es 1");
        } else {
            while (i > 1) {
                factorial *= i;
                numero = i;
                i = numero - 1;

            }
            System.out.println("El factorial con WHILE es: " + factorial);
        }
    }

    public static void generarFactorialFor() {
        Scanner s = new Scanner(System.in);
        int numero = 0;
        boolean b = false;
        int cont;
        for (cont = 1; b || cont == 1; cont++) {
            try {
                System.out.println("Ingrese un número");
                numero = s.nextInt();
                b = false;
            } catch (Exception e) {
                System.out.println("Numero erróneo ingresado");
                b = true;
                s.next();
            }
        }
        int factorial;
        factorial = numero;
        if (numero == 0) {
            System.out.println("El factorial con FOR es 1");
        } else {
            for (int i = numero - 1; i > 1; i--) {
                factorial *= i;
                numero = i;
            }
            System.out.println("El factorial con FOR es: " + factorial);
        }
    }

    public static void generarFactorialDoWhile() {
        Scanner s = new Scanner(System.in);
        int numero = 0;
        boolean b = false;
        do {
            try {
                System.out.println("Ingrese un número");
                numero = s.nextInt();
                b = false;
            } catch (Exception e) {
                System.out.println("Numero erróneo ingresado");
                b = true;
                s.next();
            }
        } while (b);
        int i = numero - 1;
        int factorial;
        factorial = numero;
        if (numero == 0) {
            System.out.println("El factorial con DO WHILE es 1");
        } else {
            do {
                factorial *= i;
                numero = i;
                i = numero - 1;
            } while (i > 1);
            System.out.println("El factorial con DO WHILE es: " + factorial);
        }
    }
}