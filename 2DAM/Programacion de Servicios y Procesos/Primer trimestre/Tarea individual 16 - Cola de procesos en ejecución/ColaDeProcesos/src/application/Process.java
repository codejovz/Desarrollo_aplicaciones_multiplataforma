package application;

public class Process {
	
	private final int id;
	private final int executionTime; 
	private String state; // "En espera", "Ejecutando", "Terminado"
	public Process(int id, int executionTime) {
		this.id = id;
		this.executionTime = executionTime;
		this.state = "En espera";
	}
	
	public int getId() {
		return id;
	}
	public int getExecutionTime() {
		return executionTime;
	}
	public String getState() {
		 return state;
	}
	public void setState(String state) {
		 this.state = state;
	}
	
	
}
