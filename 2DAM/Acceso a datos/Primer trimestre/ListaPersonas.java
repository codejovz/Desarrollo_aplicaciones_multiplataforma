package accesoFicheros;

import java.io.Serializable;
import java.util.ArrayList;

import java.util.List;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;


@XmlRootElement(name="personas")
public class ListaPersonas implements Serializable{
	
	private List<Persona> lista = new ArrayList<Persona>();
	
	

	public ListaPersonas() {}
	
	public void add(Persona per) {
		lista.add(per);
	}
	
	
	@XmlElementWrapper
	@XmlElement(name = "persona")   //el parentesis es opcional
	public List<Persona> getListaPersonas(){
		return lista;
	}
	
	public void setListaPersonas(List<Persona>listaper) {lista = listaper;}
	

}

//instalar eclipseLink 2.5.2 en library cuando se cree el proyecto
