import java.util.function.Predicate;
public class PredicateExample {
  public static void main(String[] args) {
	Predicate<Integer> lessThan = a -> (a <= 18);
	Predicate<Integer> greaterThan = a -> (a >= 19);
	Predicate<Integer> equalTo = a -> (a == 0);

	boolean result = lessThan.test(18);
	System.out.println("Result :"+result);
	
	System.out.println("Greater Than :"+greaterThan.test(12));
	System.out.println("Less Than :"+lessThan.test(60));
	System.out.println("Equal :"+equalTo.test(0));
  }
}
