package tareas2;
//determina si un estudiante ha aprobado si su nota es mayor o igual a 60 y menor o igual a 100
import java.util.Scanner;
public class Estudiante {
	public static void main (String [] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Bienvenido");
		System.out.println("Escriba su calificacion: ");
		double cal = sc.nextDouble();
		
		if(cal == 10) {
			System.out.println("Fue aprobado, su calificacion es 10");
		}else if ((cal <=10) && (cal>6)) {
			System.out.println("Fue aprobado");
		}else {
			System.out.println("el estudiante no aprobo");
		}
		
	}

}
