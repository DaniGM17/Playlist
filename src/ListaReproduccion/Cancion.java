/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ListaReproduccion;

/**
 *
 * @author dania
 */
public class Cancion {
    private String nombre;
    private String interprete;
    private String album;
    private double duracion;
    private String genero;
    private boolean favoritos;
    private int year;
    
    public Cancion(String n, String i, String a, double d, String g, boolean f, int y){
        this.nombre=n;
        this.interprete=i;
        this.album=a;
        this.duracion=d;
        this.genero=g;
        this.favoritos=f;
        this.year=y;
    }

    @Override
    public String toString() {
        return "Nombre: " + getNombre() 
                + "\n Interprete: " + getInterprete() 
                + "\n Album: " + getAlbum() 
                + "\n Duracion: " + getDuracion() 
                + "\n Genero: " + getGenero() 
                + "\n Favoritos: " + isFavoritos() 
                + "\n Year: " + getYear();
    }

    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getInterprete() {
        return interprete;
    }

    public void setInterprete(String interprete) {
        this.interprete = interprete;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public boolean isFavoritos() {
        return favoritos;
    }

    public void setFavoritos(boolean favoritos) {
        this.favoritos = favoritos;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    
    
    
}
