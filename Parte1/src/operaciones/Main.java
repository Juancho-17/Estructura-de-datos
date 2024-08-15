/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package operaciones;

/**
 *
 * @author jjtiq
 */
public class Main {
    public static void main(String[] args) {
        ListaNombres lista = new ListaNombres();
        
        
        lista.agregarNombre("Juan");
        lista.agregarNombre("María");
        lista.agregarNombre("Carlos");
        lista.agregarNombre("Ana");
        lista.agregarNombre("Luis");
        
        // Imprimir todos los nombres
        lista.imprimirNombres();
    }
}

