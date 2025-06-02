/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ArbolBinario;

/**
 *
 * @author USER
 */
public class ClaseArbol {
    
    public ClaseNodo raiz;
    
    //Constructor
    public ClaseArbol(){
        this.raiz = null;
    }
    
    //insertar
    public void insertar(int x){
        this.raiz = this.insertarRecursivo(x, raiz);
    }
    
    private ClaseNodo insertarRecursivo(int x,ClaseNodo raizAux){
        if(raizAux == null){
            return new ClaseNodo(x);
//            ClaseNodo nuevoNodo = new ClaseNodo(x);
//            raizAux = nuevoNodo;
//            return raizAux;
        }else{
            //Caso general
            if(x < raizAux.dato ){
                raizAux.hijoIzq = insertarRecursivo(x,raizAux.hijoIzq); 
            }else{
                raizAux.hijoDer = insertarRecursivo(x,raizAux.hijoDer);
            }
        }
        return raizAux;
    }
      //contar Nodos
    public int contarNodos(){
        return contarNodosRecursivo(raiz);
    }
    
    private int contarNodosRecursivo(ClaseNodo raizAux){
        if(raizAux == null){
            return 0;
        }
        //2do caso base
        if(isHoja(raizAux)){
            return 1;
        }
        //Caso general
        int i = contarNodosRecursivo(raizAux.hijoIzq); // 3
        int d = contarNodosRecursivo(raizAux.hijoDer); //2
        return i + d+1;
    }
    
    private boolean isHoja(ClaseNodo nodo){ //Nodo Terminal
        return nodo.hijoIzq == null && nodo.hijoDer == null;
    }
    
    //Recorridos InOrden
    public void InOrden(){
        InOrdenRecursivo(raiz);
    }
    
    private void InOrdenRecursivo(ClaseNodo raizAux){
        if(raizAux == null){
            return;
        }
        InOrdenRecursivo(raizAux.hijoIzq);
        System.out.print(" " +raizAux.dato);
        InOrdenRecursivo(raizAux.hijoDer);
    }
    
    public void postOrden(){
        postOrdenRecursivo(raiz);
    }
    
    private void postOrdenRecursivo(ClaseNodo raizAux){
        if(raizAux == null){
            return;
        }
        postOrdenRecursivo(raizAux.hijoIzq);
        postOrdenRecursivo(raizAux.hijoDer);
        System.out.print(" " +raizAux.dato);
        
    }
    
    public void preOrden(){
        preOrdenRecursivo(raiz);
    }
    
    private void preOrdenRecursivo(ClaseNodo raizAux){
        if(raizAux == null){
            return;
        }
        System.out.print(" " +raizAux.dato);
        preOrdenRecursivo(raizAux.hijoIzq);
        preOrdenRecursivo(raizAux.hijoDer);
       
        
    }
    
  
    
    //
}
