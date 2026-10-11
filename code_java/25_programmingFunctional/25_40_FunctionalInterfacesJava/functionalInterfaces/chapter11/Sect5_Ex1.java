import java.util.Optional;
import java.util.Scanner;
import java.util.function.Supplier;

public class Sect5_Ex1 {
    public static void main(String[] args) {
        Supplier<Optional<String>> supplier = () -> {
            System.out.print("Enter a string:");
            return Optional.of((new Scanner(System.in)).nextLine());
        };

        String s = null;
        Optional.ofNullable(s)
                .or(supplier)
                .ifPresent(x -> System.out.println(x));
    }
}