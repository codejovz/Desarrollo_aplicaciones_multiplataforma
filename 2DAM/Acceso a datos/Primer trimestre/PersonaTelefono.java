package accesoFicheros;

import java.io.Serializable;

public class PersonaTelefono implements Serializable{
	
	private String nombre,telefono;
	
	
	public PersonaTelefono() {
		this.nombre=null;
		this.telefono=null;
	}
	
	
	public PersonaTelefono(String nombre,String telefono){
		this.nombre=nombre;
		this.telefono=telefono;
	}
	
	public void setNombre(String nombre) {this.nombre=nombre;}
	
	public void setNumero(String numero) {this.telefono=telefono;}
	
	public String getNombre() {return nombre;}
	
	public String getTelefono() {return telefono;}
	}
	
	
