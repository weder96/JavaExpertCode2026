import java.util.List;

public class EmailAddressesList {
  public static void main(String[] args) {
    List<List<String>> listOfListOfEmailAdddresses = Person.SAMPLE_DATA.stream()
      .map(Person::emailAddresses)
      .toList();
    
    System.out.println(listOfListOfEmailAdddresses);
  }
}
