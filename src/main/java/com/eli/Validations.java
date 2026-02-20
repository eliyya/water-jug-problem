package com.eli;

public class Validations {
    public static void validateBote(Object read, int max) {
        int state = 0;
        if (read instanceof String str) {
            try {
                state = Integer.parseInt(str);
            } catch (Exception e) {
                IO.print("Tiene que ser un numero entero");
                System.exit(1);
            }
        } else {
            IO.print("Tiene que ser un numero entero");
            System.exit(1);
        }
        if (state < 0) {
            IO.print("No puede ser menor que 0");
            System.exit(1);
        }
        if (state > max) {
            IO.print("No puede ser mayor que "+max);
            System.exit(1);
        }
    }
}
