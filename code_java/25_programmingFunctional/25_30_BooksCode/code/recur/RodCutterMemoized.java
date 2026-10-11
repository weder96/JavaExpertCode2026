import java.util.List;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.function.Function;

public class RodCutterMemoized {
  private final List<Integer> prices;

  public RodCutterMemoized(final List<Integer> pricesForLengths) {
    prices = pricesForLengths;
  }

  public int maxProfit(final int length) {
    return callMemoized(this::computeMaxProfit, length);
  }
  
  private int computeMaxProfit(
    Function<Integer, Integer> memoizedFunction, int length) {
      
    int priceAtLength = length <= prices.size() ? prices.get(length - 1) : 0;

    return Math.max(priceAtLength, IntStream.range(1, length)
      .map(i -> memoizedFunction.apply(i) + memoizedFunction.apply(length - i))
      .max()
      .orElse(0));
  }  
  
  public static void main(final String[] args) {
    final List<Integer> priceValues =
      Arrays.asList(2, 1, 1, 2, 2, 2, 1, 8, 9, 15);
    
    final RodCutterMemoized rodCutterMomoized
      = new RodCutterMemoized(priceValues);
    
    System.out.println(rodCutterMomoized.maxProfit(5));    
    System.out.println(rodCutterMomoized.maxProfit(22));    
  }
}
