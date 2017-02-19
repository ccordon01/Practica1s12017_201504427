/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author cech
 */
public class ListaCircular {

    ListaSimple jugadores;
    NodoLista primerNodo;
    NodoLista ultimoNodo;

    public ListaCircular() {
        this.jugadores = null;
        this.primerNodo = null;
        this.ultimoNodo = null;
    }

    public void insertarAlFinal(Object ei) {
        if (estaVacia()) {
            primerNodo = ultimoNodo = new NodoLista(ei);
        } else {
            ultimoNodo = ultimoNodo.siguienteNodo = new NodoLista(ei).siguienteNodo = primerNodo;
        }
    }

    public Jugadores nodoPosicion(int posicion) {
        NodoLista temp = primerNodo;
        Jugadores jugador = (Jugadores) primerNodo.datos;
        if (!estaVacia()) {
            int c = 0;
            //System.out.println(" ");
                do {
                    //7System.out.println("Lista: "+ c);
                    //System.out.println(actual.lista.nombre);
                    //actual.lista.imprimir();
                    jugador = (Jugadores) temp.datos;
                    temp = temp.siguienteNodo;
                            c++;
                } while (posicion != c);
            
        }
        return jugador;
    }

    public int getsize() {

        NodoLista actual = primerNodo;
        int c = 1;
        //System.out.println(" ");
        do {
            //7System.out.println("Lista: "+ c);
            //System.out.println(actual.lista.nombre);
            //actual.lista.imprimir();
            actual = actual.siguienteNodo;
            c++;
        } while (actual != ultimoNodo && actual != null);
        return c;
    }

    public boolean estaVacia() {
        return primerNodo == null;
    }

}
