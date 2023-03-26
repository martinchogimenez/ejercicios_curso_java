import java.util.Scanner;

/**
 * <h1>Curso de Programación Java - Clase 02 - Calculadora con Java</h1><br>
 * 
 * 1) Crear una calculadora con Java que pueda realizar las operaciones de suma, resta, 
 *
 * multiplicación y división, dados dos números y muestre el resultado por consola.
 * 
 * @author Martin Gimenez
 * 
 * @version 1.1
 */


public class Calculadora_MartinGimenezClase02{
    
    public static void main(String args[]){
        Scanner s= new Scanner(System.in);
        System.out.println("INGRESE UN NUMERO:");
        float numa=s.nextFloat();
        System.out.println("INGRESE UN NUMERO:");
        float numb=s.nextFloat();
        System.out.println("INGRESE LA OPERACION: ");
        System.out.println("1- SUMA");
        System.out.println("2- RESTA");
        System.out.println("3- DIVISION");
        System.out.println("4- MULTIPLICACION");   
        int opcion=s.nextInt();
        switch (opcion) {
            case 1:
			    float result=numa+numb;
			    System.out.println("El resultado es:"+result);
			    break;
        	case 2:
			    result=numa-numb;
			    System.out.println("El resultado es:"+result);
			    break;
		    case 3:
			    result=numa/numb;
			    System.out.println("El resultado es:"+result);
			    break;
		    case 4:
			    result=numa*numb;
			    System.out.println("El resultado es:"+result);
			    break;
	    } 
    } 
}