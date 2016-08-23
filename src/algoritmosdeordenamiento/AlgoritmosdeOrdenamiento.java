/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmosdeordenamiento;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class AlgoritmosdeOrdenamiento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int v, i, e, a;
        i=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el número de elementos");
        v = sc.nextInt();
        int x[]= new int[v];
        while(i!=v){
        System.out.println("Introduzca el elemento #"+(i+1)+" y presione enter");
        e=sc.nextInt();
        x[i]=e;
        i++;
            }
        System.out.println("Elementos:");
        tipos.mostrarArreglo(x);
        tipos.seleccion(x);
        System.out.println("");
        System.out.println("Elementos ordenados:");
        tipos.mostrarArreglo(x);
        System.out.println("");
        
    }
    
}
