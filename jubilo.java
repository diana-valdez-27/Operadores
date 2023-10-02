package tareas2;
//determina si una persona es adulta y no es jubilada

import java.util.Scanner;
public class jubilo {
	public static void main(String [] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escribe una edad: ");
		int adulto = sc.nextInt();
		
		if((adulto >= 18) && (adulto <65 ) ) {
			System.out.println("Es un adulto pero no esta jubilado");
		}else {
			System.out.println("Es un adulto mayor y jubilado");
		}
	}

}
