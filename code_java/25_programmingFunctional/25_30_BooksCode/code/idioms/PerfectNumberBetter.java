import java.util.List;
import java.util.stream.LongStream;

public class PerfectNumberBetter {
  public static long sumOfFactors(long number) {
    return LongStream.range(1, number)
      .filter(i -> number % i == 0)
      .sum();
  }
  public static List<Long> perfectNumbersUpTo(long number) {
    return LongStream.rangeClosed(1, number)
      .filter(i -> sumOfFactors(i) == i)
      .boxed()
      .toList();
  }
  
  public static void main(String[] args) {
    System.out.println(perfectNumbersUpTo(500));
  }
}