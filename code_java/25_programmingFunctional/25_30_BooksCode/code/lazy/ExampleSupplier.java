import java.util.function.Supplier;

public class ExampleSupplier {
  public static void main(String[] args) {
    {
    Supplier<Heavy> supplier = () -> new Heavy();
      System.out.println(supplier.get());
    }

    {
    Supplier<Heavy> supplier = Heavy::new;
      System.out.println(supplier.get());
    }

  }
}
