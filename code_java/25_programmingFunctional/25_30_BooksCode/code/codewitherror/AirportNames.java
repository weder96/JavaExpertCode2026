import java.util.*;
import java.io.IOException;

public class AirportNames {
  public static List<String> getNamesOfAirports(List<String> iataCodes) {
    return iataCodes.stream()
      .map(iataCode -> AirportInfo.getNameOfAirport(iataCode))
      .map(String::toUpperCase)
      .toList();
    //ERROR: This code will not compile
  }
}
