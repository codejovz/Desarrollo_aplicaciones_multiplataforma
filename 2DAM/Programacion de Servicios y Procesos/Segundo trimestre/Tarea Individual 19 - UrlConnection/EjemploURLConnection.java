package Tema3;

import java.io.*;
import java.net.*;

public class EjemploURLConnection {
	
	public static void main(String[] args) {
		
		URL url = null;
		URLConnection urlCon = null;
		
		try {
			
			url = new URL(args[0]);
			urlCon = url.openConnection();
			BufferedReader in;
			InputStream inputStream = urlCon.getInputStream();
			in = new BufferedReader(new InputStreamReader(inputStream));
			String inputLine;
			
			while((inputLine = in.readLine()) != null) {
				System.out.println(inputLine);
			}in.close();
			
		}catch(MalformedURLException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
