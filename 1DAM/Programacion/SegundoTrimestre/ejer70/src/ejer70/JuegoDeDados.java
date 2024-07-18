package ejer70;

public class JuegoDeDados {
	
	private Dado dado1, dado2, dado3;
	
	
	public JuegoDeDados() {
		dado1=new Dado();
		dado2= new Dado();
		dado3=new Dado();
		
	}
	
	public void jugar() {
		
		dado1.tirar();
		dado1.imprimir();
		dado2.tirar();
		dado2.imprimir();
		dado3.tirar();
		dado3.imprimir();
		
		
		if(dado1.retornarValor()==dado2.retornarValor()&&dado1.retornarValor()==dado3.retornarValor()) {
			System.out.println("Ganas, tres treses");
		}else {
			System.out.println("Pierdes");
		}
		
		
		
	}
	
	public static void main(String[]args) {
		JuegoDeDados j=new JuegoDeDados();
		j.jugar();
	}
	
	
	
	
	

}
