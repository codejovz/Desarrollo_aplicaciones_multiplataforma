package practicaExamenColaboracion1;

public class Club {
	
	public static void main(String[]args) {
		
		Socio socio1=new Socio();
		socio1.cargarDatos();
		Socio socio2=new Socio();
		socio2.cargarDatos();
		Socio socio3=new Socio();
		socio3.cargarDatos();
		
		if(socio1.retornarAntiguedad()>socio2.retornarAntiguedad() && socio1.retornarAntiguedad()>socio3.retornarAntiguedad()) {
			System.out.println("Sabes hacer este puto ejercicio, mañana 10");
		}
		
		
		
		
		
		
		
	}

}
