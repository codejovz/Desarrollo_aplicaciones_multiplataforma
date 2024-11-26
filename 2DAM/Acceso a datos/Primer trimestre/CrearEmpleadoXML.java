package accesoFicheros;

import org.w3c.dom.*;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import java.io.*;

public class CrearEmpleadoXML {
	
	static String path= "C:\\Users\\jotaa\\OneDrive\\Escritorio\\";
	
    public static void main(String[] args) throws IOException {
        File fichero = new File(path + "FichPersona.txt");
        RandomAccessFile file = new RandomAccessFile(fichero, "r");

        int id, dep, posicion = 0;
        double salario; // Se cambia Double a double
        char[] apellido = new char[10]; // Declarar como arreglo de caracteres

        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();

        try {
            DocumentBuilder builder = factory.newDocumentBuilder();
            DOMImplementation implementation = builder.getDOMImplementation();
            Document document = implementation.createDocument(null, "Empleados", null); // El segundo parámetro debe ser una cadena (nombre de la raíz)

            document.setXmlVersion("1.0");

            while (true) {
                file.seek(posicion);
                id = file.readInt();
                
                for (int i = 0; i < apellido.length; i++) { // Añadida la variable i
                    apellido[i] = file.readChar();
                }
                String apellidoS = new String(apellido);
                dep = file.readInt();
                salario = file.readDouble(); // Corregido de Double a double

                if (id > 0) {
                    Element raiz = document.createElement("empleado");
                    document.getDocumentElement().appendChild(raiz);
                    CrearElemento("id", Integer.toString(id), raiz, document);
                    CrearElemento("apellido", apellidoS.trim(), raiz, document); // Se quita la conversión Integer.toString
                    CrearElemento("dep", Integer.toString(dep), raiz, document);
                    CrearElemento("salario", Double.toString(salario), raiz, document); // Se cambia a Double.toString para salarios
                }

                posicion = posicion + 36; // Mover el puntero 36 bytes hacia adelante
                if (file.getFilePointer() == file.length()) break; // Verificar si llegamos al final del archivo
            }

            // Transformar el documento a XML
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource source = new DOMSource(document);
            StreamResult result = new StreamResult(new File("Empleados.xml"));
            transformer.transform(source, result);

        } catch (Exception e) {
            System.err.println("Error EOF: " + e);
        } finally {
            file.close(); // Asegurar que el archivo se cierra
        }
    }

    // Método para crear elementos en el XML
    static void CrearElemento(String datoEmple, String valor, Element raiz, Document document) {
        Element elem = document.createElement(datoEmple); // Corregido docuent a document
        Text text = document.createTextNode(valor);
        raiz.appendChild(elem);
        elem.appendChild(text); // Corregido element a elem
    }
}






/*  CODIGO MIO
package accesoFicheros;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.DOMImplementation;
import org.w3c.dom.Document;
import org.w3c.dom.Element;



public class CrearEmpleadoXML {
	
	static String path= "C:\\Users\\jotaa\\OneDrive\\Escritorio\\";
	
	public static void main(String[] args) throws IOException{
		
		File fichero= new File(path+"FichPersona.txt");
		RandomAccessFile file = new RandomAccessFile(fichero,"r");
		
		int id, dep, posicion = 0;
		
		Double salario;
		char apellido[] = new char[10];
		
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		
		try {
			
			DocumentBuilder builder = factory.newDocumentBuilder();
			DOMImplementation implementation = builder.getDOMImplementation();
			Document document = implementation.createDocument(null, "Empleados", null);
			document.setXmlVersion("1.0");
			
			while(true) {
				file.seek(posicion);
				id=file.readInt();
				
				for(int i = 0; i<apellido.length; i++) {
					
					apellido[i] = file.readChar();
					
				}
				String apellidoS = new String(apellido);
				dep= file.readInt();
				salario = file.readDouble();
				
				if(id>0) {
					Element raiz = document.createElement("empleado");
					document.getDocumentElement().appendChild(raiz);
					CrearElemento("id", Integer.toString(id), raiz, document);
					CrearElemento("apellido", apellidoS.trim(), raiz, document);
					CrearElemento("dep", Integer.toString(id), raiz, document);
					CrearElemento("salario", Double.toString(id), raiz, document);
				}
				posicion = posicion +36;
				if(file.getFilePointer()==file.length()) {
					break;
				}
				
				Source source = new DOMSource(document);
				Result result = new StreamResult(new java.io.File("Empleados.xml"));
				
				Transformer transformer = TransformerFactory.newInstance().newTransformer();
				transformer.transform(source,result);
				
				
				
				
				
				
				
			}
			
			
			
			
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("ERROR");
			file.close();
		}
		
		/*static void CrearElemento (String datoEmple, String valor, Element raiz, Document document) {
			Element elem = docuemnt.createElement(datoEmple);
			Text text = document.createTextNode(valor);
			raiz.appendChild(elem);
			element.appendChild(text);
		}
		
		

	}

}*/

//CODIGO YOUSSEF

/*

package AccesoFicheros;

import org.w3c.dom.*;
import javax.xml.*;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import java.io.*;

public class CrearEmpleadoXML {
	
	public static void main(String[] args) throws IOException{
		File fichero = new File("AleatorioEmple.dat");
		RandomAccessFile = new RandomAccessFile(fichero, "r");
		
		int id, dep, posicion=0;
		Double salario;
		char apellido = new char[10];
		
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		
		try {
			DocumentBuilder builder = factory.newDocumentBuilder();
			DOMImplementation implementation = builder.getDOMImplementation();
			Document document = implementation.createDocument(null, Empleados, null);
			
			document.setXmlVersion("1.0");
			
			while (true) {
				file.seek(posicion);
				id=file.readInt();
				for (int = 0; i< apellido.length; i++) {
					apellido[i]=file.readChar();
				}
				String apellidoS = new String(apellido);
				dep=file.readInt();
				salario=file.readDouble();
				
				if (id>0) {
					Element raiz = document.createElement("empleado");
					document.getDocumentElement.appendChild(raiz);
					CrearElemento("id", Integer.toString(id),raiz,document);
					CrearElemento("apellido", Integer.toString(apellidoS.trim()),raiz,document);
					CrearElemento("dep", Integer.toString(dep),raiz,document);
					CrearElemento("salario", Integer.toString(salario),raiz,document);
				}
				posicion = posicion + 36;
				if (file.getFilePointer()== file.length()) break;
				Source source = new DOMSource(document);
				Result result = new StreamResult(new java.io.File("Empleados.xml"));
				transformer.transform(source.result);
			}
			catch (Exception e) {
				System.err.println("Error"+e);
			}
			file.close();
			
		}
		static void CrearElemento(String dataEmple, String valor, Element raiz, Document document) {
			Element elem = docuent.createElement(datoEmple);
			Text text = document.createTextNode(valor);
			raiz.appendChild(elem);
			element.appendChild(text);
		}
			
	}
}

*/
