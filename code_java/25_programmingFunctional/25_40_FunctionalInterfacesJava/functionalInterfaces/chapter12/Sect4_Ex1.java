import java.util.Arrays;
import java.util.List;

public class Sect4_Ex1 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("RED", "GREEN");

        list.stream()
                .filter(x -> x.equals("GREEN"))
                .forEach(x -> System.out.println(x));
    }
}
