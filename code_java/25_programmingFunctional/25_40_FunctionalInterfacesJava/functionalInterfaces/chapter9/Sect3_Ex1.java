import java.util.Arrays;
import java.util.List;
import java.util.function.UnaryOperator;

public class Sect3_Ex1 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(16, 12, 8, 4);
        UnaryOperator<Integer> div4 = x -> x / 4;

        list.replaceAll(div4);
        list.forEach(x -> System.out.println(x));
    }
}
