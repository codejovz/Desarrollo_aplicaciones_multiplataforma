package accesoFicheros;

import java.util.ArrayList;

import java.util.List;

public class ListinTelefonico {
	
	private List<PersonaTelefono> lista = new ArrayList<PersonaTelefono>();
	
	public ListinTelefonico(){}
	
	
	public void add(PersonaTelefono per) {
		lista.add(per);
	}
	
	public List<PersonaTelefono> getListinTelefonico(){
		return lista;
	}
	
}
