/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ListaReproduccion;

/**
 *
 * @author dania
 * @param <T>
 */
public class Nodo{

    private Cancion objeto;//dato almacendo
    public Nodo siguiente;// apuntador al siguiente nodo, referencia a la misma clase

    public Nodo(Cancion o) {
        this.objeto = o;
        this.siguiente = null;
    }

    public Cancion getObjeto() {
        return objeto;
    }

    public void setObjeto(Cancion objeto) {
        this.objeto = objeto;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo otroNodo) {
        this.siguiente = otroNodo;
    }

    

   

}
