/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ListaReproduccion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author dania
 */
public class TestingPlaylist {

    public static void main(String[] args) throws IOException {
        BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
        String entrada;
        char respuesta;
        Lista lista = new Lista();

        for (;;) {//ciclo infinito
            System.out.println("Nombre: ");
            entrada = bufer.readLine();
            String nombre = entrada;
            System.out.println("Interpetre: ");
            entrada = bufer.readLine();
            String interpetre = entrada;
            System.out.println("Album: ");
            entrada = bufer.readLine();
            String album = entrada;
            System.out.println("Duracion: ");
            entrada = bufer.readLine();
            double duracion = Double.parseDouble(entrada);
            System.out.println("Genero: ");
            entrada = bufer.readLine();
            String genero = entrada;
            System.out.println("Favorito: ");
            entrada = bufer.readLine();
            boolean favoritos = Boolean.parseBoolean(entrada);
            System.out.println("Año: ");
            entrada = bufer.readLine();
            int year = Integer.parseInt(entrada);
            Cancion unaCancion = new Cancion(nombre, interpetre, album, duracion, genero, favoritos, year);
            lista.add(unaCancion);
            System.out.println("¿Se ha agregado la canción a la lista?");
            System.out.println("¿Quieres agregar más canciones? (y/n)");
            entrada = bufer.readLine();
            respuesta = entrada.charAt(0);
            if (respuesta == 'n' || respuesta == 'N') {
                break;
            }
        }

        System.out.println("------------------------------");
        System.out.println("Inserción de una nueva canción");
        System.out.println("Nombre: ");
        entrada = bufer.readLine();
        String nombre = entrada;
        System.out.println("Interpetre: ");
        entrada = bufer.readLine();
        String interpetre = entrada;
        System.out.println("Album: ");
        entrada = bufer.readLine();
        String album = entrada;
        System.out.println("Duracion: ");
        entrada = bufer.readLine();
        double duracion = Double.parseDouble(entrada);
        System.out.println("Genero: ");
        entrada = bufer.readLine();
        String genero = entrada;
        System.out.println("Favorito: ");
        entrada = bufer.readLine();
        boolean favoritos = Boolean.parseBoolean(entrada);
        System.out.println("Año: ");
        entrada = bufer.readLine();
        int year = Integer.parseInt(entrada);
        Cancion unaCancion = new Cancion(nombre, interpetre, album, duracion, genero, favoritos, year);;
        System.out.println("Escriba la posición en donde quieras insertar:");
        entrada = bufer.readLine();
        int p = Integer.parseInt(entrada);
        lista.add(unaCancion, p);

        System.out.println("------------------------------");
        System.out.println("Contenido de la playlist: ");
        lista.printList();
    }
}
