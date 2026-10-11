
public class AnyMatch {
  public static void main(String[] args) {
    System.out.println("Anyone has email address: " +
     Person.SAMPLE_DATA.stream()
        .anyMatch(person -> person.emailAddresses().size() > 0));

    System.out.println("Anyone has more than 10 email address: " +
      Person.SAMPLE_DATA.stream()
        .anyMatch(person -> person.emailAddresses().size() >= 10));
  }
}
