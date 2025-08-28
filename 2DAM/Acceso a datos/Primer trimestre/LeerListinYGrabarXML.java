import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.RandomAccessFile;
import java.io.BufferedWriter;
import java.io.FileWriter;

import java.util.*;

import accesoFicheros.ListinTelefonico;
import accesoFicheros.PersonaTelefono;

import java.io.*;
import com.thoughtworks.xstream.XStream;

public class LeerListinYGrabarXML {
	
	static String path= "C:\\Users\\jotaa\\OneDrive\\Escritorio\\";
	
	public static void main(String[] args) throws IOException{
		
		ListinTelefonico listTel = new ListinTelefonico();
		Scanner scanner = new Scanner(System.in);
		File fichero = new File(path+"listin.txt");
		RandomAccessFile file= new RandomAccessFile(fichero,"rw");

		
		String nombres[]={"Alberto matensalsa","Ernesto esvida","Gustavo debasica", "Luis Ricardo Borriquero"};
		String numeros[]= {"915445857","915788544","915663254","915758963"};
		String xmlCompleto = "";
		StringBuffer buffer = null;
		
		int n = nombres.length;
		
		for (int i=0; i<n; i++) {
			
			buffer= new StringBuffer(nombres[i]);
			buffer.setLength(24);
			file.writeChars(buffer.toString());
			
			buffer=new StringBuffer(numeros[i]);
			buffer.setLength(9);
			file.writeChars(buffer.toString());
			
		}
		System.out.println("Archivo creado, su contenido:"+"\n");
		
		
		//-----------------------------------------------------LECTURA ARCHIVO----------------------------------------------------------------
		
		char apellido[]= new char[24];
		char telefono[]= new char[9];
		
		int posicion = 0;
		
		while(true) {
			
			file.seek(posicion);
			
			for(int i =0; i<apellido.length;i++) {
				apellido[i]=file.readChar();
			}
			
			for(int i=0; i<telefono.length;i++) {
				telefono[i]= file.readChar();
			}
			
			String telefonoS= new String(telefono);
			String apellidoS = new String(apellido);
			
			PersonaTelefono perTel= new PersonaTelefono(apellidoS.trim(),telefonoS.trim());
			
			listTel.add(perTel);

			
			System.out.println("Apellido: "+apellidoS.trim()+" Numero: "+telefonoS.trim());
			posicion= posicion+66;
			
			if(file.getFilePointer()==file.length()) {
				break;
			}
			
		}
		
		//-----------------------------------------CREACION archivo XML-----------------------------------------------------------------
		System.out.println("");
		System.out.print("En que archivo quieres grabar el XML?(listinTelefonico.xml)");
		String ficheroXML = scanner.nextLine();
		scanner.close();
		
		
		System.out.println("Iniciando creacion XML");
		
			XStream xstream= new XStream();
			xstream.alias("ListinTelefonico", ListinTelefonico.class);
			xstream.alias("PersonaConTelefono", PersonaTelefono.class);
			
			
			xstream.addImplicitCollection(ListinTelefonico.class, "lista");
			
			for (int i=0; i<n/4; i++) { //añade al string todos los streams de XML

				
				String xml = xstream.toXML(listTel);
				xmlCompleto = xmlCompleto + xml;
				
			}
			String xml = xstream.toXML(listTel);
				
			System.out.println(xmlCompleto);			
			//a
			//String xml = xstream.toXML(listTel);
			
			System.out.println("Creado contenido fichero XML en ficheroXML");
			
		
		//Creacion archivo-------------------------------------------------------------------------------
		
		try {
			FileWriter fw = new FileWriter(path+ficheroXML);
			BufferedWriter br = new BufferedWriter(fw);
			
			br.write(xmlCompleto);
			System.out.println("Creado en el escritorio");
			br.close();fw.close();
			
			
		}catch(IOException ioe) {
			ioe.printStackTrace();
		}

		
		file.close();
				
	}

}
