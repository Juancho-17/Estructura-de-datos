/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica;

import java.util.ArrayList;

/**
 *
 * @author jjtiq
 */
public class GestionTareas {
    
    private ArrayList<String> tareas;

    public GestionTareas() {
        tareas = new ArrayList<>();
    }

    // Agregar una tarea
    public void agregarTarea(String tarea) {
        tareas.add(tarea);
        System.out.println("Tarea \"" + tarea + "\" agregada.");
    }

    // Eliminar una tarea completada
    public void eliminarTarea(String tarea) {
        if (tareas.remove(tarea)) {
            System.out.println("Tarea \"" + tarea + "\" eliminada.");
        } else {
            System.out.println("Tarea \"" + tarea + "\" no encontrada.");
        }
    }

    // Mostrar todas las tareas pendientes
    public void mostrarTareas() {
        if (tareas.isEmpty()) {
            System.out.println("No hay tareas pendientes.");
        } else {
            System.out.println("Tareas pendientes:");
            for (String tarea : tareas) {
                System.out.println("- " + tarea);
            }
        }
    }
    
}
