package com.mycompany.practica3;

import java.util.Arrays;
import java.util.Scanner;

public class ProblemaD {
//                          King's Poker 
    public static void main(String[] args) {
       Scanner Entrada = new Scanner(System.in);
       int[] mano = new int[3];
       for(int i=0;i<mano.length;i++){
           System.out.println("De la carta");
           mano[i]=Entrada.nextInt();
       }
        System.out.println("Mano");
        System.out.println(Arrays.toString(mano));
       
        if(mano[0]==mano[1] & mano[0]==mano[2] & mano[2]==mano[1]){
            if(mano[0]==13 & mano[1]==13 & mano[2]==13 ){
                System.out.println("*");
            }else{ 
                for(int i=0;i<mano.length;i++){
                    mano[i]=mano[i]+1;
                }
                System.out.println("Mejor mano");
                System.out.println(Arrays.toString(mano));
            }
        }else if(mano[0]!=mano[1] & mano[0]!=mano[2] & mano[2]!=mano[1]){
           mano[0]=1;
           mano[1]=1;
           mano[2]=2;
           System.out.println("Mejor mano");
           System.out.println(Arrays.toString(mano));
       }else if(mano[0]==mano[1] || mano[0]==mano[2] || mano[2]==mano[1]){
           int cont1=0;
           int pol=0;
           for(int i=0;i<mano.length;i++){
               if(mano[i]==13){
                   cont1++;
                   pol=i;
               }
           }
           if (cont1==2){
               for(int i=0;i<mano.length;i++){
                mano[i]=1;
              }
           }else if (cont1==1){
               if(pol==0){
                   mano[1]++;
                   mano[0]=mano[1];
                   mano[2]=1;
               }else if(pol==1){
                   mano[2]++;
                   mano[1]=mano[2];
                    mano[0]=1;
               }else{
                   mano[1]++;
                   mano[2]=mano[1];
                   mano[0]=1;
               }
           }else{
               if(mano[0]==mano[1] & mano[2]<mano[0] & mano[2]<mano[1] ){
                    mano[0]=mano[0]+1;
                    mano[2]=mano[2]+1;
                }else if(mano[0]==mano[2] & mano[1]<mano[0] & mano[1]<mano[2]){
                    mano[0]=mano[0]+1;
                    mano[1]=mano[1]+1;
                }else if(mano[1]==mano[2] & mano[0]<mano[1] & mano[0]<mano[2]){
                    mano[0]=mano[0]+1;
                    mano[2]=mano[2]+1;
                }else if(mano[0]==mano[1] & mano[2]>mano[0] & mano[2]>mano[1] ){
                    mano[2]++;
                }else if(mano[0]==mano[2] & mano[1]>mano[0] & mano[1]>mano[2] ){
                   mano[1]++;
                }else if(mano[1]==mano[2] & mano[0]>mano[1] & mano[0]>mano[2] ){
                    mano[0]++;
                } 
           }
          System.out.println("Mejor mano");
           System.out.println(Arrays.toString(mano));
       }else if (mano[0]==0 & mano[1]==0 & mano[2]==0){
            System.out.println("ERROR");
       }
       
       
    }
}
    
    

