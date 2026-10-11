import java.util.List;

public class AverageNumberOfEmailAddresses2 {
  public static void main(String[] args) {
    System.out.println("Average number of email addresses: " +
      Person.SAMPLE_DATA.stream()
        .map(Person::emailAddresses)
        .mapToDouble(List::size)
        .average()
        .orElse(0));
  }
}
