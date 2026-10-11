import static java.util.stream.Collectors.summarizingDouble;

public class Statistics {
  public static void main(String[] args) {
    var statistics = Person.SAMPLE_DATA.stream()
      .collect(
        summarizingDouble(person -> person.emailAddresses().size()));
    
    System.out.println("Number of people: " + statistics.getCount());
    System.out.println(
      "Number of email addresses: " + statistics.getSum());
    System.out.println(
      "Average number of email addresses: " + statistics.getAverage());
    System.out.println(
      "Max number of email addresses: " + statistics.getMax());
    System.out.println(
      "Min number of email addresses: " + statistics.getMin());
  }
}
