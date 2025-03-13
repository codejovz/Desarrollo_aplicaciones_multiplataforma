package productorconsumidor;

public class Producto {
	
	private int numero;
	private boolean disponible = false;  //Inicializa la bandera disponible a falso para que no se consuma nada hasta que se produzca
	
	public synchronized int get() {
		
		while(!this.disponible) {
			try {
				this.wait();
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		this.disponible = false;    //Cuando esta disponible para consumir, consume y retorna lo consumido
		System.out.println("Se consume "+this.numero);
		return this.numero;
		
	}
	
	public synchronized void put(int valor) {
		
		while(this.disponible) {  //Mientras este disponible para consumir, no se produce
			try {
				this.wait();
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		this.numero = valor;
		System.out.println("Se produce "+this.numero);
		this.disponible = true;
		this.notify();   //Avisa de que ya ha producido para que el consumidor finalice la espera
		
	}
	
	
	

}
