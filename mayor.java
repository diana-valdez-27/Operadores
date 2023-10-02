package tareas2;
import java.util.Scanner;

//ejercicio 1 comprueba si un numero es mayor que 10 y menor que 20
public class mayor {
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escribe un numero: ");
		int numero = sc.nextInt();
		
		if ((numero > 10) && (numero < 20)) {
			System.out.println("El numero es mayor que 10 y menor que 20");
		}else {
			System.out.println("El numero no es mayor que 10 y menor que 20");
		}
		
	}
}
