import java.util.*;
import java.io.IOException;

public class AirportNames {
  public static List<DataOrException<String>> getNamesOfAirports(
    List<String> iataCodes) {

    List<DataOrException<String>> result = new ArrayList<>();
    
    for(var iataCode: iataCodes) {
      try {
        result.add(DataOrException.of(
          AirportInfo.getNameOfAirport(iataCode).toUpperCase()));
      } catch(IOException | AirportInfoException ex) {
          result.add(DataOrException.of(ex));
      }
    }

    return result;
  }
  
  public static void main(String[] args) {
    var iataCodes = List.of("AUS", "DFW", "HOU", "IHA", "SAT");

    for(var result: getNamesOfAirports(iataCodes)) {
      if(result.isDataPresent()) {
        System.out.println(result.getDataOrThrow());				
      } else {
        System.out.println("Error: " + 
	  result.getExceptionOrThrow().getMessage());
      }
  }
}
}
