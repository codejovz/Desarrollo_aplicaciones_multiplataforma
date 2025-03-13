package lanzaproceso;

public class ControlSuspension{
	
	public boolean suspender;
	
	public synchronized void set(boolean b) {
		suspender = b;      
		this.notify();  // Termina la espera del hilo
	}
	
	public synchronized void esperandoParaReanudar() throws InterruptedException{
		while(suspender) {
			this.wait();     // Paraliza el hilo
		}
	}

}
