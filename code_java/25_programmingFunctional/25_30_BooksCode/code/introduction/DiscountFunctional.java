public class DiscountFunctional {
  public static void main(final String[] args) {
    final double totalOfDiscountedPrices =  Prices.prices.stream()
            .filter(price -> price > 20)
            .mapToDouble(price -> price * 0.9)
            .sum();

    System.out.println("Total of discounted prices: " + totalOfDiscountedPrices);
  }
}
