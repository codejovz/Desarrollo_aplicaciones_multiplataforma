package libre19ejer;

import java.util.Scanner;

public class Hora_mas_1seg {
	
	public static void main(String[]args) {
		
		Scanner teclado= new Scanner(System.in);
		
		int hora,minuto,segundo,hora2,minuto2,segundo2;
		
		System.out.println("Introduce la hora: ");
		hora=teclado.nextInt();
		System.out.println("Introduce el minuto: ");
		minuto=teclado.nextInt();
		System.out.println("Introduce el segundo: ");
		segundo=teclado.nextInt();
		
		System.out.println("Tu hora es: ["+hora+":"+minuto+":"+segundo+"]");
		
		hora2=hora;
		minuto2=minuto;
		segundo2=segundo;
		
		
		if (segundo+1<60) {
			segundo2=segundo+1;
		}else {
			segundo2=00;
			minuto2=minuto+1;
		}
		
		if (minuto2>59) {
			minuto2=00;
			hora2=hora+1;
		}
		
		if (hora2>23) {
			hora2=00;
		}
		
		
		
		
		
		
		
		
		
		
		System.out.println("Tu hora +1s es: ["+hora2+":"+minuto2+":"+segundo2+"]");
		
		
		
		
		
		
		
	}

}
