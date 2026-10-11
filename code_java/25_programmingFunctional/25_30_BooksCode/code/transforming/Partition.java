/***
 * Excerpted from "Functional Programming in Java, Second Edition",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material,
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose.
 * Visit https://pragprog.com/titles/vsjava2e for more book information.
***/
package fpij;

import java.util.Map;
import java.util.List;
import static java.util.stream.Collectors.*;
import static fpij.Person.SAMPLE_DATA;

public class Partition {
  public static void main(String[] args) {
    Map<Boolean, List<Person>> thoseWithAndWithoutMultipleEmails =
      SAMPLE_DATA.stream()
        .collect(partitioningBy(person -> person.emailAddresses().size() > 1));
    
    System.out.println("Number of people with at most one email address: " +
      thoseWithAndWithoutMultipleEmails.get(false).size());

    System.out.println("Number of people with multiple email addresses: " +
      thoseWithAndWithoutMultipleEmails.get(true).size());
  }
}
