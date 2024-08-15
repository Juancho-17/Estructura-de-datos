/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package busquedas;

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

        // Buscar un nombre
        lista.buscarNombre("Carlos");

        // Agregar un nombre si no existe
        lista.agregarNombreSiNoExiste("Sofía");

        // Imprimir la lista para verificar
        lista.imprimirNombres();

        // Eliminar un nombre
        lista.eliminarNombre("Ana");

        // Imprimir la lista para verificar
        lista.imprimirNombres();
    }
}
    
