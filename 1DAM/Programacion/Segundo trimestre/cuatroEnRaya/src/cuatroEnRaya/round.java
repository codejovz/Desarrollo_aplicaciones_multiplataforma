package cuatroEnRaya;

import java.util.Scanner;

public class round {
	
	Scanner teclado=new Scanner(System.in);
	private int[][]tabla;
	public void ronda() {
		tabla=new int[3][3];
		for(int f=0;f<3;f++) {
			for(int c=0; c<3; c++) {
				tabla[c][f]=0;
			}
		}
		
		
		for(int f=0;f<3;f++) {
			for(int c=0; c<3; c++) {
				System.out.print(tabla[c][f]);
			}
			System.out.println();
		}
		System.out.println("1,2,0");

	}
}



/*/*package tresEnRaya;

import java.util.Scanner;

public class Juego {
	
		int eleccion=0;
		int ganadas=0;
		int perdidas=0;
		int continua=5;
		while(continua==5) {
			continua=5;
			System.out.println("Piedra[1],Papel[2] o tijera[3]?: ");
			eleccion=teclado.nextInt();
			int robot=(int)Math.random()*3+1;
			System.out.println(robot);
			if(eleccion==robot) {
				System.out.println("Empate!");
			}else if(eleccion==1 && robot==2) {
				System.out.println("Has perdido :(");
				perdidas=perdidas+1;
			}else if(eleccion==1 && robot==3) {
				System.out.println("Has ganado!");
				ganadas=ganadas+1;
			}else if(eleccion==2 && robot==1) {
				System.out.println("Has Ganado!");
				ganadas=ganadas+1;
			}else if(eleccion==2 && robot==3) {
				System.out.println("Has perdido :(");
				perdidas=perdidas+1;
			}else if(eleccion==3 && robot==1) {
				System.out.println("Has perdido :(");
				perdidas=perdidas+1;
			}else if(eleccion==3 && robot==2) {
				System.out.println("Has ganado!");
				ganadas=ganadas+1;
			}
			System.out.println("Quieres continuar?[5]");
			continua=teclado.nextInt();
			System.out.println("");
		}
		System.out.println("Has quedado "+ganadas+" a "+perdidas+"!");
		System.out.println("Gracias por usar este programa!");
	}
	
	
	public static void main(String[]args) {
		
		Juego game=new Juego();
		game.ronda();
		
	}
	}
	}
	/*

*/