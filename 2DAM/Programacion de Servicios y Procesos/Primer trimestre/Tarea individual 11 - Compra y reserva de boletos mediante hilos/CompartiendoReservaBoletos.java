package lanzaproceso;

public class CompartiendoReservaBoletos {
	
	public static void main(String[] args) {
		
		ReservaBoletos r= new ReservaBoletos(30);  //Reserva con 30 boletos disponibles.
		
		ComprarBoletos c1= new ComprarBoletos("Jorge",r);  //Hilos llamados Jorge y Saul, acceden a la reserva r
		ComprarBoletos c2= new ComprarBoletos("Saul",r);
		
		c1.start();
		c2.start();
		
	}
	
}
