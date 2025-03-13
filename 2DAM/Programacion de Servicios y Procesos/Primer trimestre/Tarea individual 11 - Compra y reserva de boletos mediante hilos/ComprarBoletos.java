package lanzaproceso;


public class ComprarBoletos extends Thread{
	
	private ReservaBoletos r;
	String nombre;
	
	public  ComprarBoletos( String nombre,ReservaBoletos r) {
		
		super(nombre);                  //Al hilo se le asigna un nombre y la reserva a la que accede
		this.r = r;
		
	}
	

	public void run() {
		
		synchronized(r) {             //Se sincroniza para turnarse la reserva y no acceder a la vez.
			for(int i=0; i<3; i++) {
				
				this.r.comprarBoletos(10,this.getName());   //Intenta comprar 10 boletos
				this.r.notify();                           //Avisa de que ya lo ha intentado
				
				try {
					this.r.wait();                        //Espera a que el otro le avise de que lo ha dejado libre
				}catch(InterruptedException e) {
					System.out.println("Proceso interrumpido.");
				}
				
			}
			this.r.notify();                             //Avisa de que no está esperando
			
		}
	}
}
