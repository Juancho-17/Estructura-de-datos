/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista;

/**
 *
 * @author jjtiq
 */
class Nodo {

    int valor;
    Nodo siguiente;

    public Nodo(int valor) {
        this.valor = valor;
        this.siguiente = null;
    }
}

class ListaEnlazada {

    private Nodo cabeza;

    public ListaEnlazada() {
        this.cabeza = null;
    }

    // Método para insertar un nodo al inicio de la lista
    public void insertarAlInicio(int valor) {
        Nodo nuevoNodo = new Nodo(valor);
        nuevoNodo.siguiente = cabeza;
        cabeza = nuevoNodo;
    }

    // Método para recorrer e imprimir la lista
    public void imprimirLista() {
        Nodo actual = cabeza;
        while (actual != null) {
            System.out.print(actual.valor + " -> ");
            actual = actual.siguiente;
        }
        System.out.println("null");
    }

    // Método para eliminar un nodo por valor
    public void eliminarPorValor(int valor) {
        if (cabeza == null) {
            System.out.println("La lista está vacía.");
            return;
        }

        if (cabeza.valor == valor) {
            cabeza = cabeza.siguiente;
            return;
        }

        Nodo actual = cabeza;
        while (actual.siguiente != null && actual.siguiente.valor != valor) {
            actual = actual.siguiente;
        }

        if (actual.siguiente != null) {
            actual.siguiente = actual.siguiente.siguiente;
        } else {
            System.out.println("El valor " + valor + " no se encuentra en la lista.");
        }
    }

    // Método para buscar un nodo por su valor
    public boolean buscar(int valor) {
        Nodo actual = cabeza;
        while (actual != null) {
            if (actual.valor == valor) {
                return true;
            }
            actual = actual.siguiente;
        }
        return false;
    }

    // Método para insertar un nodo en una posición específica
    public void insertarEnPosicion(int valor, int posicion) {
        if (posicion < 0) {
            System.out.println("Posición inválida.");
            return;
        }

        Nodo nuevoNodo = new Nodo(valor);

        // Insertar en la cabeza si la posición es 0
        if (posicion == 0) {
            nuevoNodo.siguiente = cabeza;
            cabeza = nuevoNodo;
            return;
        }

        Nodo actual = cabeza;
        int contador = 0;

        // Buscar la posición donde insertar
        while (actual != null && contador < posicion - 1) {
            actual = actual.siguiente;
            contador++;
        }

        // Insertar en la posición encontrada
        if (actual != null) {
            nuevoNodo.siguiente = actual.siguiente;
            actual.siguiente = nuevoNodo;
        } else {
            System.out.println("La posición es mayor que el tamaño de la lista.");
        }
    }

    public static void main(String[] args) {
        ListaEnlazada lista = new ListaEnlazada();

        // Ejercicio Práctico 1: Insertar 5 elementos e imprimir la lista
        lista.insertarAlInicio(5);
        lista.insertarAlInicio(4);
        lista.insertarAlInicio(3);
        lista.insertarAlInicio(2);
        lista.insertarAlInicio(1);
        System.out.println("Lista después de insertar 5 elementos:");
        lista.imprimirLista();

        // Ejercicio Práctico 2: Eliminar un nodo y verificar la lista
        lista.eliminarPorValor(3);
        System.out.println("Lista después de eliminar el valor 3:");
        lista.imprimirLista();

        // Ejercicio Práctico 3: Buscar un valor en la lista
        int valorBuscado = 4;
        if (lista.buscar(valorBuscado)) {
            System.out.println("El valor " + valorBuscado + " se encuentra en la lista.");
        } else {
            System.out.println("El valor " + valorBuscado + " no se encuentra en la lista.");
        }

        // Ejercicio Avanzado: Insertar en posiciones específicas y verificar
        lista.insertarEnPosicion(10, 0);
        lista.insertarEnPosicion(20, 2);
        lista.insertarEnPosicion(30, 10);
        System.out.println("Lista después de inserciones en posiciones específicas:");
        lista.imprimirLista();
    }
}

