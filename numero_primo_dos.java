package tareas2;
//verifica si un numero es primo y menor que 100
import java.util.Scanner;
public class numero_primo_dos {
	public static void main(String [] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Escriba un numero: ");
		int primo = sc.nextInt();
		
		if(primo < 100){
		if ((primo%primo==1) && (primo%1 == primo)) {
			System.out.println("El numero es menor que 100 y es primo");
		}else {
			System.out.println("El numero no es primo");
		}
		}else {
			System.out.println("El numero es mayor que 100");
		}

	}

}
