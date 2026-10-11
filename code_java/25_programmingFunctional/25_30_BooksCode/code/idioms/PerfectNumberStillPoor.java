import java.util.List;
import java.util.stream.LongStream;

public class PerfectNumberStillPoor {
  public static List<Long> perfectNumbersUpTo(long number) {
    return LongStream.range(1, number)
      .filter(i -> LongStream.range(1, i) //Not good
        .filter(j -> i % j == 0)
        .sum() == i)
      .boxed()
      .toList();
  }
  
  public static void main(String[] args) {
    System.out.println(perfectNumbersUpTo(500));
  }
}