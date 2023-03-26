/**
 * <h1>Curso de Programación Java - Clase 03 - Estructuras de Control</h1><br>
 * 
 * <h3>Ejercicio 8</h3><br>
 * Crear un programa que dibuje una pirámide invertida según modelo.<br>
 * 
 * @author Martin Gimenez
 * 
 * @version 1.0
 */
public class Ejercicio8_MartinGimenezClase03 {

    public static void main(String args[]) {
        dibujarPiramideWhile();
        dibujarPiramideFor();
        dibujarPiramideDoWhile();
    }

    public static void dibujarPiramideWhile() {
        int i = 1;
        int j = 1;
        int k = 9;
        int l;
        int espacBlanco = 1;
        System.out.println("Pirámide con WHILE:");
        while (j <= 9) {
            l = 1;
            while (l <= espacBlanco) {
                System.out.print(" ");
                l++;
            }
            while (i <= k) {
                System.out.print("* ");
                i++;
            }
            System.out.println("\t");
            espacBlanco++;
            i = 1;
            j++;
            k--;
        }
    }

    public static void dibujarPiramideFor() {
        int i = 1;
        int k = 9;
        int l;
        int espacBlanco = 1;
        System.out.println("Pirámide con FOR:");
        for (int j = 1; j <= 9; j++) {
            for (l = 1; l <= espacBlanco; l++) {
                System.out.print(" ");
            }
            for (i = 1; i <= k; i++) {
                System.out.print("* ");
            }
            System.out.println("\t");
            espacBlanco++;
            i = 1;
            k--;
        }
    }

    public static void dibujarPiramideDoWhile() {
        int i = 1;
        int j = 1;
        int k = 9;
        int l;
        int espacBlanco = 1;
        System.out.println("Pirámide con DO WHILE:");
        do {
            l = 1;
            do {
                System.out.print(" ");
                l++;
            } while (l <= espacBlanco);
            do {
                System.out.print("* ");
                i++;
            } while (i <= k);
            System.out.println("\t");
            espacBlanco++;
            i = 1;
            j++;
            k--;
        } while (j <= 9);
    }
}