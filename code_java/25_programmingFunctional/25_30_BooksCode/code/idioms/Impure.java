import java.util.List;

public class Impure {
  private int factor = 2;
  
  public void run() {
    var numbers = List.of(1, 2, 3);
    
    var stream = numbers.stream()
      .map(number -> number * factor);
    
    factor = 0;
    
    stream.forEach(System.out::println);
  }
  
  public static void main(String[] args) {
    new Impure().run();
  }
}
