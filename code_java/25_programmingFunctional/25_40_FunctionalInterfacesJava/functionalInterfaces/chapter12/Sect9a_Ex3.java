import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Sect9a_Ex3 {
    public static void main(String[] args) {
        Stream.of(1, 2, 3, 4, 5) // Stream<Integer>
                .collect(Collectors.reducing((x, y) -> x *= y)) // Optional<Integer>
                .ifPresent(x -> System.out.println(x)); // Prints 120
    }
}