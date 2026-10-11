import java.util.function.Predicate;


public class PickElementsMultipleCollection {
  public static void main(final String[] args) {
    {
    final long countFriendsStartN =  Folks.friends.stream()
                                                  .filter(name -> name.startsWith("N"))
                                                  .count();

    final long countEditorsStartN = 
      Folks.editors.stream()
             .filter(name -> name.startsWith("N"))
             .count();

    final long countComradesStartN = 
      Folks.comrades.stream()
                    .filter(name -> name.startsWith("N"))
                    .count();

    System.out.println(countFriendsStartN);
    System.out.println(countComradesStartN);
    System.out.println(countEditorsStartN);
}

{
    final Predicate<String> startsWithN = name -> name.startsWith("N");

    final long countFriendsStartN = 
      Folks.friends.stream()
                   .filter(startsWithN)
                   .count();

    final long countEditorsStartN = 
      Folks.editors.stream()
                   .filter(startsWithN)
                   .count();

    final long countComradesStartN = 
      Folks.comrades.stream()
                    .filter(startsWithN)
                    .count();

    System.out.println(countFriendsStartN);
    System.out.println(countComradesStartN);
    System.out.println(countEditorsStartN);
}
  }
}
