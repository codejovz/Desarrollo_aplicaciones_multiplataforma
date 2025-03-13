package lanzaproceso;

import java.util.Random;

public class MiHilo implements Runnable{
	
	private Random r= new Random();
	
	
	private String nombre;
	
	
	public MiHilo() {
		this.nombre= null;
	}
	
	public MiHilo(String nombre){
		
		this.nombre = nombre;
		
		
		
	}
	


	@Override
	public void run() {
		Thread.currentThread().setName(nombre);
		String nombreHilo= Thread.currentThread().getName();
		System.out.println("Hilo "+nombreHilo+" iniciado.");
		
		int pausa=1000 + r.nextInt(2001);
		try {
			Thread.sleep(pausa);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("Hilo "+nombreHilo+" finalizado, con pausa: "+pausa+"ms.");

	}

}
