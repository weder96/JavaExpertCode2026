package br.com.wsousa.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamFilterCompanyExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Sam","Anderson","Peter","Nancy");

        Stream<String> allNames = names.stream();
        Stream<String> updatesList = allNames.filter(s -> s.length() > 3);
        updatesList.forEach(System.out :: println);
        System.out.println("=============================");
        names.stream().filter(s-> s.length()>3).filter(s2-> s2.startsWith("N")).collect(Collectors.toList()).forEach(System.out :: println);
    }

}
