import java.util.ArrayList;
import java.util.function.Consumer;

public class DemoForEach {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("String1");
        strings.add("String2");
        strings.add("String3");

        // 1. Utilizando uma classe anônima que implementa Consumer
        strings.forEach(new Consumer<String>() {
            @Override
            public void accept(final String str) {
                System.out.println(str);
            }
        });

        // 2. Utilizando uma expressão Lambda
        strings.forEach((str) -> System.out.println(str));

        // 3. Utilizando referência a método (Method Reference)
        strings.forEach(System.out::println);
    }
}