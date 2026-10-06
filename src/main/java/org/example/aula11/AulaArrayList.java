package org.example.aula11;

import java.util.ArrayList;
import java.util.List;

public class AulaArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();
        //System.out.println(lista.isEmpty());
        lista.add(1);
        lista.add(10);
        lista.add(100);
        lista.add(1000);

        lista.add(2,77);
        System.out.println(lista);

        lista.addAll(List.of(1,2,35,6,765,234,9));

        System.out.println(lista);
        lista.remove(1);
        lista.remove(3);
        System.out.println(lista);
        System.out.println(lista.get(2));

        lista.set(1,98);
        System.out.println(lista);
        System.out.println(lista.size());

        System.out.println(lista.contains(98));
        System.out.println(lista.indexOf(98));
        System.out.println(lista.isEmpty());

    }
}
