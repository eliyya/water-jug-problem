package com.eli;

import java.io.IOException;
import java.util.ArrayList;

/**
 * Punto de entrada de la aplicación que resuelve el problema de los jarros
 * (jarras) de agua usando búsqueda en anchura (BFS).
 * <p>
 * El código construye un árbol de estados a partir del estado inicial y
 * expande niveles sucesivos hasta encontrar el estado objetivo. Al
 * finalizar, escribe una representación JSON del árbol en `tree.json`.
 */
public class App {
    /**
     * Ejecuta la búsqueda en anchura para encontrar el estado objetivo y
     * guarda el árbol generado en `tree.json`.
     *
     * @param args argumentos de línea de comandos (no usados)
     * @throws IOException si ocurre un error al escribir el archivo JSON
     */
    public static void main(String[] args) throws IOException {
        IO.println("Ingresa el estado inicial de...");
        var sx = Validations.validateBote(IO.readln("Bote x (0-3):"), 3);
        var sy = Validations.validateBote(IO.readln("Bote y (0-4):"), 4);
        var tree = new Node(sx, sy);

        var childrens = new ArrayList<Node>();
        childrens.addAll(tree.generateChildrens());
        
        IO.println(tree);
        for (var child : childrens) {
            IO.println(child);
        }

    }
}
