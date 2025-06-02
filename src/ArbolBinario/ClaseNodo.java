/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ArbolBinario;

/**
 *
 * @author Ronald Camino P.
 */
public class ClaseNodo {
    
    public ClaseNodo hijoIzq;
    public ClaseNodo hijoDer;
    public int dato; //x
    
    public ClaseNodo(int dato){
        this.dato = dato;
        this.hijoDer = null;
        this.hijoIzq = null;
    }
    
}
