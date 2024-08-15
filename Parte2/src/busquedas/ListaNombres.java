/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package busquedas;

/**
 *
 * @author jjtiq
 */
import java.util.ArrayList;

public class ListaNombres {
    
     private ArrayList<String> nombres;

    public ListaNombres() {
        nombres = new ArrayList<>();
    }

    public void agregarNombre(String nombre) {
        nombres.add(nombre);
    }

    public void imprimirNombres() {
        for (String nombre : nombres) {
            System.out.println(nombre);
        }
    }

    // 1. Búsqueda de un nombre en la lista
    public void buscarNombre(String nombre) {
        if (nombres.contains(nombre)) {
            System.out.println("El nombre " + nombre + " fue encontrado.");
        } else {
            System.out.println("El nombre " + nombre + " no fue encontrado.");
        }
    }

    // 2. Agregar un nombre si no está en la lista
    public void agregarNombreSiNoExiste(String nombre) {
        if (!nombres.contains(nombre)) {
            nombres.add(nombre);
            System.out.println("El nombre " + nombre + " ha sido agregado.");
        } else {
            System.out.println("El nombre " + nombre + " ya existe en la lista.");
        }
    }

    // 3. Eliminar un nombre de la lista
    public void eliminarNombre(String nombre) {
        if (nombres.remove(nombre)) {
            System.out.println("El nombre " + nombre + " ha sido eliminado.");
        } else {
            System.out.println("El nombre " + nombre + " no se encontró en la lista.");
        }
    
    }
}
