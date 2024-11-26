import java.io.IOException;

public class PersonaAdulta {
	
	private String nombre;
	private int edad;
	
	public PersonaAdulta(String nombre, int edad)throws Exception{
		
		this.nombre = nombre;
		if(edad<18) {
			throw new Exception("La persona "+nombre+" no es adulta porque tiene "+edad+" años.");
		}
		this.edad= edad;

	}
	
	public void fijarEdad(int edad)throws Exception{
		
		if(edad<18) {
			throw new Exception ("La persona "+nombre+" no es adulta porque tiene "+edad+" años.");
		}
		this.edad=edad;		
	}
	
	public void imprimir() {
		System.out.println(nombre+" tiene "+edad+" años.");
		
	}
	
	public static void main(String[]args) throws Exception {
		try {
			
			PersonaAdulta p1= new PersonaAdulta("Jorge",23);
			p1.imprimir();
			
			PersonaAdulta p2= new PersonaAdulta("Ramon",3);
			p2.imprimir();
						
			
		}catch(IOException ex){
			System.out.println(ex.getMessage());
		}
	}

}
