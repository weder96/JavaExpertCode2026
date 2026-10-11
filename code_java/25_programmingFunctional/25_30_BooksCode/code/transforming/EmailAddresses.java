import java.util.List;

public class EmailAddresses {
  public static void main(String[] args) {
    List<String> emailAddresses = Person.SAMPLE_DATA.stream()
      .flatMap(person -> person.emailAddresses().stream())
      .toList();
    
    System.out.println(emailAddresses);
  }
}
