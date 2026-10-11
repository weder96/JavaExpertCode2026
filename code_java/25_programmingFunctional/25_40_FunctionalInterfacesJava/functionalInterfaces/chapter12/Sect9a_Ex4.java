import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Sect9a_Ex4 {
    public static void main(String[] args) {
        String s = Stream.of("RED", "GREEN", "BLUE") // Stream<String>
                .collect(Collectors.joining()); // String

        System.out.println(s);
    }
}