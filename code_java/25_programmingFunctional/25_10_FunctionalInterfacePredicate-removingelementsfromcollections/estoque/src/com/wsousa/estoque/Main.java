import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {
        var products = new ArrayList<Product>();
        products.add(new Product("Soap", new BigDecimal("9.9"), 11));
        products.add(new Product("Milk", new BigDecimal("3.4"), 22));
        products.add(new Product("Pasta", new BigDecimal("9.3"), 0));
        products.add(new Product("Beer", new BigDecimal("5.8"), 14));
        products.add(new Product("Rice", new BigDecimal("15.9"), 0));
        products.add(new Product("Chocolate", new BigDecimal("25.1"), 10, Product.Status.INACTIVE));

//      Iterator<Product> productsIterator = products.iterator();
//      while (productsIterator.hasNext()) {
//          Product product = productsIterator.next();
//          if (product.getQuantity() < 1) {
//              productsIterator.remove();
//          }
//      }

        products.removeIf(product -> product.getQuantity() < 1);

//      Predicate<Product> outOfStockPredicate = product -> product.getQuantity() < 1;
//      Predicate<Product> inactivePredicate = product -> Product.Status.INACTIVE.equals(product.getStatus());

//      products.removeIf(outOfStockPredicate.or(inactivePredicate));
//      products.removeIf(outOfStockPredicate.negate());
//      products.removeIf(Predicate.not(product -> product.getQuantity() < 1));
//      products.removeIf(product -> product.getQuantity() > 0);

        for (Product product : products) {
            System.out.println(product);
        }
    }
    
}