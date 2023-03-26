import java.util.Scanner;

/**
 * <h1>Curso de Programación Java - Clase 03 - Estructuras de Control</h1><br>
 * 
 * <h3>Ejercicio 4</h3><br>
 * 4) Crear un programa Java para calcular la Serie de Fibonnaci.<br>
 * 
 * @author Martin Gimenez
 * 
 * @version 1.0
 */

public class Ejercicio4_MartinGimenezClase03 {
    public static void main(String args[]) {
        calcularSerieFibonWhile();
        calcularSerieFibonFor();
        calcularSerieFibonDoWhile();
    }

    public static void calcularSerieFibonWhile() {
        int x = 2;
        int i = 1;
        int j = 0;
        int cantidadNum = 0;
        boolean b = false;
        int cont = 1;
        Scanner s = new Scanner(System.in);
        while (b || cont == 1) {
            try {
                System.out.println("Ingrese cantidad de números de la serie de Fibonacci a imprimir:");
                cantidadNum = s.nextInt();
                b = false;
                cont++;
            } catch (Exception e) {
                System.out.println("Número erróneo ingresado");
                b = true;
                s.next();
                cont++;
            }
        }
        System.out.println("Serie con While:");
        while (x < cantidadNum) {
            if (j == 0) {
                System.out.println(j);
                System.out.println(i);
                int fibon = j + i;
                System.out.println(fibon);
                j = i;
                i = fibon;
                x += 1;
            } else {
                int fibon = j + i;
                System.out.println(fibon);
                j = i;
                i = fibon;
                x += 1;
            }
        }
    }

    public static void calcularSerieFibonFor() {
        int x = 2;
        int i = 1;
        int j = 0;
        int cantidadNum = 0;
        boolean b = false;
        int cont = 1;
        Scanner s = new Scanner(System.in);
        while (b || cont == 1) {
            try {
                System.out.println("Ingrese cantidad de números de la serie de Fibonacci a imprimir:");
                cantidadNum = s.nextInt();
                b = false;
                cont++;
            } catch (Exception e) {
                System.out.println("Número erróneo ingresado");
                b = true;
                s.next();
                cont++;
            }
        }
        System.out.println("Serie con For:");
        for (x = 2; x < cantidadNum; x++) {
            if (j == 0) {
                System.out.println(j);
                System.out.println(i);
                int fibon = j + i;
                System.out.println(fibon);
                j = i;
                i = fibon;
            } else {
                int fibon = j + i;
                System.out.println(fibon);
                j = i;
                i = fibon;
            }
        }
    }

    public static void calcularSerieFibonDoWhile() {
        int x = 2;
        int i = 1;
        int j = 0;
        int cantidadNum = 0;
        boolean b = false;
        Scanner s = new Scanner(System.in);
        do {
            try {
                System.out.println("Ingrese cantidad de números de la serie de Fibonacci a imprimir:");
                cantidadNum = s.nextInt();
                b = false;
            } catch (Exception e) {
                System.out.println("Número erróneo ingresado");
                b = true;
                s.next();
            }
        } while (b);
        System.out.println("Serie con Do While:");
        do {
            if (j == 0) {
                System.out.println(j);
                System.out.println(i);
                int fibon = j + i;
                System.out.println(fibon);
                j = i;
                i = fibon;
                x += 1;
            } else {
                int fibon = j + i;
                System.out.println(fibon);
                j = i;
                i = fibon;
                x++;
            }
        } while (x < cantidadNum);
    }
}