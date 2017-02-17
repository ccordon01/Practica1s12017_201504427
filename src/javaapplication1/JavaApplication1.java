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
        new LeerXml().cargarXml();
        Matriz m = new Matriz(4, 4);
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (m.item(2, 2) != null) {
                    System.out.println("nodo existe");
                } else {
                    System.out.println("pise");
                }
            }
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

        /*ListaCircular personas=new ListaCircular();
        System.out.println("Ingrese jugador: ");
        String repetir="";
        do {
            System.out.println("Ingrese nombre");
            personas.insertarAlFinal(e.next());
            System.out.println("Ingrese n para salir");
            repetir=e.next();
        } while (repetir!="n");*/
    }

}
