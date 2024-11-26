package accesoFicheros;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.File;

import com.thoughtworks.xstream.XStream;

public class CrearXML {

    static String path = "C:\\Users\\jotaa\\OneDrive\\Escritorio\\";

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        // Open the text file for reading
        File fichero = new File(path + "FichPersona.txt");
        FileInputStream filein = new FileInputStream(fichero);
        ObjectInputStream dataIS = new ObjectInputStream(filein);

        System.out.println("Iniciando importación a XML");

        // Create an empty ListaPersonas object
        ListaPersonas listaper = new ListaPersonas();

        // Read objects from the text file until EOFException is thrown
        try {
            while (true) {
                Persona persona = (Persona) dataIS.readObject();
                listaper.add(persona);
            }
        } catch (EOFException e) {
            System.out.println("Terminado - Fin del fichero alcanzado");
        } finally {
            // Ensure dataIS is closed even if an exception occurs
            dataIS.close();
        }

        // Create XStream instance and configure aliases
        XStream xstream = new XStream();
        xstream.alias("ListaPersonasMunicipio", ListaPersonas.class);
        xstream.alias("DatosPersona", Persona.class);
        xstream.addImplicitCollection(ListaPersonas.class, "lista");

        // Convert ListaPersonas to XML and write to file
        try {
            xstream.toXML(listaper, new FileOutputStream("Personaa.xml"));
            String xml = xstream.toXML(listaper);

            System.out.println(xstream);
            System.out.println(xml);
            System.out.println("Creado fichero XML");} //NO LO CREA
            catch (IOException e) {
                System.out.println("Error de E/S: " + e.getMessage());
            } catch (Exception e) {
                System.out.println("Error inesperado: " + e.getMessage());
            }

    }
}