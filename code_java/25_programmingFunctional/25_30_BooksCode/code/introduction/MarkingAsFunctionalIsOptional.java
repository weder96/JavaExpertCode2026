public class MarkingAsFunctionalIsOptional {
  public interface Sample1 {
    boolean test(int input);
  }

  @FunctionalInterface
  public interface Sample2 {
    boolean test(int input);
  }
  
  public static void main(final String[] args) {
    Sample1 sample1 = input -> true;
    Sample2 sample2 = input -> true;
    
    System.out.println(sample1.test(4));
    System.out.println(sample2.test(4));
  }
}
