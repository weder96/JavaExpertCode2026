package br.com.wsousa.consumer;

import java.util.function.BiConsumer;

public class BiConsumerExample {
    public static void main(String[] args) {
        BiConsumer<Integer, Integer> con1 = (a, b) -> {System.out.println("Add: "+(a+b));};
        BiConsumer<Integer, Integer> con2 = (a, b) -> {System.out.println("Mult: "+(a*b));};
        BiConsumer<Integer, Integer> con3 = (a, b) -> {System.out.println("sUB: "+(b-a));};

        con1.andThen(con2).andThen(con3).accept(10,20);

    }
}
