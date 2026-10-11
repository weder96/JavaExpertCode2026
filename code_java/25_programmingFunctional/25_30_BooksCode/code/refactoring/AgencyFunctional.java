import java.util.Set;

public class AgencyFunctional extends Agency {
  public boolean isChaperoneRequired(Set<Person> people) {
    return people.size() > 0 &&
      people.stream()
        .noneMatch(person -> person.age() >= 18);
  }
}
