import java.util.Arrays;
import java.util.function.IntBinaryOperator;

public class Sect4_Ex1 {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 4, 3 };
        IntBinaryOperator op = (x, y) -> x * y;

        Arrays.parallelPrefix(arr, op);
        for (int i : arr)
            System.out.println(i);
    }
}
