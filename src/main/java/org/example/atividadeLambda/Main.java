package org.example.atividadeLambda;

import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        // RUNNABLE
        Runnable runnable = () -> System.out.println("executando tarefa");
        runnable.run();

        //CONSUMER
        Consumer<String> consumer = (nome) -> System.out.println("Olá " + nome);
        consumer.accept("Camille");

        Consumer<String> consumerMais = (nome) -> System.out.println(nome.toUpperCase());
        consumerMais.accept("flora");

        //SUPPLIER
        Supplier<String> supplier = () -> "Aviso: O sistema está online!";
        System.out.println(supplier.get());

        Supplier<Integer> supplierNumero = () -> new Random().nextInt(100);
        System.out.println(supplierNumero.get());
        System.out.println(supplierNumero.get());

        // PREDICATE
        Predicate<Integer> predicate = (numero) -> numero > 10;
        System.out.println(predicate.test(5));
        System.out.println(predicate.test(15));

        Predicate<String> predicateString = String::isEmpty;
        System.out.println(predicateString.test(""));
        System.out.println(predicateString.test("Java"));

        // FUNCTION
        Function<Integer, String> function = (numero) -> "Nota fiscal nr: " + numero;
        System.out.println(function.apply(1542));

        Function<String, Integer> functionInversa = (texto) -> texto.length();
        System.out.println(functionInversa.apply("Professor"));
    }
}
