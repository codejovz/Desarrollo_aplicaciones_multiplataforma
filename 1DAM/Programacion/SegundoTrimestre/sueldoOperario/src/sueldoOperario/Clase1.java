package sueldoOperario;


import java.util.Scanner;



public class Clase1 {

	public static void main(String[]args) {
		
		Scanner teclado = new Scanner(System.in);   
		int horasTrabajadas;
		float costoHora;
		float sueldo;
		System.out.print("Introduce la cantidad de horas trabajadas por el empleado: ");
		horasTrabajadas = teclado.nextInt();
		System.out.println("Introduce el valor de la hora: ");
		costoHora=teclado.nextFloat();
		sueldo = horasTrabajadas*costoHora;
		System.out.print("El empleado debe cobrar: ");
		System.out.print(sueldo);
		
	}

	
}
