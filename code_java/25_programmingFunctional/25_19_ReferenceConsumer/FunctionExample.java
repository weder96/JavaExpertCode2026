import java.util.function.Function;

public class FunctionExample {
    static Function<String, String> f1 = name -> name.toLowerCase();
    static Function<String, String> f2 = name -> name.toUpperCase().concat(" Features");

    public static void main(String[] args) {
        System.out.println("Result 1 :"+f1.apply("java11"));
        System.out.println("Result 2 :"+f2.apply("java11"));
        System.out.println("Result 3 :"+f1.andThen(f2).apply("java21"));
        System.out.println("Result 4 :"+f1.compose(f2).apply("java21"));
    }
}
