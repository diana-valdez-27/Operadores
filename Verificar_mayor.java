package tareas2;
//Ejercicio verificar si un numero es menor que 50 o mayor que 100
import java.util.Scanner;
public class Verificar_mayor {
	public static void main(String [] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escribe un numero: ");
		int numero3 = sc.nextInt();
		
		if(numero3<50) {
			System.out.println("El numero es menor que 50");
		}else if(numero3>100){
			System.out.println("El numero es mayor que 100");
		}else {
			System.out.println("El numero esta entre 50 y 100");
		}
	}
}
