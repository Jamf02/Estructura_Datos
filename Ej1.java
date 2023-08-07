/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.practico_estructura;

import java.util.Scanner;

/**
 *
 * @author Jorge
 */
public class Ej1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                // TODO code application logic here
        Scanner Entrada = new Scanner(System.in);
 int numero = Entrada.nextInt();
 int contador= 0;
 int contadorhyper = 0;
    for(int i = 1 ; i <=numero ; i++){
        if(numero%i==0){
            contador++;
            //imprimes la solucion
            System.out.println(i);
        }
        
    }
    System.out.println( "los  intentos: "+ contador);
    for(int i1 = 1 ; i1 <=contador ; i1++){
        if(contador%i1==0){
            contadorhyper++;
        }
       
    }
   System.out.println(contadorhyper);
   if(contadorhyper>3){
       System.out.println("No es hyperprimo");
   }else{
       System.out.println("Es hyperprimo");
   }
        
    }
   }
    

