import java.util.Random;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public class StreamFactoryMethodExample {
 static UnaryOperator<Integer> add = x -> x + 5;
   public static void main(String[] args) {
	Stream<Integer> s1 = Stream.iterate(0, add).limit(5);
	s1.forEach(i -> System.out.format("%d , ", i));
	System.out.println("");

	Stream<Double> s2 = Stream.generate(Math::random).limit(5);
	s2.forEach(i -> System.out.format("%f , ", i));
	System.out.println("");

	Stream.generate(new Random() :: nextInt).limit(10).forEach(i -> System.out.format("%d , ", i));
	System.out.println("");

    Stream<String> s3 = Stream.of("One","Two","Three","Four");
	s3.forEach(s -> System.out.format("%s - ", s));
 }
}
