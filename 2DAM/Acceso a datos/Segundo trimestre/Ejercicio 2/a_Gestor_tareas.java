package AD_primer_trimestre;

import java.io.*;
import java.nio.file.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class a_Gestor_tareas {

    static Path path = Paths.get("C:\\Users\\jotaa\\OneDrive\\Escritorio\\ProgramacionSinEditar\\Practica_java_tercer_trimestre\\AD_primer_trimestre\\libroTareas.txt");

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        while (true) {
            System.out.println("\nElige una opción:");
            System.out.println("[1] Ver tareas.");
            System.out.println("[2] Añadir tarea.");
            System.out.println("[3] Eliminar todas las tareas.");
            System.out.println("[4] Marcar tarea como hecha.");
            System.out.println("[5] Salir.");

            int opcion = 0;

            while (!(opcion > 0 && opcion < 6)) {
                try {
                    opcion = teclado.nextInt();
                } catch (InputMismatchException e) {
                    System.out.println("Introduce un número entero.");
                    teclado.next();
                }
            }
            teclado.nextLine(); // Consumir el salto de línea

            switch (opcion) {
                case 1:
                    verTareas();
                    break;
                case 2:
                    añadirTarea(teclado);
                    break;
                case 3:
                    eliminarTareas();
                    break;
                case 4:
                    marcarTareaComoHecha(teclado);
                    break;
                case 5:
                    System.out.println("Saliendo del programa...");
                    teclado.close();
                    System.exit(0);
            }
        }
    }

    private static void verTareas() {
        try {
            if (!Files.exists(path) || Files.size(path) == 0) {
                System.out.println("No hay tareas guardadas.");
                return;
            }

            Files.lines(path).forEach(System.out::println);
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }

    private static void añadirTarea(Scanner teclado) {
        System.out.println("¿Cómo quieres llamar a la tarea?:");
        String nombreT = teclado.nextLine();
        System.out.print("[H]Hecha / [S]Sin hacer: ");
        String hecho = teclado.nextLine().toUpperCase();

        try {
            int id = (int) Files.lines(path).count() / 2;
            Files.write(path, (id + " " + nombreT + "\n" + id + " " + hecho + "\n").getBytes(), StandardOpenOption.CREATE, StandardOpenOption.APPEND);
            System.out.println("Tarea añadida con éxito.");
        } catch (IOException e) {
            System.out.println("Error al escribir en el archivo: " + e.getMessage());
        }
    }

    private static void eliminarTareas() {
        try {
            Files.write(path, new byte[0], StandardOpenOption.TRUNCATE_EXISTING);
            System.out.println("Todas las tareas han sido eliminadas.");
        } catch (IOException e) {
            System.out.println("Error al eliminar las tareas: " + e.getMessage());
        }
    }

    private static void marcarTareaComoHecha(Scanner teclado) {
        System.out.print("¿Qué tarea quieres marcar como hecha? (Introduce el ID): ");
        try {
            int numTarea = teclado.nextInt();
            teclado.nextLine(); // Consumir el salto de línea

            String contenido = new String(Files.readAllBytes(path));
            String[] lineas = contenido.split("\n");
            
            boolean tareaEncontrada = false;
            for (int i = 0; i < lineas.length; i += 2) {
                if (lineas[i].startsWith(numTarea + " ")) {
                    lineas[i + 1] = numTarea + " H";
                    tareaEncontrada = true;
                    break;
                }
            }

            if (tareaEncontrada) {
                Files.write(path, String.join("\n", lineas).getBytes());
                System.out.println("Tarea marcada como hecha.");
            } else {
                System.out.println("No se encontró la tarea con el ID especificado.");
            }
        } catch (InputMismatchException e) {
            System.out.println("Por favor, introduce un número válido.");
            teclado.nextLine(); // Limpiar el buffer
        } catch (IOException e) {
            System.out.println("Error al actualizar el archivo: " + e.getMessage());
        }
    }
}
