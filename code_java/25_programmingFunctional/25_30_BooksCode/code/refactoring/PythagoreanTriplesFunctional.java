import java.util.List;
import java.util.ArrayList;
import java.util.stream.Stream;
import java.util.stream.IntStream;
import static java.util.stream.Collectors.toList;

public class PythagoreanTriplesFunctional extends PythagoreanTriples {
  public List<Triple> compute(int numberOfValues) {
    return Stream.iterate(2, e -> e + 1)      
      .flatMap(m -> IntStream.range(1, m)
        .mapToObj(n -> getTripleEuclidsWay(m, n)))
      .limit(numberOfValues)
      .toList();
  }
}
