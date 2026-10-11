import java.util.stream.Stream;

public class Sect6_Ex1 {
  public static void main(String[] args) {
    Stream.of("Kyle", "Jaquiline", "Jimmy")
        .min((x, y) -> // Stream<String>
        Sect1_Ex1.removeVowels(x).compareTo(Sect1_Ex1.removeVowels(y)))
        .ifPresent(x -> System.out.println(x)); // Optional<String>
  }
}