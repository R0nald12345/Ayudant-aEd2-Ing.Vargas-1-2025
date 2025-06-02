/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ArbolBinario;

/**
 *
 * @author USER
 */
public class Main {
    
    public static void main(String[] args) {
        ClaseArbol arbol = new ClaseArbol();
        arbol.insertar(100);
        arbol.insertar(80);
        arbol.insertar(120);
        arbol.insertar(20);
        arbol.insertar(90);
        arbol.insertar(160);

        System.out.println("Cantidad de Nodos: " + arbol.contarNodos());
        arbol.InOrden();
        System.out.println("");
        arbol.preOrden();
        System.out.println("");
        arbol.postOrden();
        System.out.println("");
    }
}
