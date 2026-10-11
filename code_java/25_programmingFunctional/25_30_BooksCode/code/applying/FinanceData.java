import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class FinanceData {
  public static BigDecimal getPrice(final String ticker) {
    Map<String, String> fakePrices = new HashMap<>() {
      {
        put("AMD", "81"); put("HPQ", "33"); put("IBM", "135");
        put("TXN", "150"); put("VMW", "116"); put("XRX", "15");
        put("AAPL", "131"); put("ADBE", "360"); put("AMZN", "106");
        put("CRAY", "130"); put("CSCO", "43"); put("SNE", "72");
        put("GOOG", "2157"); put("INTC", "36"); put("INTU", "369");
        put("MSFT", "247"); put("ORCL", "67"); put("TIBX", "24");
        put("VRSN", "157"); put("RIVN", "26");
      }
    };
    
    try { Thread.sleep(200); } catch(Exception ex) {} //simulate a call delay
      
    return new BigDecimal(fakePrices.get(ticker));
  }
}
