import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class RodCutter {
  private final List<Integer> prices;
  public RodCutter(final List<Integer> pricesForLengths) {
    prices = pricesForLengths;
  }
  
  //...
  
  public int maxProfit(final int length) {
    int priceAtLength = length <= prices.size() ? prices.get(length - 1) : 0;

    return Math.max(priceAtLength,
      IntStream.range(1, length)
               .map(i -> maxProfit(i) + maxProfit(length - i))
               .max()
               .orElse(0));
  }

  public static void main(final String[] args) {
    final List<Integer> priceValues =
      Arrays.asList(2, 1, 1, 2, 2, 2, 1, 8, 9, 15);

    final RodCutter rodCutter = new RodCutter(priceValues);

    System.out.println(rodCutter.maxProfit(5));
    System.out.println(rodCutter.maxProfit(22));
  }
}
