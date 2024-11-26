import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import com.google.gson.Gson;


public class contarPalabras {
	
	static String path="C:\\Users\\jotaa\\OneDrive\\Escritorio\\";
    
    public static void main(String[] args)  {
    	StringBuilder lineas = new StringBuilder();
    	
    try {
    	File file = new File(path+"trump.txt");
    	FileReader fr = new FileReader(file);
    	BufferedReader br = new BufferedReader(fr);
    	String linea = br.readLine();
    	
    	while(linea != null) {
    		lineas.append(linea);
    		linea = br.readLine();
    	}
    	br.close(); fr.close();
    }catch(IOException e) {
    	e.printStackTrace();
    }
    
    String textoCompleto = lineas.toString();
    String textoLimpio=textoCompleto.replaceAll("[,;.()']", "");
    
    String[] palabrasIndividuales=textoLimpio.split(" ");
    HashMap<String, Integer> palabrasDiferentes = new HashMap<String, Integer>();
    
    for(String palabra: palabrasIndividuales) {
    	if(palabrasDiferentes.containsKey(palabra)) {
    		int valorAnterior = palabrasDiferentes.get(palabra);
    		palabrasDiferentes.replace(palabra, valorAnterior+1);
    	}else {
    		palabrasDiferentes.put(palabra, 1);
    	}
    }
    
    System.out.println("El articulo tenia "+palabrasIndividuales.length+" palabras.");
    
    String json = new Gson().toJson(palabrasDiferentes);
    System.out.println(json);
    

    }
}
