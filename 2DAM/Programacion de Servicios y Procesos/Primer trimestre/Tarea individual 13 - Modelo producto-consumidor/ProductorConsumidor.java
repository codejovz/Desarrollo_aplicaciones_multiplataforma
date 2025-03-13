package variosproductoresFIFO;

public class ProductorConsumidor {
	
	static Cola cola= new Cola(3);
	
	public static void main(String[] args) {
		
		Productor p1 = new Productor(cola,1,10);
		Productor p2 = new Productor(cola,2,11);
		Productor p3 = new Productor(cola,3,12);
		Productor p4 = new Productor(cola,4,13);
		Productor p5 = new Productor(cola,5,14);
		
		Consumidor c1= new Consumidor(cola,1);
		Consumidor c2=  new Consumidor(cola,2);
		Consumidor c3 = new Consumidor(cola,3);
		Consumidor c4 = new Consumidor(cola, 4);
		Consumidor c5 = new Consumidor(cola, 5);
		p1.start(); p2.start(); p3.start(); p4.start(); p5.start();
		c1.start(); c2.start(); c3.start(); c4.start(); c5.start();
		
		try {
			p1.join(); p2.join(); p3.join(); p4.join(); p5.join();
			c1.join(); c2.join(); c3.join(); c4.join(); c5.join();
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("FIN del programa ");
			
	}
	
}

