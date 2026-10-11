import java.math.BigDecimal;
import java.net.URI;
import java.net.URL;
import java.util.Scanner;

public class FinanceData {
  public static BigDecimal getPrice(final String ticker) {
    try {
      final String URL = 
        "https://eodhistoricaldata.com/api/eod/%s.US?%s&%s&%s";
      final URL url = new URI(String.format(URL,
        ticker,
        "fmt=json",
        "filter=last_close",
        "api_token=OeAFFmMliFG5orCUuwAKQ8l4WWFQ67YX")).toURL();

      try(Scanner scanner = new Scanner(url.openStream())) {
        return new BigDecimal(scanner.nextLine());
      }
    } catch(Exception ex) {
      throw new RuntimeException(ex);
    }
  }
}
