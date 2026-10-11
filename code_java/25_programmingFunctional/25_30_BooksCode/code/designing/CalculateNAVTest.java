import java.math.BigDecimal;
import org.junit.jupiter.api.Test;

public class CalculateNAVTest {
  @Test 
  public void computeStockWorth() {
    final CalculateNAV calculateNAV =
      new CalculateNAV(ticker -> new BigDecimal("6.01"));
    BigDecimal expected = new BigDecimal("6010.00");
    BigDecimal actual = calculateNAV.computeStockWorth("GOOG", 1000);
    BigDecimal delta = actual.subtract(expected);

    assertEquals(0, delta.doubleValue(), 0.001);
  }

  //...
}
