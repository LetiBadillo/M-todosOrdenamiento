/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmosdeordenamiento;

import java.util.Vector;

/**
 *
 * @author ASUS
 */
public class tipos {
    static int auxiliar;
    
    public static void seleccion(int x[]){
        for(int i=0; i<x.length; i++){  
            int m=i;
            for (int j=i+1; j < x.length; j++){
                if(x[j]<x[m]){
                    m=j;    
                }
            }
                auxiliar=x[i];
                x[i]=x[m];
                x[m]=auxiliar;
        }
}
    
    public static void mostrarArreglo(int x[]){ 
    for (int i=0; i<x.length; i++){ //Recorre el arreglo e imprime sus elementos
        System.out.print("["+x[i]+"]");
}
    
}
}
