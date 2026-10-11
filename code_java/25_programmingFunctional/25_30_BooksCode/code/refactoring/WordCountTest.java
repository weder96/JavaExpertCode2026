import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class WordCountTest {
  WordCount wordCount;
  
  @BeforeEach
  public void init() {
    wordCount = new WordCount();
  }
  
  @Test 
  public void count() {
    assertAll(
      () -> assertEquals(2,
        wordCount.countInFile("public", "fpij/WordCount.java")),
      () -> assertEquals(1,
        wordCount.countInFile("package", "fpij/WordCount.java"))        
          
    );
  }
}
