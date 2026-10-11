import static java.util.stream.Collectors.*;

public class AllMatch {
  public static void main(String[] args) {
    System.out.println("Everyone has at least one email address: " +
      SAMPLE_DATA.stream()
        .allMatch(person -> person.emailAddresses().size() > 0));

    System.out.println("Everyone has zero or more email address: " +
      SAMPLE_DATA.stream()
        .allMatch(person -> person.emailAddresses().size() >= 0));
  }
}
