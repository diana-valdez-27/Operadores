package tareas2;
//ejercicio Comprueba si una persona es mayor de edad y tiene un permiso de conducir 
import java.util.Scanner;
public class persona_mayor {
	public static void main (String [] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escriba su edad ");
		int edad = sc.nextInt();
		
		if(edad > 18 ) {
			System.out.println("usted es una persona mayor");
			System.out.println("Usted tiene permiso de conducir ");
		}else {
			System.out.println("Usted es menor de edad y no puede conducir");
		}
	}

}
