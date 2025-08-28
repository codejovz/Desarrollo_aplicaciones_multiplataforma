package accesoFicheros;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.thoughtworks.xstream.XStream;

public class LeerXML {
	
	static String path= "C:\\Users\\jotaa\\OneDrive\\Escritorio\\";
	
	public static void main(String[] args) throws IOException, ClassNotFoundException{
		
		File fichero= new File(path+"FichPersona.txt");
		
		XStream xstream = new XStream();
		xstream.alias("ListaPersonasMunicipio", ListaPersonas.class);
		xstream.alias("DatosPersona",Persona.class);
		xstream.addImplicitCollection(ListaPersonas.class, "lista");
		
		ListaPersonas listadoTotal = (ListaPersonas) xstream.fromXML("Personas.xml");
		xstream.fromXML("Personal.xml");
		System.out.println("Numero de personas: "+listadoTotal.getListaPersonas.size());
		
		List<Persona> listaPersonas = new ArrayList<Persona>();
		listaPersonas = listadoTotal.getListaPersonas();
		
		Iterator iterador = listaPersonas.listIterator(); //clase con metodos. de hashnet. mientras tenga elementos los ejecuta
		
		while(iterador.hasNext()) {
			
			Persona p = (Persona)iterador.next();
			System.out.println("Nombre: "+ p.getNombre()+", Edad: "+p.getEdad());
			
			
		}
		
		System.out.println("--------Fin de listado--------");
		

	}

}
