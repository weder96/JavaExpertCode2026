import java.util.ArrayList;
import java.util.List;

public class NaivePrimes {
  public static List<Integer> concat(
  final int number, final List<Integer> numbers) {
    
    final List<Integer> values = new ArrayList<>();
    values.add(number);
    values.addAll(numbers);
    return values;
  }

  //don't try this at the office
  public static List<Integer> primes(final int number) {
    if(PrimeFinder.isPrime(number)) {
      return concat(number, primes(number + 1));
    }
    
    return primes(number + 1);
  }
  
  public static void main(final String[] args) {
    try {
      primes(1);
    } catch(StackOverflowError ex) {
      System.out.println(ex);
    }
  }
}
