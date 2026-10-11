import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

public class FirstRepeatedLetterFunctionalTest extends FirstRepeatedLetterTest {
  @BeforeEach
  public void init() {
    firstRepeatedLetter = new FirstRepeatedLetterFunctional();
  }
}
