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
public class Nodo<T> {

    private T objeto;//dato almacendo
    private Nodo siguiente;// apuntador al siguiente nodo, referencia a la misma clase

    public Nodo(T o) {
        this.objeto = o;
        this.siguiente = null;
    }

    public T getObjeto() {
        return objeto;
    }

    public void setObjeto(T o) {
        this.objeto = o;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo otroNodo) {
        this.siguiente = otroNodo;
    }

   

}
