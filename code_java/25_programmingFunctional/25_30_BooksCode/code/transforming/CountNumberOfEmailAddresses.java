import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.summingInt;

public class CountNumberOfEmailAddresses {
  public static void main(String[] args) {
    var namesAndEmailAddressesCount =
      Person.SAMPLE_DATA.stream()
        .collect(groupingBy(
          Person::lastName,
          summingInt(person -> person.emailAddresses().size())));

    System.out.println(namesAndEmailAddressesCount);
  }
}
