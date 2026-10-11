import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.maxBy;
import static java.util.stream.Collectors.minBy;
import static java.util.stream.Collectors.teeing;


public class Teeing {
  public static void main(String[] args) {
    record MinMax(String least, String most) {}
						
    var leastAndMostEmailAddressPerson =
      Person.SAMPLE_DATA.stream()
        .collect(
          teeing(
            minBy(comparing(person -> person.emailAddresses().size())),
            maxBy(comparing(person -> person.emailAddresses().size())),
            (min, max) -> 
              new MinMax(min.map(Person::fullName).orElse(""),
                max.map(Person::fullName).orElse(""))));
      
    System.out.println(leastAndMostEmailAddressPerson);
  }
}
