package lanzaproceso;

public class ReservaBoletos {
	
	private int boletos;
	
	public ReservaBoletos(int boletos) {
		this.boletos = boletos;
	}
	
	public void restarBoletos(int compra) {
		this.boletos = this.boletos - compra;
	}
	
	public int getBoletos() {
		return this.boletos;
	}
	
	public void comprarBoletos(int compra, String nombre) {
		
		if(this.getBoletos()>= compra) {  //Comprueba que la reserva tenga mas boletos de los que se van a  comprar
			
			System.out.println(nombre+" va a retirar "+compra+" boletos");
			try {
				Thread.sleep(500);               //Simula que la compra tarda 500 milisegundos
				this.restarBoletos(compra);
				System.out.println(nombre+" ha retirado "+compra+" boletos. Quedan "+this.getBoletos());
			}catch(InterruptedException e) {
				System.out.println("Proceso interrumpido");
			}
			
		}else {
			System.out.println(nombre+" no puede retirar boletos. NO QUEDAN.");
		}
		
		if(this.getBoletos()<0) {
			System.out.println("BOLETOS NEGATIVOS");
		}
		
		
	}
	
}
