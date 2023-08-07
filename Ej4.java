/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.practico_estructura;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Jorge
 */
public class Ej4 {
static long[] A = new long[80070];
public static void generate(){
boolean[] P = new boolean[1000000];
long limite=(long)Math.pow(10.0, 12);
int i, l;
long j, m;
for( i=2; i<1000; i++){
    if(P[i]==false){
for( j=i+i; j<1000000; j+=i ){
 P[(int)j] = true;
 }
 }
 }
 l=0;
for(i=2; i<1000000; i++){
    if( P[i]==false ){
 m=(long)i;
for(j=m*m; j<limite; j*=m){
 A[l++] = j;
 }
 }
 }
 Arrays.sort(A);
 }
public static void main( String args[] ){
 Scanner Entrada = new Scanner( System.in );
 int N;
 long low, high;
 int lowPs, highPs;
 generate();
 N = Entrada.nextInt();
      while( (N)>0){
 low = Entrada.nextLong();
 high = Entrada.nextLong();
 lowPs = Arrays.binarySearch(A,low);
    if( lowPs<0  )
 lowPs = (-1)*(lowPs+1);
 highPs=Arrays.binarySearch(A,high);
    if( highPs<0 )
 highPs = (-1)*(highPs+2);
 System.out.println(highPs-lowPs+1);
 }
 }
}