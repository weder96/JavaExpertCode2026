import java.util.List;
import java.util.ArrayList;

public class PickStockParallel extends PickStockFunctional {
  public static void main(String[] args) {
    findHighPriced(Tickers.symbols.parallelStream());
  }
}
