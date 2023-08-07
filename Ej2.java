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
public class Ej2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       int suma=0;
        Scanner Entrada = new Scanner(System.in);
        System.out.println("Introduce primer número: ");
        int n1 = Entrada.nextInt();
        System.out.println("Introduce segundo número: ");
        int n2 = Entrada.nextInt();
        if(n1 == 0 || n2 == 0){
            System.out.println("Cancelado");
            System.exit(0);
        }
        for(int i = 1;i < n1;i++){  // for para sumar todos los divisores propios de n1                                   
             if(n1%i==0){
                suma=suma+i;
             }
        }
  
        // si la suma de los divisores de n1 es igual a n2
        if(suma==n2){
           suma=0;
           for(int i = 1;i < n2;i++){  // sumo los divisores propios de n2                                                
                if(n2%i==0){
                   suma=suma+i;
                }
            }
           //si la suma de los divisores de n2 es igual a n1
           if(suma==n1){
              System.out.println("Son Amigos: "+n2);
           }else{
              System.out.println(-6);
           }
        }        
        else{
             System.out.println(-6);
        }
    }
}
    
   
