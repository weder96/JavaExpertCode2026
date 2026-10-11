import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.List;


public class PythagoreanTriplesTest {
  PythagoreanTriples pythagoreanTriples;
  
  @BeforeEach
  public void init() {
    pythagoreanTriples = new PythagoreanTriples();
  }
  
  @Test 
  public void compute() {
    assertAll(
      () -> assertEquals(List.of(), pythagoreanTriples.compute(0)),
      () -> assertEquals(List.of(triple(3, 4, 5)),
         pythagoreanTriples.compute(1)),
      () -> assertEquals(
        List.of(triple(3, 4, 5), triple(8, 6, 10), triple(5, 12, 13)),
         pythagoreanTriples.compute(3)),
      () -> assertEquals(
        List.of(triple(3, 4, 5), triple(8, 6, 10),
                triple(5, 12, 13), triple(15, 8, 17),
                triple(12, 16, 20)),
         pythagoreanTriples.compute(5))
    );
  }
}
