import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import java.util.Set;

public class AgencyTest {
  Agency agency;
  
  @BeforeEach
  public void init() {
    agency = new Agency();
  }
  
  @Test 
  public void isChaperoneRequired() {
    assertAll(
      () -> assertTrue(agency.isChaperoneRequired(
        Set.of(new Person("Jake", 12)))),
      () -> assertTrue(agency.isChaperoneRequired(
        Set.of(new Person("Jake", 12), new Person("Pam", 14)))),
      () -> assertTrue(agency.isChaperoneRequired(
          Set.of(new Person("Shiv", 8),
              new Person("Sam", 9), new Person("Jill", 11)))),
      () -> assertFalse(agency.isChaperoneRequired(
          Set.of(new Person("Jake", 12), new Person("Pam", 18)))),
      () -> assertFalse(agency.isChaperoneRequired(Set.of()))
    );
  }
}
