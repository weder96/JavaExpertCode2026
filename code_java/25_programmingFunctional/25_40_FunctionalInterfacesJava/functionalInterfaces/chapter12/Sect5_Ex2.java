import java.util.stream.Stream;

public class Sect5_Ex2 {
    public static void main(String[] args) {
        Stream.of("Kyle", "Jaquiline", "Jimmy")
                .sorted((x, y) -> Sect1_Ex1.removeVowels(x).compareTo(Sect1_Ex1.removeVowels(y)))
                .forEach(x -> System.out.println(x));
    }
}