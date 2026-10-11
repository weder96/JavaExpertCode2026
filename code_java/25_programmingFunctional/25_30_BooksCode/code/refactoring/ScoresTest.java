import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.Map;
import java.util.Set;

public class ScoresTest {
  Scores scores;
  
  @BeforeEach
  public void init() {
    scores = new Scores();
  }
  
  @Test 
  public void namesForScores() {
    assertAll(
      () -> assertEquals(Map.of(), scores.namesForScores(Map.of())),
      () -> assertEquals(
        Map.of(1, Set.of("Jill")), scores.namesForScores(Map.of("Jill", 1))),
      () -> assertEquals(
        Map.of(1, Set.of("Jill"), 2, Set.of("Paul")),
            scores.namesForScores(Map.of("Jill", 1, "Paul", 2))),
      () -> assertEquals(
        Map.of(1, Set.of("Jill", "Kate"), 2, Set.of("Paul")),
            scores.namesForScores(Map.of("Jill", 1, "Paul", 2, "Kate", 1)))
    );
  }
}
