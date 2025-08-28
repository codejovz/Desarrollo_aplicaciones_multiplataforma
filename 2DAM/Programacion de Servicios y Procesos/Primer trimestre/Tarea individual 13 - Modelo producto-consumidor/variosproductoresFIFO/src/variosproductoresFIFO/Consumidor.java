package variosproductoresFIFO;

public class Consumidor extends Thread{
	
	public Cola cola;
	public int num, elem;
	
	public Consumidor(Cola c, int elem){
		this.cola=c;
		this.elem = elem;
	}
	
	
	
	
	public void run() {
		this.elem = cola.extraer();
		
		System.out.println("Consumidor "+this.num+", consume "+this.elem);

	}
	
	

}
