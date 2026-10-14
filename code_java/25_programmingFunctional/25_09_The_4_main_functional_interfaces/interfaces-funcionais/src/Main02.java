import java.util.function.IntConsumer;
import java.util.function.IntFunction;
import java.util.function.IntPredicate;
import java.util.function.IntSupplier;

public class Main02 {

    public static void main(String[] args) {
        IntPredicate predicate = num -> num > 10;
        IntFunction<String> function = num -> "Number: " + num;
        IntSupplier supplier = () -> 10;
        IntConsumer consumer = num -> System.out.println("Number: " + num);
    }

}