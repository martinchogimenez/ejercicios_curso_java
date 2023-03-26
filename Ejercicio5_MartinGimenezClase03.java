import java.util.Scanner;

/**
 * <h1>Curso de Programación Java - Clase 03 - Estructuras de Control</h1><br>
 * 
 * <h3>Ejercicio 5</h3><br>
 * 5) Crear un programa Java para obtener el M.C.D
 * 
 * de un número por medio del algoritmo de Euclides.<br>
 * 
 * @author Martin Gimenez
 * 
 * @version 1.0
 */

public class Ejercicio5_MartinGimenezClase03 {
    public static void main(String args[]) {
        calcularMaximoComDivWhile();
        calcularMaximoComDivFor();
        calcularMaximoComDivDoWhile();
    }

    public static void calcularMaximoComDivWhile() {
        int num1 = 0;
        int num2 = 0;
        int resto = 0;
        boolean b = false;
        int cont = 1;
        Scanner s = new Scanner(System.in);
        while (b || cont == 1) {
            try {
                System.out.println("Ingrese el primer número:");
                num1 = s.nextInt();
                System.out.println("Ingrese el segundo número:");
                num2 = s.nextInt();
                b = false;
                cont++;
            } catch (Exception e) {
                System.out.println("Número erróneo ingresado");
                b = true;
                s.next();
                cont++;
            }
        }
        if (Math.max(num1, num2) != num1) {
            int aux = num1;
            num1 = num2;
            num2 = aux;
        }
        try {
            resto = num1 % num2;
        } catch (ArithmeticException ae) {
            System.out.println(ae);
        }
        while (resto != 0) {
            num1 = num2;
            num2 = resto;
            resto = num1 % num2;
        }
        System.out.println("El MCD de los números ingresados con WHILE es " + num2);
    }

    public static void calcularMaximoComDivFor() {
        int num1 = 0;
        int num2 = 0;
        int resto = 0;
        boolean b = false;
        int cont;
        Scanner s = new Scanner(System.in);
        for (cont = 1; b || cont == 1; cont++) {
            try {
                System.out.println("Ingrese el primer número:");
                num1 = s.nextInt();
                System.out.println("Ingrese el segundo número:");
                num2 = s.nextInt();
                b = false;
            } catch (Exception e) {
                System.out.println("Número erróneo ingresado");
                b = true;
                s.next();
            }
        }
        if (Math.max(num1, num2) != num1) {
            int aux = num1;
            num1 = num2;
            num2 = aux;
        }
        try {
            for (resto = num1 % num2; resto != 0; resto = num1 % num2) {
                num1 = num2;
                num2 = resto;
            }
        } catch (ArithmeticException ae) {
            System.out.println(ae);
        }
        System.out.println("El MCD de los números ingresados con FOR es " + num2);
    }

    public static void calcularMaximoComDivDoWhile() {
        int num1 = 0;
        int num2 = 0;
        int resto = 0;
        boolean b = false;
        Scanner s = new Scanner(System.in);
        do {
            try {
                System.out.println("Ingrese el primer número:");
                num1 = s.nextInt();
                System.out.println("Ingrese el segundo número:");
                num2 = s.nextInt();
                b = false;
            } catch (Exception e) {
                System.out.println("Número erróneo ingresado");
                b = true;
                s.next();
            }
        } while (b);
        if (Math.max(num1, num2) != num1) {
            int aux = num1;
            num1 = num2;
            num2 = aux;
        }
        try {
            resto = num1 % num2;
        } catch (ArithmeticException ae) {
            System.out.println(ae);
            calcularMaximoComDivDoWhile();
        }
        if (resto != 0) {
            do {
                num1 = num2;
                num2 = resto;
                try {
                    resto = num1 % num2;
                } catch (Exception e) {
                    System.out.println(e);
                    calcularMaximoComDivDoWhile();
                }
            } while (resto != 0);
        }
        System.out.println("El MCD de los números ingresados con DO WHILE es " + num2);
    }
}
