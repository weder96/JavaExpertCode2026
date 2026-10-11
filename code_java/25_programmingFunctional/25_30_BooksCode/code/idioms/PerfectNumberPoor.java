import java.util.List;
import java.util.stream.LongStream;

public class PerfectNumberPoor {
  public static List<Long> perfectNumbersUpTo(long number) {
    return LongStream.rangeClosed(1, number)
      .filter(i -> { //Bad Code, don't do this
        long factor = 0;

        for(int j = 1; j < i; j++) {
          if(i % j == 0) {
            factor += j;
          }
        }

        return factor == i;
      })
      .boxed()
      .toList();
  }
  
  public static void main(String[] args) {
    System.out.println(perfectNumbersUpTo(500));
  }
}