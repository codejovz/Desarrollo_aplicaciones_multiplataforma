package productorconsumidor;

public class Consumidor extends Thread{
	
	private Producto producto;
	private int n;
	
	public Consumidor(Producto p, int n) {
		this.producto = p;
		this.n = n;
	}
	
	
	public void run() {
		
		int valor =0;
		
		for(int i =0; i<5; i++) {
			
			valor = this.producto.get();
			
			System.out.println("=> Consumidor "+n+" consume: "+valor);
			
			try {
				Thread.sleep(100);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		
	}
	

}
