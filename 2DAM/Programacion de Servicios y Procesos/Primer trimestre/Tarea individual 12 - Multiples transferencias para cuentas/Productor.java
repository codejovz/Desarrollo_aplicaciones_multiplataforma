package productorconsumidor;

public class Productor extends Thread{

	private Producto producto;
	private int n;
	
	public Productor(Producto p, int n) {
		this.producto = p;
		this.n = n;
	}
	
	public void run() {
		
		for(int i=0; i<5; i++) {
			
			this.producto.put(i);
			System.out.println("=>Productor "+n+" produce: "+i);
			try {
				Thread.sleep(100);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
			
		}

	}
}
