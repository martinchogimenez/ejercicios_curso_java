import java.util.*;

/**
 * <h1>Curso de Programación Java - Clase 02 - Indice de Masa Corporal</h1><br>
 * 
 * Crear un programa Java para calcular el índice de masa corporal dado el peso y la altura de una persona
 * 
 * @author Martin Gimenez
 * 
 * @version 1.1
 */

public class IndiceMasaCorporal_MartinGimenezClase02{
    
    public static void main(String args[]){
        Scanner s= new Scanner(System.in);
        System.out.println("INGRESE SU PESO [kg]:");
        float peso=s.nextFloat();
        while (peso<=0){
            System.out.println("DEBE INGRESAR UN PESO MAYOR A CERO");
            peso=s.nextFloat();
        }
        System.out.println("INGRESE SU ALTURA [m]:");
        float altura=s.nextFloat();
        while (altura<=0){
            System.out.println("DEBE INGRESAR UNA ALLTURA MAYOR A CERO");
            altura=s.nextFloat();
        }
        float imc=(peso/(altura*altura));
        System.out.println("Su INDICE DE MASA CORPORAL(IMC) ES:"+imc);
        if (imc<18.5){
            System.out.println("Ud. tiene BAJO PESO");
        };
        if (imc>=18.5 && imc<=24.9){
            System.out.println("Ud. tiene PESO NORMAL");
        };
        if (imc>=25 && imc<=29.9){
            System.out.println("Ud. tiene SOBREPESO");
        };
        if (imc>=30 && imc<=34.9){
            System.out.println("Ud. tiene OBESIDAD I");
        };
        if (imc>=35 && imc<=39.9){
            System.out.println("Ud. tiene OBESIDAD II");
        };
        if (imc>=40){
            System.out.println("Ud. tiene OBESIDAD III");
        };            
   } 
}