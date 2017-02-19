/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author cech
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner e = new Scanner(System.in);
        LeerXml xml = new LeerXml();
        xml.cargarXml();
        Matriz m = xml.m;
        ListaSimple diccionario=xml.diccionario;
        for (int i = 0; i < xml.dimension; i++) {
            for (int j = 0; j < xml.dimension; j++) {
                if (m.item(i, j) != null) {
                    System.out.println("nodo existe " + " valor: " + m.item(i, j).datos.toString());
                } else {
                    System.out.println("pise");
                }
            }
        }
        System.out.println("antes de empezar "+diccionario.getsize());
        System.out.println("datos "+diccionario.primerNodo.datos.toString());
        for (int i = 0; i < diccionario.getsize(); i++) {
            System.out.println("nodo palabra "+ diccionario.nodoPosicion(i));
        }
        if (m.primerNodo == null) {
            System.out.println("pise");
        }
        if (m.primerNodo.siguienteNodo == null) {
            System.out.println("pise x2");
        }
        if (m.primerNodo.inferiorNodo == null) {
            System.out.println("pise x3");
        }

        
    }

}
