public class DiscountImperative {
  public static void main(final String[] args) {
    double totalOfDiscountedPrices = 0.0;

    for(int price : Prices.prices) {
      if(price > 20) {
        totalOfDiscountedPrices += price * 0.9;
      }
    }
    System.out.println("Total of discounted prices: " + totalOfDiscountedPrices);
  }
}
