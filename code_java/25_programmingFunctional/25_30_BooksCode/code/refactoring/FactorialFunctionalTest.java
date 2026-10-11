import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.math.BigInteger;

public class FactorialFunctionalTest extends FactorialTest {
  @BeforeEach
  public void init() {
    factorial = new FactorialFunctional();
  }
}
