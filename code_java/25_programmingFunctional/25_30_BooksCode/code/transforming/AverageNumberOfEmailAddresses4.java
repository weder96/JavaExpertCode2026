import static java.util.stream.Collectors.averagingDouble;

public class AverageNumberOfEmailAddresses4 {
  public static void main(String[] args) {
    System.out.println("Average number of email addresses: " +
      Person.SAMPLE_DATA.stream()
        .collect(averagingDouble(person -> person.emailAddresses().size())));
  }
}
