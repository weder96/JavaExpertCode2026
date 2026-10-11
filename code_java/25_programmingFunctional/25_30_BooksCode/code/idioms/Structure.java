import java.util.List;

public class Structure {
  public static void printDetailsPoor(List<String> names) {
    names.stream().filter(name -> name.length() == 4).map(String::toUpperCase).forEach(System.out::println);
    /*
    //Please don't do this
    names.stream().filter(name -> name.length() == 4).map(String::toUpperCase)...
    */
  }

  public static void printDetailsFluent(List<String> names) {
    names.stream()
      .filter(name -> name.length() == 4)            
      .map(String::toUpperCase)
      .forEach(System.out::println);    
  }
  
  public static void main(String[] args) {
    var names = List.of("Dory", "Gill", "Bruce", "Nemo", "Darla", "Marlin", "Jacques");
    
    printDetailsPoor(names);
    printDetailsFluent(names);
  }
}