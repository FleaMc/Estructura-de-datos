/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sd2021_semana5ed41_2;

/**
 *
 * @author lambda
 */
public class Nodo <E> {
    //atributos
    private E dato;
    private Nodo <E> siguiente;
    private Nodo <E> anterior;
    
    //métodos

    public Nodo(E dato, Nodo<E> siguiente, Nodo<E> anterior) {
        this.dato = dato;
        this.siguiente = siguiente;
        this.anterior = anterior;
    }

    public E getDato() {
        return dato;
    }


    public Nodo<E> getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo<E> siguiente) {
        this.siguiente = siguiente;
    }

    public Nodo<E> getAnterior() {
        return anterior;
    }

    public void setAnterior(Nodo<E> anterior) {
        this.anterior = anterior;
    }
    
    
    
}
