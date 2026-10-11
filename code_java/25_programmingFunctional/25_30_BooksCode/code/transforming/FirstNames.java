import java.util.List;

public class FirstNames {
  public static void main(String[] args) {
    List<String> firstNames = Person.SAMPLE_DATA.stream()
      .map(Person::firstName)
      .toList();
    
    System.out.println(firstNames);
  }
}
