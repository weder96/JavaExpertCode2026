
public class AverageNumberOfEmailAddresses3 {
  public static void main(String[] args) {
    System.out.println("Average number of email addresses: " +
      Person.SAMPLE_DATA.stream()
        .mapToDouble(person -> person.emailAddresses().size())
        .average()
        .orElse(0));
  }
}
