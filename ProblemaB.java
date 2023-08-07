package com.mycompany.practica3;

import java.util.Scanner;

public class ProblemaB {

    public static String lectura1 = "*.";
    public static String lectura2 = "**";
    public static String lectura3 = ".*";
    public static String lectura4 = "..";
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int casos= entrada.nextInt();
        
        String opcion = entrada.next();
        
        if(opcion.equals("s")||opcion.equals("S")){
            do{
            String codigoEntrada = entrada.nextLine();
            
            for(int i = 0; i < codigoEntrada.length(); i++){
                char caracter = codigoEntrada.charAt(i);
                if(caracter == '0'){
                    System.out.print(lectura3);
                    System.out.print(lectura2);
                    System.out.print(lectura4);
                    System.out.println("------------");
                    casos--;
                }
                if(caracter == '1'){
                    System.out.print(lectura1);
                    System.out.print(lectura4);
                    System.out.print(lectura4);
                    System.out.println("------------");
                    casos--;
                }
                if(caracter == '2'){
                    System.out.println(lectura1);
                    System.out.println(lectura1);
                    System.out.println(lectura4);
                    System.out.println("------------");
                    casos--;
                }
                if(caracter == '3'){
                    System.out.println(lectura2);
                    System.out.println(lectura4);
                    System.out.println(lectura4);
                    System.out.println("------------");
                    casos--;
                }
                if(caracter == '4'){
                    System.out.println(lectura2);
                    System.out.println(lectura3);
                    System.out.println(lectura4);
                    System.out.println("------------");
                    casos--;
                }
                if(caracter == '5'){
                    System.out.println(lectura1);
                    System.out.println(lectura3);
                    System.out.println(lectura4);
                    System.out.println("------------");
                    casos--;
                }
                if(caracter == '6'){
                    System.out.println(lectura2);
                    System.out.println(lectura1);
                    System.out.println(lectura4);
                    System.out.println("-----------");
                    casos--;
                }
                if(caracter == '7'){
                    System.out.println(lectura2);
                    System.out.println(lectura2);
                    System.out.println(lectura4);
                    System.out.println("------------");
                    casos--;
                }
                if(caracter == '8'){
                    System.out.println(lectura1);
                    System.out.println(lectura2);
                    System.out.println(lectura4);
                    System.out.println("------------");
                    casos--;
                }
                if(caracter == '9'){
                    System.out.println(lectura3);
                    System.out.println(lectura1);
                    System.out.println(lectura4);
                    System.out.println("------------");
                    casos--;
                }  
            }
        }while(casos!=0);
        }else{
            do{
            String codigoEntradaF1 = entrada.next();
            String codigoEntradaF2 = entrada.next();
            String codigoEntradaF3 = entrada.next();
            
            if(codigoEntradaF1.equals(lectura3)&codigoEntradaF2.equals(lectura2)&codigoEntradaF3.equals(lectura4)){
                System.out.println("0");
                casos--;
            }
            if(codigoEntradaF1.equals(lectura1)&codigoEntradaF2.equals(lectura4)&codigoEntradaF3.equals(lectura4)){
                System.out.println("1");
                casos--;
            }
            if(codigoEntradaF1.equals(lectura1)&codigoEntradaF2.equals(lectura1)&codigoEntradaF3.equals(lectura4)){
                System.out.println("2");
                casos--;
            }
            if(codigoEntradaF1.equals(lectura2)&codigoEntradaF2.equals(lectura4)&codigoEntradaF3.equals(lectura4)){
                System.out.println("3");
                casos--;
            }
            if(codigoEntradaF1.equals(lectura2)&codigoEntradaF2.equals(lectura3)&codigoEntradaF3.equals(lectura4)){
                System.out.println("4");
                casos--;
            }
            if(codigoEntradaF1.equals(lectura1)&codigoEntradaF2.equals(lectura3)&codigoEntradaF3.equals(lectura4)){
                System.out.println("5");
                casos--;
            }
            if(codigoEntradaF1.equals(lectura2)&codigoEntradaF2.equals(lectura1)&codigoEntradaF3.equals(lectura4)){
                System.out.println("6");
                casos--;
            }
            if(codigoEntradaF1.equals(lectura2)&codigoEntradaF2.equals(lectura2)&codigoEntradaF3.equals(lectura4)){
                System.out.println("7");
                casos--;
            }
            if(codigoEntradaF1.equals(lectura1)&codigoEntradaF2.equals(lectura2)&codigoEntradaF3.equals(lectura4)){
                System.out.println("8");
                casos--;
            }
            if(codigoEntradaF1.equals(lectura3)&codigoEntradaF2.equals(lectura1)&codigoEntradaF3.equals(lectura4)){
                System.out.println("9");
                casos--;
            }
            }while(casos!=0);
        }
    }
    
}
    
    

