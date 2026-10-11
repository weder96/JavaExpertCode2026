import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.Map;
import java.util.Set;

public class ScoresFunctionalTest extends ScoresTest {
  @BeforeEach
  public void init() {
    scores = new ScoresFunctional();
  }
}
