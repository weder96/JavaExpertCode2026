import java.util.List;
import java.util.ArrayList;
import java.util.stream.Stream;

public class PickStockFunctional {
  public static void findHighPriced(final Stream<String> symbols) {
    final StockInfo highPriced = 
      symbols.map(StockUtil::getPrice)
             .filter(StockUtil.isPriceLessThan(500))
             .reduce(StockUtil::pickHigh)
             .get();    

    System.out.println("High priced under $500 is " + highPriced);
  }

  public static void main(final String[] args) {
    findHighPriced(Tickers.symbols.stream());
  }
}
