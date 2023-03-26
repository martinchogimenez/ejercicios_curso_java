import java.util.Scanner;
import java.util.Random;

/**
 * <h1>Curso de Programación Java - Clase 03 - Estructuras de Control</h1><br>
 * 
 * <h3>Ejercicio 6</h3><br>
 * 6) Crear un programa Java que imprima la siguiente tabla según modelo.<br>
 * 
 * @author Martin Gimenez
 * 
 * @version 1.0
 */

public class Ejercicio6_MartinGimenezClase03 {
    public static void main(String args[]) {
        generarTablaNotasWhile();
        generarTablaNotasFor();
        generarTablaNotasDoWhile();
    }

    public static void generarTablaNotasWhile() {
        Scanner s = new Scanner(System.in);
        int i = 1;
        int j;
        int min = 1;
        int max = 9;
        int cantFilas = 0;
        boolean b = false;
        int cont = 1;
        while (b || cont == 1) {
            try {
                System.out.println("Ingrese la cantidad de filas a mostrar (bucle WHILE)");
                cantFilas = s.nextInt();
                b = false;
                cont++;
            } catch (Exception e) {
                System.out.println("Número erróneo ingresado");
                b = true;
                s.next();
                cont++;
            }
        }
        System.out.println("NOTA1          NOTA2          NOTA3          PROMEDIO");
        while (i <= cantFilas) {
            j = 1;
            int sumaNotas = 0;
            while (j <= 3) {
                Random random = new Random();
                int nota = random.nextInt(max + min) + min;
                System.out.print(nota + "               ");
                sumaNotas += nota;
                j++;
            }
            float promedio = (float) sumaNotas / 3;
            System.out.println(String.format("%.2f", promedio));
            i++;
        }
    }

    public static void generarTablaNotasFor() {
        Scanner s = new Scanner(System.in);
        int min = 1;
        int max = 9;
        int cantFilas = 0;
        boolean b = false;
        int cont;
        for (cont = 1; b || cont == 1; cont++) {
            try {
                System.out.println("Ingrese la cantidad de filas a mostrar(bucle FOR)");
                cantFilas = s.nextInt();
                b = false;
            } catch (Exception e) {
                System.out.println("Número erróneo ingresado");
                b = true;
                s.next();
            }
        }
        System.out.println("NOTA1          NOTA2          NOTA3          PROMEDIO");
        for (int i = 1; i <= cantFilas; i++) {
            int sumaNotas = 0;
            for (int j = 1; j <= 3; j++) {
                Random random = new Random();
                int nota = random.nextInt(max + min) + min;
                System.out.print(nota + "               ");
                sumaNotas += nota;
            }
            float promedio = (float) sumaNotas / 3;
            System.out.println(String.format("%.2f", promedio));
        }
    }

    public static void generarTablaNotasDoWhile() {
        Scanner s = new Scanner(System.in);
        int i = 1;
        int j;
        int min = 1;
        int max = 9;
        int cantFilas = 0;
        boolean b = false;
        do {
            try {
                System.out.println("Ingrese la cantidad de filas a mostrar(bucle DO WHILE)");
                cantFilas = s.nextInt();
                b = false;
            } catch (Exception e) {
                System.out.println("Número erróneo ingresado");
                b = true;
                s.next();
            }
        } while (b);
        System.out.println("NOTA1          NOTA2          NOTA3          PROMEDIO");
        do {
            j = 1;
            int sumaNotas = 0;
            do {
                Random random = new Random();
                int nota = random.nextInt(max + min) + min;
                System.out.print(nota + "               ");
                sumaNotas += nota;
                j++;
            } while (j <= 3);
            float promedio = (float) sumaNotas / 3;
            System.out.println(String.format("%.2f", promedio));
            i++;
        } while (i <= cantFilas);
    }
}