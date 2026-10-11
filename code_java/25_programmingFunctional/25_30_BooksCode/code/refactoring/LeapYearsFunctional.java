import java.time.Year;
import java.util.stream.IntStream;

public class LeapYearsFunctional extends LeapYears {
  public int countFrom1900(int upTo) {
    return (int) IntStream.iterate(
        1900, year -> year <= upTo, year -> year + 4)
      .filter(Year::isLeap)
      .count();
  }
}
