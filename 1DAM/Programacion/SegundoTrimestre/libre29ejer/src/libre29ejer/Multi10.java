package libre29ejer;

import java.util.Scanner;

public class Multi10 {
	
	public static void main(String[]args) {
		int num,multi,x=0;
		Scanner teclado = new Scanner(System.in);
		
		
		do {
			
			System.out.println("Introduce un numero del 1 al 10(0 cierra): ");
			num=teclado.nextInt();
			
			if(num>=1 && num<=10) {
				for(x=1;x<=10;x=x+1) {
					System.out.println(num);
					num=num+num;
				}
				
				
				
				
				
				/*hacer multi*/
			}else if(num!=0){
				System.out.println("No esta entre el 1 y el 10");
			}
			
			
			
		}while(num!=0);
		
		
		
		
	}

}
