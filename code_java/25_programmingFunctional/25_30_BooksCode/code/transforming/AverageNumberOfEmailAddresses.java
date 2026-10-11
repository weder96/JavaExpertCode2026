import java.util.List;

public class AverageNumberOfEmailAddresses {
  public static void main(String[] args) {
    System.out.println("Average number of email addresses: " +
      Person.SAMPLE_DATA.stream()
        .map(Person::emailAddresses)
        .mapToDouble(List::size)
        .sum()/Person.SAMPLE_DATA.size() * 1.0);
  }
}
