/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.practicon2;

import java.util.Scanner;

/**
 *
 * @author Jorge
 */
public class ListaCircularDoblementeEnlazada {
    Nodo primero;
    Nodo ultimo;
    static class Nodo{
        int dato;
        Nodo siguiente;
        Nodo anterior;
    }
    public void agregarNodo(int dato){
        Nodo nuevoNodo = new Nodo();
        nuevoNodo.dato = dato;
        if(this.primero == null){
            nuevoNodo.siguiente = nuevoNodo;
            nuevoNodo.anterior = nuevoNodo;
            this.primero = nuevoNodo;
            this.ultimo = nuevoNodo;
           
        }
        else {
            nuevoNodo.anterior = this.ultimo;
            this.ultimo.siguiente = nuevoNodo;
            nuevoNodo.siguiente = this.primero;
            this.primero.anterior = nuevoNodo;
            this.ultimo = nuevoNodo;
        }
        
    }
    public void mostrarListaCircular(int CantidadElementos){
        if(this.primero == null){
         System.out.println("La Lista Circular está vacia");   
        } else {
            Nodo aux = this.primero;
            for(int i = 0; i< CantidadElementos; i++){
            System.out.print(aux.dato+"->");
            aux = aux.siguiente;
        }
            System.out.println();
        }
            
    }
    
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        ListaCircularDoblementeEnlazada lista = new ListaCircularDoblementeEnlazada();
        System.out.println("Ingrese la cantidad ->");
        int valor = entrada.nextInt();
        lista.agregarNodo(4);
        lista.agregarNodo(1);
        lista.agregarNodo(2);
	lista.mostrarListaCircular(valor);
        
        
    }
}
