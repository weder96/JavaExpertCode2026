import java.util.List;
import static java.util.stream.Collectors.toList;
import java.util.stream.Stream;

public class Primes {
  private static int primeAfter(final int number) {
    if(PrimeFinder.isPrime(number + 1)) {
      return number + 1;
    } 

    return primeAfter(number + 1);
  }
  
  public static List<Integer> primes(final int fromNumber, final int count) {
    return Stream.iterate(primeAfter(fromNumber - 1), Primes::primeAfter)
                 .limit(count)
                 .collect(toList());
  }  
  //...
  
  public static void main(final String[] args) {
    System.out.println("10 primes from 1: " + primes(1, 10));
      
    System.out.println("5 primes from 100: " + primes(100, 5));
  }

}
