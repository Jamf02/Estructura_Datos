package com.mycompany.tarea_estruc_datos;
public class Ejercicio {
    public static void main(String[] args) {
int p = 0;
int n = 8;
int[] x = {-1,2,4,-3,5,2,-5,2};
    for (int a = 0; a < n; a++) {
int s = 0;
    for (int b = a; b <n; b++) {
        s += x[b];
    if(p<s)
        p=s;
}		}
        System.out.println("La Máxima Suma del Subarray es: "+p);  
}  
}