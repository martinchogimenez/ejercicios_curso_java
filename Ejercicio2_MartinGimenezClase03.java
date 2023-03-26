/**
 * <h1>Curso de Programación Java - Clase 03 - Estructuras de Control</h1><br>
 * 
 * <h3>Ejercicio 2</h3><br>
 * 2) Crear un programa Java que imprima la tabla
 * 
 * de multiplicar de los números 1 al 9<br>
 * 
 * @author Martin Gimenez
 * 
 * @version 1.0
 */

public class Ejercicio2_MartinGimenezClase03 {
    public static void main(String args[]) {
        calcularTablaMultiplWhile();
        calcularTablaMultiplFor();
        calcularTablaMultiplDoWhile();
    }

    public static void calcularTablaMultiplWhile() {
        int i = 1;
        System.out.println("Las tablas de multiplicar del 1 al 9 con WHILE:");
        while (i <= 9) {
            int j = 1;
            while (j <= 10) {
                int resultado = i * j;
                System.out.println(i + "X" + j + "=" + resultado);
                j++;
            }
            i++;
        }
    }

    public static void calcularTablaMultiplFor() {
        System.out.println("Las tablas de multiplicar del 1 al 9 con FOR:");
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 10; j++) {
                int resultado = i * j;
                System.out.println(i + "X" + j + "=" + resultado);
            }
        }
    }

    public static void calcularTablaMultiplDoWhile() {
        int i = 1;
        System.out.println("Las tablas de multiplicar del 1 al 9 con DO WHILE:");
        do {
            int j = 1;
            do {
                int resultado = i * j;
                System.out.println(i + "X" + j + "=" + resultado);
                j++;
            } while (j <= 10);
            i++;
        } while (i <= 9);
    }

}