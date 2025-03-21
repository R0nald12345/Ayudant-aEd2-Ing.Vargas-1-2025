/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Negocio;

/**
 *
 * @author USER
 */
public class Main {
    
    public static void main(String[] args) {
        ListaArreglo L1 = new ListaArreglo();
        ListaArreglo L2 = new ListaArreglo();
        ListaArreglo L3 = new ListaArreglo();
        
        L2.insertarFinal(0,1 );
        L2.insertarFinal(1, 3);
        L2.insertarFinal(2, 5); 
        L2.insertarFinal(3, 7);
        
        L3.insertarFinal(0, 2);
        L3.insertarFinal(1, 4);
        L3.insertarFinal(2, 6);
        
        L1.ejercicio7(L2, L3);
        
        //ver los datos
        System.out.println(L1.toString() );
        
        
        
    } 
    
}
