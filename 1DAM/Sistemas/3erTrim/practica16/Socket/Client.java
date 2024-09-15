// A Java program for a Client
import java.io.*;
import java.net.*;
 
public class Client {
    // initialize socket and input output streams
    private Socket socket = null;
    private DataInputStream input = null;
    private DataOutputStream out = null;
 
    // constructor to put ip address and port
    public Client(String address, int port)
    {
        // establish a connection
        try {
            socket = new Socket(address, port);
            System.out.println("Connected");
 
            // takes input from terminal
            input = new DataInputStream(System.in);           
 
            // sends output to the socket
            out = new DataOutputStream(                 //Para escribir por el socket llamando a la función
                socket.getOutputStream());
        }
        catch (UnknownHostException u) {
            System.out.println(u);
            return;
        }
        catch (IOException i) {
            System.out.println(i);
            return;
        }
 
        // string to read message from input
        String line = "";                         //Inicializa una variable
 
        // keep reading until "Over" is input
        while (!line.equals("Final")) {
            try {                                   
                line = input.readLine();
                out.writeUTF("Recibido: "+line);
                System.out.println("Enviado: "+line);
                
            }
            catch (IOException i) {            //captura una clase de entrada o salida, se genera una excepción, con parámetro llamado 'i'
                System.out.println(i);
            }
        }
 
        // close the connection
        try {
            input.close();
            out.close();
            socket.close();
        }
        catch (IOException i) {
            System.out.println(i);
        }
    }
 
    public static void main(String args[])
    {
        Client client = new Client("127.0.0.1", 5555);    //antes el 5000
    } 
}