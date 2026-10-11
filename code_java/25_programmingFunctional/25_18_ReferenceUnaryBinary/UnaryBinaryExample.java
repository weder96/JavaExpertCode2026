package br.com.wsousa.UaaryBinary;

import java.util.Comparator;
import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class UnaryBinaryExample {
    static UnaryOperator<String> uo1 = name -> name.toUpperCase();
    static UnaryOperator<Integer> uo2 = a -> (a+30);
    static Comparator<Integer> comp = (a, b) -> a.compareTo(b);

    public static void main(String[] args) {
        System.out.println("Result 1: "+ uo1.apply("Java11"));
        System.out.println("Result 2: "+ uo2.apply(20));

        BinaryOperator<Integer> bin01 = BinaryOperator.maxBy((a,b) -> (a>b) ? 1 : (a==b) ? 0 : -1);
        System.out.println("Bynary Operator Max By 1: "+bin01.apply(192, 150));

        BinaryOperator<Integer> bin02 = BinaryOperator.maxBy(comp);
        System.out.println("Bynary Operator Max By 2: "+bin02.apply(192, 150));

        BinaryOperator<Integer> bin03 = BinaryOperator.minBy(comp);
        System.out.println("Bynary Operator Min By 3: "+bin03.apply(192, 150));
    }
}
