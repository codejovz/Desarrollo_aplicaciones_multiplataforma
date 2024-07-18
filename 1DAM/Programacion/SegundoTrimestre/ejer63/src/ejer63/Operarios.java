package ejer63;

import java.util.Scanner;

public class Operarios {
	 private Scanner teclado;
	 private int[] sueldos;
	 public Operarios(){
		 teclado=new Scanner(System.in);
		 sueldos=new int[5];
		 for(int f=0;f<5;f++) {
			 System.out.print("Introduce valor del componente:");
			 sueldos[f]=teclado.nextInt();
		 }
	 }
	 public void imprimir() {
	 for(int f=0;f<5;f++) {
	 System.out.println(sueldos[f]);
	 	}
	 }
	 public static void main(String[] ar) {
		 Operarios op=new Operarios();
		 op.imprimir();
	 }
	 
}
