
package com.mycompany.practica3;
import java.util.Scanner;
public class ProblemaC {
//                              Flowers Flourish from France 
   public static void main(String[] args) { 
        		Scanner entrada = new Scanner(System.in);
		do
		{
			String frase = entrada.nextLine();
                        frase = frase.toLowerCase();
			String comparador = "*";
			if(frase.equals(comparador))
				break;
			//Uso el Split para cargar el vector de palabras
			String[] palabras= frase.split(" ");
			for(int i=0 ; i<palabras.length ; i++)
			{
                         // Valor minimo ASCII minuscula 97, Valor maximo ASCII minuscula 122
                         // Valor minimo ASCII mayuscula 65, Valor maximo ASCII mayuscula 90
				int valorASCII = palabras[i].charAt(0);
				System.out.println(valorASCII);   
                                }

                        if(palabras[0].charAt(0)==palabras[1].charAt(0) && palabras[1].charAt(0)==palabras[2].charAt(0) ){
                                   System.out.println("Y");
                        } else if(palabras[0].charAt(0)==palabras[1].charAt(0) && palabras[1].charAt(0)==palabras[2].charAt(0) && palabras[2].charAt(0)==palabras[3].charAt(0)){
                                   System.out.println("Y");
                        } else if(palabras[0].charAt(0)==palabras[1].charAt(0) && palabras[1].charAt(0)==palabras[2].charAt(0) && palabras[2].charAt(0)==palabras[3].charAt(0) && palabras[3].charAt(0)==palabras[4].charAt(0))
                        {
                                    System.out.println("Y");
                        }else if(palabras[0].charAt(0)==palabras[1].charAt(0) && palabras[1].charAt(0)==palabras[2].charAt(0) && palabras[2].charAt(0)==palabras[3].charAt(0) && palabras[3].charAt(0)==palabras[4].charAt(0)&& palabras[4].charAt(0)==palabras[5].charAt(0))
                        {
                                    System.out.println("Y");
                        } else {
                            System.out.println("N");
                        }                      
		}while(true);
	}

}

