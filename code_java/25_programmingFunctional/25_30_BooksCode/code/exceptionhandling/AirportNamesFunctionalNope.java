import java.util.*;
import java.io.IOException;

public class AirportNamesFunctionalNope {
  public static List<String> getNamesOfAirports(List<String> iataCodes) {
    return iataCodes.stream()
      .map(iataCode -> { //Bad idea
        try {
          return AirportInfo.getNameOfAirport(iataCode);
        } catch(Exception ex) {
          throw new RuntimeException(ex);
        }})
      .map(String::toUpperCase)
      .toList();
  }

  public static void main(String[] args) {
    var iataCodes = List.of("AUS", "DFW", "HOU", "IHA", "SAT");
    
    for(var name: getNamesOfAirports(iataCodes)) {
      System.out.println(name);
    }
  }
}
