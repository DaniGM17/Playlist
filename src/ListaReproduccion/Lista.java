/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ListaReproduccion;

/**
 *
 * @author dania
 */
public class Lista<T> {

    private Nodo head; //Apuntador a la cabecera de la lista(primer nodo)
    private Nodo tail;//Apuntador a la cola de la lista (último nodo)
    private Nodo actual;
    private int size;//Tamaño de la lista(número de nodos en la lista)

    public Lista() {
        this.head = null;
        this.actual = null;
        this.tail = null;
        this.size = 0;
    }
    
    public void add(Cancion cancion) {
        Nodo nuevoNodo = new Nodo(cancion);
        this.size++;
        this.tail = nuevoNodo; //se mueve el apuntador al último nodo
        if (head == null) {//La lista está vacía, creamos el nodo
            head = nuevoNodo;
            actual = head;
        } else {
            actual.setSiguiente(nuevoNodo); //actual.sig apunta al nuevoNodo (enlace entre nodos)
            actual = nuevoNodo;//Ahora actual es el nuevo nodo
        }
    }
    
    public void add(Cancion cancion, int posicion) {
        Nodo nuevoNodo = new Nodo(cancion);
        int i = 1;
        actual = head;
        while (i < posicion - 1) {
            actual = actual.getSiguiente();
            i++;
        }
        Nodo auxiliar = actual.getSiguiente();
        actual.setSiguiente(nuevoNodo);
        actual = nuevoNodo;
        actual.setSiguiente(auxiliar);
    }
    
    public void addInicio(Cancion cancion) {
        Nodo nuevoNodo = new Nodo(cancion);
        Nodo aux = head;
        head = nuevoNodo;
        head.setSiguiente(aux);
        
    }
    
    public void delete(){
        if(head == null){
            System.out.println("La lista está vacía");
            return;
        }else{
            if(head != tail){
                actual = head;
                while(actual.siguiente != tail){
                    actual = actual.siguiente;
                }
                tail = actual;
                tail.siguiente=null;
            }else{
                head = tail = null;
            }
        }
        
    }
    
    public void printList() {
        int posicion = 1;
        actual = head;
        while (actual != null) {
            System.out.println("Canción " + posicion);
            System.out.println(actual.getObjeto().toString());
            actual = actual.getSiguiente();//obtiene dirección del siguiente nodo para que se pueda mover
            posicion++;
        }
    }
    
}
