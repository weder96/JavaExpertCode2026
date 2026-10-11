import static java.util.stream.Collectors.filtering;
import static java.util.stream.Collectors.flatMapping;
import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.toList;

public class Filtering {
  public static void main(String[] args) {
    var lastNamesAndEmailAddressesFiltered =
      Person.SAMPLE_DATA.stream()
        .collect(
          groupingBy(Person::lastName, 
            flatMapping(person -> person.emailAddresses().stream(),
              filtering(address -> address.endsWith(".com"), toList()))));

    System.out.println(lastNamesAndEmailAddressesFiltered);
  }
}
