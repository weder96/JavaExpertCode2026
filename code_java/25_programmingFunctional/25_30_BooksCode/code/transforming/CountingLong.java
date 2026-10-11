import java.util.Map;
import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

public class CountingLong {
  public static void main(String[] args) {
    Map<String, Long> namesCount =
      Person.SAMPLE_DATA.stream()
        .collect(groupingBy(Person::firstName, counting()));

    System.out.println(namesCount);
  }
}
