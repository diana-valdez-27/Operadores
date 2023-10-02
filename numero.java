package tareas2;

import java.util.Scanner;
//ejercicio 3 compruebe si un numero es positivo y no es igual cero 
public class numero {
	public static void main (String [] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escribe un numero: ");
		int num1 = sc.nextInt();
		
		if((num1 > 0) && (num1 != 0) ) {
			System.out.println("El numero es positivo y no es cero");
		}else {
			System.out.println("El numero es negativo ");
		}
		
	}

}
