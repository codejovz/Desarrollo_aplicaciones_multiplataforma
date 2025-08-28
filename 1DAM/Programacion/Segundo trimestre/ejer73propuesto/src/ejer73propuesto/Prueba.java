package ejer73propuesto;

public class Prueba {
	
	public static void main(String[]args) {
		Persona ps1= new Persona();
		ps1.cargar();
		ps1.imprimir();
		Empleado emp=new Empleado();
		emp.cargar();
		emp.introdSueldo();
		emp.imprimir();
		emp.impriSueldo();
		
	}

}
