
public class TakeElements {
  public static void main(final String[] args) {
System.out.println("//" + "START:LIMIT_OUTPUT");
    Folks.friends.stream()
           .limit(3)
           .map(String::toUpperCase)
           .forEach(System.out::println);
System.out.println("//" + "END:LIMIT_OUTPUT");

System.out.println("//" + "START:TAKE_OUTPUT");
    Folks.friends.stream()
           .takeWhile(name -> name.length() > 4)
           .map(String::toUpperCase)
           .forEach(System.out::println);
System.out.println("//" + "END:TAKE_OUTPUT");
  }
}
