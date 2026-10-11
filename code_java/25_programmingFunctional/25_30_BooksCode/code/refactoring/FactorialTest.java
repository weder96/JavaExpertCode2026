import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import java.math.BigInteger;

public class FactorialTest {
  Factorial factorial;
  
  @BeforeEach
  public void init() {
    factorial = new Factorial();
  }
  
  @Test 
  public void computeFactorial() {
    assertAll(
      () -> assertEquals(BigInteger.ONE, factorial.compute(1)),
      () -> assertEquals(BigInteger.TWO, factorial.compute(2)),
      () -> assertEquals(BigInteger.valueOf(6), factorial.compute(3)),
      () -> assertEquals(BigInteger.valueOf(120), factorial.compute(5))
    );
  }
}
