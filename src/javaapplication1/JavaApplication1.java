/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Random;
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
        ListaSimple letras=new ListaSimple();
        ListaCola letras_cola=new ListaCola();
        
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
        System.out.println(diccionario.nodoPosicionKill(1));
        for (int i = 0; i < diccionario.getsize(); i++) {
            System.out.println("nodo palabra "+ diccionario.nodoPosicion(i));
        }
        
        System.out.println("size: "+(letras.getsize() - 1));
        for (int i = 0; i < 12; i++) {
            letras.insertarAlFinal("A");
            letras.insertarAlFinal("E");
        }
        for (int i = 0; i < 9; i++) {
            letras.insertarAlFinal("O");
        }
        for (int i = 0; i < 6; i++) {
            letras.insertarAlFinal("I");
            letras.insertarAlFinal("S");
        }
        for (int i = 0; i < 5; i++) {
            letras.insertarAlFinal("R");
            letras.insertarAlFinal("U");
            letras.insertarAlFinal("N");
        }
        for (int i = 0; i < 4; i++) {
            letras.insertarAlFinal("C");
            letras.insertarAlFinal("T");
            letras.insertarAlFinal("L");
        }
        for (int i = 0; i < 2; i++) {
            letras.insertarAlFinal("H");
            letras.insertarAlFinal("P");
            letras.insertarAlFinal("M");
            letras.insertarAlFinal("B");
            letras.insertarAlFinal("G");
        }
        for (int i = 0; i < 1; i++) {
            letras.insertarAlFinal("Z");
            letras.insertarAlFinal("Ñ");
            letras.insertarAlFinal("X");
            letras.insertarAlFinal("J");
            letras.insertarAlFinal("Q");
            letras.insertarAlFinal("F");
            letras.insertarAlFinal("V");
            letras.insertarAlFinal("Y");
        }
        Random rand = new Random();
        System.out.println("size: "+(letras.getsize() - 1));
        while(letras.getsize()>0){
           System.out.println(letras.nodoPosicionKill(rand.nextInt(letras.getsize() - 1)) + " actual: " + letras.getsize()); 
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
