package productorconsumidor;

public class ProductorConsumidor {
	
	public static void main(String[] args) {
		
		Producto p= new Producto();
		
		Productor pr = new Productor(p,1);
		Consumidor c = new Consumidor(p,1);
		
		pr.start();
		c.start();
			
	}
	
}
