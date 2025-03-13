package variosproductoresFIFO;


public class Productor extends Thread{
	
	private Cola cola;
	private int num, elem;
	
	public Productor(Cola c, int n, int elem) {
		
		this.cola = c;
		this.num = n;
		this.elem = elem;
		
	}
	
	public void run() {
		
		this.cola.insertar(elem);
		System.out.println("Productor "+this.num+", produce "+this.elem);
		
		
	}
	

}