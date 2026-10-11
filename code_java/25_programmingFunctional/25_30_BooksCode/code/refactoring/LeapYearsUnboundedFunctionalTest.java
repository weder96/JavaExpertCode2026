import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class LeapYearsUnboundedFunctionalTest extends LeapYearsUnboundedTest {
  @BeforeEach
  public void init() {
    leapYearsUnbounded = new LeapYearsUnboundedFunctional();
  }
}
