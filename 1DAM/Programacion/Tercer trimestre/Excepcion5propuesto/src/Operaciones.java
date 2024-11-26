import java.io.IOException;



public class Operaciones{
	
	public int num1,num2,resultado;
	
	public Operaciones(int num1, int num2) throws Exception{
		
		this.num1=num1;
		this.num2=num2;
		this.resultado=resultado;
		System.out.println("Algo xd");

		
		
	}
	
	
	public void Suma() {
		
		this.resultado=num1+num2;
		System.out.println("Suma: "+resultado);
		
	}
	
	
	public void Resta() {
		
		this.resultado=num1-num2;
		System.out.println("Resta: "+resultado);

	}
	
	
	public void Multiplicacion() {
		
		this.resultado=num1*num2;
		System.out.println("Multiplicacion: "+resultado);

		
	}
	
	public void Division() {
			this.resultado=num1/num2;
			System.out.println("Division: "+resultado);
	}
	
	public static void main(String[]args)throws Exception {
		
		Operaciones op= new Operaciones(44,3);
		op.Suma();
		op.Resta();
		op.Multiplicacion();
		
		try {

			op.Division();
			
		}catch(ArithmeticException ae){
			System.out.println(ae.getMessage());
	}
	

		
	}
	
	
	

}
