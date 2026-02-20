package com.eli;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        IO.println("Ingresa el estado inicial de...");
        var rl1 = IO.readln("Bote a (0-3):");
        Validations.validateBote(rl1,3);
        var rl2 = IO.readln("Bote b (0-4):");
        Validations.validateBote(rl2,4);
        IO.println("Estado inicial (a,b) => ("+rl1+","+rl2+")");
    }
}
