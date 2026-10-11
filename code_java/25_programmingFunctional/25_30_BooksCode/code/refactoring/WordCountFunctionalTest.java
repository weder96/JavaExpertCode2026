import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class WordCountFunctionalTest extends WordCountTest {
  @BeforeEach
  public void init() {
    wordCount = new WordCountFunctional();
  }
}
