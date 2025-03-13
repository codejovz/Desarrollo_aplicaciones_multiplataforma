package lanzaproceso;

public class HiloAgrupado extends Thread {
	
	public void run() {
		
		System.out.println(Thread.currentThread().toString());
		System.out.println(Thread.currentThread().getName()+": Finalizada la ejecución.");
		
	}
	

	public static void main(String[] args) {	
		Thread.currentThread().setName("PRINCIPAL");
		System.out.println(Thread.currentThread().getName());
		
		ThreadGroup MiGrupo = new ThreadGroup("MI GRUPO");
		
		HiloAgrupado h = new HiloAgrupado();
		
		Thread h1= new Thread(MiGrupo, h, "Hilo 1");
		Thread h2= new Thread(MiGrupo, h, "Hilo 2");
		Thread h3= new Thread(MiGrupo, h, "Hilo 3");
		System.out.println("TRES HILOS CREADOS...");
		h1.start();
		h2.start();
		h3.start();
		
		System.out.println("Hilos activos: "+Thread.activeCount());
		
		try {
			
			Thread.sleep(1000);
			
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Ha pasado un segundo, interrumpiendo hilos...");
		MiGrupo.interrupt();
		System.out.println("Hilos activos: "+Thread.activeCount());
		
		try {
			h1.join();
			h2.join();
			h3.join();
			System.out.println("Hilos unidos.");
		}catch(InterruptedException e2) {
			e2.printStackTrace();
		}

	}

}
