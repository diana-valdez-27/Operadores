package tareas2;
import java.util.Scanner;
public class verificar_numero {
	public static void main(String [] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Escribe un numero: ");
		int numero2 = sc.nextInt();
		
		if(numero2%2 == 0) {
			System.out.println("El numero es par");
		}else if(numero2%5 == 0) {
			System.out.println("El numero es multiplo 5");
		}else {
			System.out.println("El numero no es par o multiplo de 5");
		}
	}

}
