import java.math.BigInteger;

public class Factorial {
  public BigInteger compute(long upTo) {
    BigInteger result = BigInteger.ONE;
    
    for(int i = 1; i <= upTo; i++) {
      result = result.multiply(BigInteger.valueOf(i));
    }
    
    return result;
  }
}
