/**
 * <h1>Curso de Programación Java - Clase 03 - Estructuras de Control</h1><br>
 * 
 * <h3>Ejercicio 1</h3><br>
 * 1) Crear un programa Java para calcular la suma de los primeros
 * 
 * 100 numeros enteros positivos con un ciclo for, mientras y repetir.<br>
 * 
 * @author Martin Gimenez
 * 
 * @version 1.0
 */

public class Ejercicio1_MartinGimenezClase03 {

    public static void main(String args[]) {
        calcularSumaWhile();
        calcularSumaFor();
        calcularSumaDoWhile();
    }

    public static void calcularSumaWhile() {
        int x = 1;
        int suma = 0;
        while (x <= 100) {
            suma += x;
            x += 1;
        }
        System.out.println("La suma de los primeros 100 numeros enteros positivos con un bucle WHILE es:" + suma);
    }

    public static void calcularSumaFor() {
        int suma = 0;
        for (int x = 1; x <= 100; x++) {
            suma += x;
        }
        System.out.println("La suma de los primeros 100 numeros enteros positivos con un bucle FOR es:" + suma);

    }

    public static void calcularSumaDoWhile() {
        int x = 1;
        int suma = 0;
        do {
            suma += x;
            x += 1;
        } while (x <= 100);
        System.out.println("La suma de los primeros 100 numeros enteros positivos con un bucle DO WHILE es:" + suma);
    }
}
