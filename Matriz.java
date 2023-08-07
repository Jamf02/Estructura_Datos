
package com.mycompany.practicon2;

public class Matriz
{
    Nodo primero;
    Nodo ultimo;
    int filas;
    int columnas;
    
    static class Nodo
    {
        int dato;
        int fila;
        int columna;
        Nodo puntero;
    }
    
    
    public void adicionarEnMatriz(int dato, int f, int c)
    {
        Nodo nuevoNodo = new Nodo();
        nuevoNodo.dato = dato;
        nuevoNodo.fila = f;
        nuevoNodo.columna = c;
        nuevoNodo.puntero = null;
        if(this.primero == null)
        {
            this.primero = nuevoNodo;
            this.ultimo = nuevoNodo;
        }
        else
        {
            this.ultimo.puntero = nuevoNodo;
            this.ultimo = nuevoNodo;
        }
    }
    
    public void mostrarMatriz()
    {
        for(int i = 1; i<=this.filas ; i++)
        {
            for(int j=1 ; j<=this.columnas; j++)
            {	
                Nodo aux = buscarNodo(i,j);
                System.out.print(aux.dato+"\t");
            }
            System.out.println();
        }
        System.out.println("=====================================");
    }
    public void mostrarMatrizTranspuesta()
    {
        for(int i = 1; i<=this.filas ; i++)
        {
            for(int j=1 ; j<=this.columnas; j++)
            {	
                Nodo aux = buscarNodo(j,i);
		System.out.print(aux.dato+"\t");
            }
	System.out.println();
        }
            
    }
    
    public Nodo buscarNodo(int f, int c)
    {
        Nodo aux = this.primero;
        while(true)
        {
            if(aux.fila == f & aux.columna == c)
            return aux;
            aux = aux.puntero;
        }
    }
    public Matriz(int f, int c)
    {
    	this.filas = f;
    	this.columnas = c;
    	this.primero = null;
    }
    public static Matriz multiplicacionMatrices(Matriz m1, Matriz m2){

            if(m1.columnas==m2.filas)
        {
            //Las matrices pueden multiplicarse
            Matriz m = new Matriz(m1.filas,m2.columnas); 

            for(int i=1; i<=m.filas; i++){
                for(int j=1; j<=m.columnas; j++){
                            int ax=0;

                  for(int k = 1 ; k<=m.filas;k++){
                    int dato = ax+(m1.buscarNodo(i,k).dato*m2.buscarNodo(k,j).dato);
                                 ax =dato;

                          }
                          m.adicionarEnMatriz(ax, i, j);

                        }
                }
            return m;
        }
        else
            return null;

    }
    public static Matriz sumaDeMatrices(Matriz m1, Matriz m2)
    {
    	if(m1.filas==m2.filas&m1.columnas==m2.columnas)
    	{
    		//Las matrices pueden sumarse
    		Matriz s = new Matriz(m1.filas,m2.columnas); //Así deben definir la matriz resultante para la multiplicación
    		for(int i=1; i<=m1.filas; i++)
    			for(int j=1; j<=m1.columnas; j++)
    			{
    				int dato = m1.buscarNodo(i,j).dato+m2.buscarNodo(i, j).dato;
    				s.adicionarEnMatriz(dato, i, j);
    			}			
    		return s;
    	}
    	else
    		return null;
    }
    
   
    public static void main(String[] args) 
    {
        Matriz m1 = new Matriz(2,2);
        m1.adicionarEnMatriz(1, 1, 1);
        m1.adicionarEnMatriz(4, 2, 2);
        m1.adicionarEnMatriz(2, 1, 2);
        m1.adicionarEnMatriz(3, 2, 1);	
        m1.mostrarMatriz();
        Matriz m2 = new Matriz(2,2);
        m2.adicionarEnMatriz(3, 1, 1);
        m2.adicionarEnMatriz(-1, 2, 2);
        m2.adicionarEnMatriz(5, 1, 2);
        m2.adicionarEnMatriz(10, 2, 1);
        m2.mostrarMatriz();
        //m1.mostrarMatrizTranspuesta();
        Matriz suma = sumaDeMatrices(m1,m2);
        if(suma == null)
        	System.out.println("La dimensión tiene que ser igual para sumar");
        else
                System.out.println("==========SUMA MATRICES M1 Y M2==========");
        	suma.mostrarMatriz();
        System.out.println("==========MATRIZ TRANSPUESTA M1==========");
        m1.mostrarMatrizTranspuesta();
         System.out.println("==========MATRIZ TRANSPUESTA M2==========");
        m2.mostrarMatrizTranspuesta();
                System.out.println("==========MULTIPLICACION DE MATRICES M1 M2==========");
        Matriz multi = multiplicacionMatrices(m1, m2);
        multi.mostrarMatriz();
       
    }
    
}