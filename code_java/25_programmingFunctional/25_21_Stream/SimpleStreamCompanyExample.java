import java.util.stream.Stream;

public class SimpleStreamCompanyExample {

	public static void main(String[] args) {
		Stream<Integer> s1 = Stream.of(1,2,3,4,5,6);
		s1.forEach(p-> System.out.printf("%d ",p));
		System.out.println(" ");
		System.out.println("====================================");
		Stream<Integer> s2 = Stream.of(new Integer[] {1,2,3,4,5,6,});
		s2.forEach(p-> System.out.printf("%d ",p));
		System.out.println(" ");
	}
}
