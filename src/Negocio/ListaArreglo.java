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
public class ListaArreglo {

    //Atributos
    public static final int MAX = 50;
    public int vector[];
    public int cant;

    //Constructor
    public ListaArreglo() {
        vector = new int[50];
        this.cant = 0;
    }

    public int obtenerDato(int pos) {
        return this.vector[pos];
    }

    public int cantidadDeDatos() {
        return this.cant;
    }

    public void insertarFinal(int pos, int dato) {
        
        this.vector[pos] = dato;
        this.cant++;

    }

    //Procedimiento
    public void ejercicio7(ListaArreglo L2, ListaArreglo L3) {
        boolean bandera = true;
        int contadorL2 = 0;
        int contadorL3 = 0;

        while (contadorL2 < L2.cantidadDeDatos() && contadorL3 < L3.cantidadDeDatos()) {
            if (bandera == true) {
                //Saca de L2
                insertarFinal(cant, L2.obtenerDato(contadorL2));
                contadorL2++;
            } else {
                //Saca de L3
                insertarFinal(cant, L3.obtenerDato(contadorL3));
                contadorL3++;
            }
            bandera = !bandera;
        }

        //L2 es vacio
        while (contadorL3 < L3.cantidadDeDatos()) {
            insertarFinal(cant, L3.obtenerDato(contadorL3));
            contadorL3++;
        }

        //L3 es vacio
        while (contadorL2 < L2.cantidadDeDatos()) {
            insertarFinal(cant, L2.obtenerDato(contadorL2));
            contadorL2++;

        }

    }

    public String toString() { //Muestra los datos de mi arrgelo
        String cadena = "[ ";
        for (int i = 0; i < this.cant; i++) {
            cadena = cadena + vector[i] + " ";
        }
        return cadena + "]";
    }

}
