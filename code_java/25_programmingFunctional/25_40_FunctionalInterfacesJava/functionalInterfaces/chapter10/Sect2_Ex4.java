import java.util.Comparator;

public class Sect2_Ex4 {
    public static void main(String[] args) {
        Comparator<String> byConsonants = (x, y) -> removeVowels(x).compareTo(removeVowels(y));

        System.out.println(Comparator.nullsLast(byConsonants)
                .compare("Larry", null));
    }
}