package ejer72;

public class Prueba {
	
	public static void main(String[]args) {
		Suma suma1= new Suma();
		suma1.cargar1();
		suma1.cargar2();
		suma1.operar();
		System.out.println("El resultado de la suma es: ");
		suma1.mostrarResultado();
		Resta resta1 = new Resta();
		resta1.cargar1();
		resta1.cargar2();
		resta1.operar();
		System.out.println("El resultado de la resta es: ");
		resta1.mostrarResultado();
		Multiplicacion m1= new Multiplicacion();
		m1.cargar1();
		m1.cargar2();
		m1.operar();
		System.out.println("El resultado de la multiplicacion es: ");
		m1.mostrarResultado();
		Division d1= new Division();
		d1.cargar1();
		d1.cargar2();
		d1.operar();
		System.out.println("El resultado de la division es: ");
		d1.mostrarResultado();
		
	}

}
