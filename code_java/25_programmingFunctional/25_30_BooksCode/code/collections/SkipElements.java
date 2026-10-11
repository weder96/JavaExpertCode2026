
public class SkipElements {
  public static void main(final String[] args) {
System.out.println("//" + "START:SKIP_OUTPUT");
    Folks.friends.stream()
           .skip(4)
           .map(String::toUpperCase)
           .forEach(System.out::println);
System.out.println("//" + "END:SKIP_OUTPUT");

System.out.println("//" + "START:DROP_OUTPUT");
    Folks.friends.stream()
           .dropWhile(name -> name.length() > 4)
           .map(String::toUpperCase)
           .forEach(System.out::println);
System.out.println("//" + "END:DROP_OUTPUT");
  }
}
