import java.util.*;

public class AirportNamesFunctional {
  public static List<Try<String>> getNamesOfAirports(List<String> iataCodes) {
    return iataCodes.stream()
      .map(iataCode -> Try.of(() -> AirportInfo.getNameOfAirport(iataCode)))
      .map(name -> name.map(String::toUpperCase))
      .toList();
  }

  public static void main(String[] args) {
    var iataCodes = List.of("AUS", "DFW", "HOU", "IHA", "SAT");
    
    getNamesOfAirports(iataCodes).stream()
      .map(name -> switch(name) {
        case Success(String result) -> result;
        case Failure(Throwable throwable) -> "Error: " + throwable.getMessage();
      })
      .forEach(System.out::println);
  }
}
