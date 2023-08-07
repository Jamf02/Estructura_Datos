/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.practicon2;
import java.util.Arrays;
import java.util.Scanner;

public class ListasEnlazadas
{
	//Declaro la variable de instancia cabecera para determinar donde 
	//comienza mi lista enlazada
        int longitud=0;
	Nodo cabecera;
	//defino mi estructura Nodo
	static class Nodo
	{
                
		int valor;
		Nodo puntero;
	}
	public void adicionarEnLista(int dato)
	{
		//con el dato que me llega al método creo un nodo
		Nodo nuevoNodo = new Nodo();
		nuevoNodo.valor = dato;
		nuevoNodo.puntero = null;//aun que no le asigne el valor null, este ya apunta a null
		//pregunto si mi Lista Enlazada esta vacía
		if (this.cabecera == null)
			this.cabecera = nuevoNodo;
		else
		{
		//PARA recorrer la Lista Enlazada utilizo una variable auxiliar
			Nodo aux = this.cabecera;
			while(aux.puntero!=null)
			{
				aux = aux.puntero; //de esta manera recorro la variable auxiliar
			}
			aux.puntero = nuevoNodo;
		}
	}
	public void mostrarListaEnlazada()
	{
		if(this.cabecera==null)
			System.out.println("La Lista Enlazada está vacia.");
		else
		{
			//declaro una variable auxiliar para recorrer la lista enlazada
			Nodo aux = this.cabecera;
			while(aux!=null)
			{
				System.out.print(aux.valor+"->");
				aux = aux.puntero;
			}
			System.out.println("null");
		}

}
        public void borrarEnListaPorValor(int valorABorrar)
	{
		if(this.cabecera==null)
			System.out.println("La lista enlazada está vacia");
		else
		{
			if(this.cabecera.valor==valorABorrar)
				this.cabecera = this.cabecera.puntero;
			else
			{
				Nodo aux = this.cabecera;
				Nodo aux2 = aux.puntero;
				while(aux2!=null)
				{
					if(aux2.valor==valorABorrar)
					{
						aux.puntero = aux2.puntero;
						aux2.puntero=null;
						aux2=aux.puntero;
					}
					aux = aux.puntero;
					aux2 = aux.puntero;
				}
			}
		}
	}
        public void borrarPorPosicion(int n){
            if(cabecera!=null){
                   if(n==0){
                    Nodo primer=cabecera;
                    cabecera=cabecera.puntero;
                    primer.puntero=null;
                    longitud--;
                  }else if(n>longitud){
                    Nodo puntero=cabecera;
                    int cont=0;
                    while(cont<(n-1)){
                       puntero=puntero.puntero;
                       cont++;
                   }
                    Nodo temp=puntero.puntero;
                    puntero.puntero=temp.puntero;
                    temp.puntero=null;
                    longitud--;
               }
            }
        }
        
        public void OrdenarListaAsc()
        {
            
        }
        public void OrdenarListaDesc(){
            
        }
        public void ReemplazarLista(){
            
        }
	
	public static void main(String[] args) 
	{
		Scanner entrada = new Scanner(System.in);
		ListasEnlazadas lista = new ListasEnlazadas();
		int opcion=0;
		do
		{
			System.out.println("================MENÚ==================");
			System.out.println("======================================");
			System.out.println("1. Ingresar elemento en Lista Enlazada");
			System.out.println("2. Mostrar Lista Enlazada");
			System.out.println("3. Borrar por Posición");
			System.out.println("4. Reemplazar en Lista Enlazada");
			System.out.println("5. Borrar por Valor");
			System.out.println("6. Ordenar Lista Enlazada (A)");
			System.out.println("7. Ordenar Lista Enlazada (D)");
			System.out.println("0. SALIR");
			System.out.println("OPCION->");
			opcion = entrada.nextInt();
                       
			switch(opcion)
			{
				case 1: System.out.println("Ingrese el valor a ser ingresado en la lista ->");
					    int valor = entrada.nextInt();
					    lista.adicionarEnLista(valor);
                                            
					    break;
				case 2: lista.mostrarListaEnlazada();
						break;
                                case 3: System.out.println("Borrar por Posición");
                                            int valorBP = entrada.nextInt();
                                            lista.borrarPorPosicion(valorBP);
                                           
                                                break;
                                case 4: System.out.println("Ingrese el valor antiguo");
                                        int valAntiguo = entrada.nextInt();
                                        System.out.println("Ingrese el valor nuevo");
                                        int valNuevo = entrada.nextInt();
                                        if(valAntiguo != valNuevo){
                                            valAntiguo = valNuevo;
                                            lista.mostrarListaEnlazada();
                                        }
                                                break;
                                case 5: System.out.println("Ingrese el valor a borrar");
                                            int valorB = entrada.nextInt();
                                            lista.borrarEnListaPorValor(valorB);
                                            break;
                                            
                                             
                                case 6: 
                                    //este creo que es con array y sort pero ni idea
                                                break;
                                case 7: 
                                                break;
				//IMPLEMENTAR TODAS LAS OPCIONES QUE SE SOLICITAN
				case 0: System.out.println("Terminado");
			}
		}while(opcion!=0);
        }
                
}