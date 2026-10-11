import java.math.BigDecimal;
import java.util.function.Function;

public class CalculateNAV {
  public BigDecimal computeStockWorth(
    final String ticker, final int shares) {
    return priceFinder.apply(ticker).multiply(BigDecimal.valueOf(shares));
  }
  //... other methods that use the priceFinder ...

  private Function<String, BigDecimal> priceFinder;

public CalculateNAV(final Function<String, BigDecimal> aPriceFinder) {
  priceFinder = aPriceFinder;
}

  public static void main(String[] args) {
    final CalculateNAV calculateNav = new CalculateNAV(FinanceData::getPrice);
    
    System.out.println(String.format("100 shares of Apple worth: $%.2f",
      calculateNav.computeStockWorth("AAPL", 100)));
  }
}
