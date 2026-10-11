import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.List;
import static fpij.Triple.triple;

public class PythagoreanTriplesFunctionalTest extends PythagoreanTriplesTest {
  @BeforeEach
  public void init() {
    pythagoreanTriples = new PythagoreanTriplesFunctional();
  }
}
