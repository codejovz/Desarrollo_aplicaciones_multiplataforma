package lanzaproceso;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class LanzaProcesoEscribeEntrada {

    public static void main(String[] args) {
        String[] comando = {"wsl.exe", "nslookup"};
        ProcessBuilder pb = new ProcessBuilder(comando);
        InputStreamReader isr = null;
        BufferedReader br = null;

        try {
        	isr = new InputStreamReader(System.in, "UTF-8");
        	br = new BufferedReader(isr);
            String linea = null;
            System.out.print("Introduce el nombre de un dominio: ");

            while((linea = br.readLine())!= null && linea.length()!=0) {
                Process p = pb.start();
                OutputStream os = null;
                OutputStreamWriter osw = null;
                BufferedReader br2 = null;

                try {
                    os = p.getOutputStream();
                    osw = new OutputStreamWriter(os, "UTF-8");
                    osw.write(linea + "\n");
                    osw.flush();

                    br2 = new BufferedReader(new InputStreamReader(p.getInputStream()));
                    String lineaSalida;
                    
                    while( (lineaSalida = br2.readLine()) != null) {
                        System.out.println(lineaSalida);
                    }
                    p.waitFor();
                } catch(IOException | InterruptedException e) {
                    System.err.println("Proceso interrumpido.");
                    System.exit(3);
                    e.printStackTrace();
                } finally {
                    if (osw != null) osw.close();
                    if (os != null) os.close();
                    if (br2 != null) br2.close();
                }
                System.out.print("Introducir el nombre del dominio: ");
            }
        } catch (IOException e) {
            System.err.println("Error de ejecución.");
            System.exit(2);
            e.printStackTrace();
        } finally {
            try {
                if (br != null) br.close();
                if (isr != null) isr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        System.out.println("FIN");
    }
}

