package org.example;

public class OperadoresRelacionais {
    public static void main(String[] args) {
        int a = 10;
        int b = 3;
        System.out.println("a = " + a + " é maior que b = " + b + "? " + (a > b));
        System.out.println("a == b " + (a == b));

        a = 3;
        b = 10;
        System.out.println("a = " + a + " é menor que b = " + b + "? " + (a < b));
        System.out.println("a == b " + (a == b));

        a = 5;
        b = 5;
        System.out.println("a = " + a + " é igual a b = " + b + "? "+ (a == b));

        boolean chovendo = true;
        System.out.println(!chovendo);
    }
}
