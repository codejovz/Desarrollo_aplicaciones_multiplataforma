package ejer73propuesto;

public class Empleado extends Persona{
	protected int sueldo;
	public void introdSueldo() {
		System.out.println("Introduce el sueldo: ");
		sueldo=teclado.nextInt();
		
	}
	public void impriSueldo() {
		System.out.println("Su sueldo es: "+sueldo);
	}

}
