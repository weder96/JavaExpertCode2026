import java.util.Map;
import static java.util.stream.Collectors.collectingAndThen;
import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;


public class CountingInt {
  public static void main(String[] args) {
    Map<String, Integer> namesCount =
      Person.SAMPLE_DATA.stream()
        .collect(groupingBy(
          Person::firstName, collectingAndThen(counting(), Long::intValue)));

    System.out.println(namesCount);
  }
}
