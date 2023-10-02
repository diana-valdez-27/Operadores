package tareas2;
import java.util.Scanner;
//ejercicio 2 verificar si un numero es divisble por 2 y por 3
public class verificar {
	public static void main(String [] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escribe un numero: ");
		int num2 = sc.nextInt();
		
		if((num2%2==0) && (num2%3 == 0)) {
			System.out.println("El numero es divisible entre 2 y 3");
		}else {
			System.out.println("El numero no es dividible entre 2 y 3");
		}
		
	}

}
