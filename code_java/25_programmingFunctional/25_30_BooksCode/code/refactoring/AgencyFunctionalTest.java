import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import java.util.Set;

public class AgencyFunctionalTest extends AgencyTest {
  @BeforeEach
  public void init() {
    agency = new AgencyFunctional();
  }
}
