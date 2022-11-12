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
        char respuesta;
        Lista lista = new Lista();
        String usuario;
        int opcion;
        BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
        String entrada;
        char continuar;

        System.out.println("Ingresa tu nombre");
        entrada = bufer.readLine();
        usuario = entrada;

        System.out.println("Bienvenid@ " + usuario + " a tu top de canciones");
        System.out.println("¿Qué quieres hacer hoy?");
        do {
            System.out.println("1.-Agregar una canción");
            System.out.println("2.-Agregar una canción a una posición ya utilizada");
            System.out.println("3.-Borrar la última canción agregada");
            System.out.println("4.-Borrar una canción de una posición");
            System.out.println("5.-Buscar canción por posición");
            System.out.println("6.-Buscar canción por nombre");
            System.out.println("7.-Mostrar mi lista de reproducción");
            System.out.println("8.-¿Cuantás canciones hay en mi lista?");
            entrada = bufer.readLine();
            opcion = Integer.parseInt(entrada);

            switch (opcion) {
                case 1:
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
                        System.out.println("Se ha agregado la canción a la lista");
                        System.out.println("¿Quieres agregar más canciones? (y/n)");
                        entrada = bufer.readLine();
                        respuesta = entrada.charAt(0);
                        if (respuesta == 'n' || respuesta == 'N') {
                            break;
                        }
                    }
                    break;
                case 2:
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
                    Cancion unaCancion = new Cancion(nombre, interpetre, album, duracion, genero, favoritos, year);
                    System.out.println("Escriba la posición en donde quieras insertar:");
                    entrada = bufer.readLine();
                    int p = Integer.parseInt(entrada);
                    if (p == 1) {
                        lista.addInicio(unaCancion);
                    } else {
                        lista.add(unaCancion, p);
                    }
                    break;

                case 7:
                    System.out.println("------------------------------");
                    System.out.println("Contenido de la playlist: ");
                    lista.printList();
                    break;
            }
            System.out.println("¿Quieres realizar otra acción?");
            entrada = bufer.readLine();
            continuar = entrada.charAt(0);
        } while (continuar == 'Y' || continuar == 'y');

    }
}
