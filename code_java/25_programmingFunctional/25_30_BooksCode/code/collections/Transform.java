import java.util.ArrayList;
import java.util.List;

public class Transform {
  public static void main(final String[] args) {
  {
    final List<String> uppercaseNames = new ArrayList<>();
    
    for(String name : Folks.friends) {
      uppercaseNames.add(name.toUpperCase());
    }

    System.out.println(uppercaseNames);
  }
  {
    final List<String> uppercaseNames = new ArrayList<>();
    Folks.friends.forEach(name -> uppercaseNames.add(name.toUpperCase())); //BAD IDEA
    System.out.println(uppercaseNames);
  }

/*
      friends.stream()
             .map(name -> name.toUpperCase());
*/

System.out.println("//" + "START:TRANSFORM_OUTPUT");

    Folks.friends.stream()
           .map(name -> name.toUpperCase())
           .forEach(name -> System.out.print(name + " "));     
    System.out.println();

System.out.println("//" + "END:TRANSFORM_OUTPUT");

System.out.println("//" + "START:NUMBER_OUTPUT");

    Folks.friends.stream()
           .map(name -> name.length())
           .forEach(count -> System.out.print(count + " "));

System.out.println();
System.out.println("//" + "END:NUMBER_OUTPUT");

/*
    friends.stream()
           .map(String::toUpperCase);
*/

    Folks.friends.stream()
           .map(String::toUpperCase)
           .forEach(name -> System.out.println(name));
  }
}
