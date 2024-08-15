/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package operaciones;

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

    // Método para agregar nombres a la lista
    public void agregarNombre(String nombre) {
        nombres.add(nombre);
    }

    // 2. Método para imprimir todos los nombres en la lista
    public void imprimirNombres() {
        for (String nombre : nombres) {
            System.out.println(nombre);
        }
    
    }
}
