/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.postres;

/**
 *
 * @author 52999
 */
public class Lista {
    private Ingrediente primerNodo; // Primer nodo de la lista

    public Lista() {
        this.primerNodo = null; // Inicializar la lista vacía
    }
    
    // Método para agregar un ingrediente al final de la lista
    public void agregar(String nombre) {
        Ingrediente nuevoNodo = new Ingrediente(nombre);
        if (primerNodo == null) {
            primerNodo = nuevoNodo; 
        } else {
            Ingrediente actual = primerNodo;
            while (actual.siguiente != null) {
                actual = actual.siguiente; // Ir al último nodo
            }
            actual.siguiente = nuevoNodo; // Conectar el último nodo al nuevo
        }
    }
    
    public void imprimir() {
        Ingrediente actual = primerNodo;
        while (actual != null) {
            System.out.print(actual.nombre + " "); // Imprimir el nombre del ingrediente
            actual = actual.siguiente; // Avanzar al siguiente
        }
        System.out.println(); // Nueva línea después de imprimir todos los ingredientes
    }
}


