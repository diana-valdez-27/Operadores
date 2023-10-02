package tareas2;
//comprueba si un numero es negativo o si es cero
import java.util.Scanner;
public class numero_negativo {
	public static void main(String [] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escribe un numero: ");
		int numero4 = sc.nextInt();
		
		if(numero4<0) {
			System.out.println("El numero es negativo");
		}else if(numero4 == 0){
			System.out.println("El numero es cero");
		}else {
			System.out.println("El numero es positivo");
		}
	}

}
