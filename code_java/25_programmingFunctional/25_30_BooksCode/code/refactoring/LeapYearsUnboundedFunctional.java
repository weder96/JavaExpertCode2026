import java.time.Year;
import java.util.stream.IntStream;
import java.util.function.Predicate;

public class LeapYearsUnboundedFunctional extends LeapYearsUnbounded {
  public int countFrom1900(Continue shouldContinue) {
    Predicate<Integer> check = year -> shouldContinue.check(year);
    
    return countFrom1900(check);
  }
  
  public int countFrom1900(Predicate<Integer> shouldContinue) {
    return (int) IntStream.iterate(1900, year -> year + 4)
      .takeWhile(shouldContinue::test)
      .filter(Year::isLeap)
      .count();
  }
}
