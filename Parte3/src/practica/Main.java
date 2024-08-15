/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica;

/**
 *
 * @author jjtiq
 */
public class Main {
     public static void main(String[] args) {
        GestionTareas gestionTareas = new GestionTareas();
        
        // Agregar tareas
        gestionTareas.agregarTarea("Hacer la compra");
        gestionTareas.agregarTarea("Limpiar la casa");
        gestionTareas.agregarTarea("Estudiar para el examen");

        // Mostrar tareas pendientes
        gestionTareas.mostrarTareas();

        // Eliminar una tarea completada
        gestionTareas.eliminarTarea("Limpiar la casa");

        // Mostrar tareas pendientes
        gestionTareas.mostrarTareas();
    }
}
   
