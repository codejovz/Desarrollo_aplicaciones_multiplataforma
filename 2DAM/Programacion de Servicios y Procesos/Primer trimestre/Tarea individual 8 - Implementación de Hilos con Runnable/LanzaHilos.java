package lanzaproceso;

public class LanzaHilos extends Thread {

	public static void main(String[] args) {
		
		for(int i=0; i<3; i++) {
			
			Thread t= new Thread(new MiHilo("Jorge-"+i));
			t.start();
			
		}
		
		System.out.println("Todos los hilos lanzados");
		
		

	}

}
