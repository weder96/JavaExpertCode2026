import java.time.Year;

public class LeapYears {
  public int countFrom1900(int upTo) {
    int numberOfLeapYears = 0;
    
    for(int i = 1900; i <= upTo; i += 4) {
      if(Year.isLeap(i)) {
        numberOfLeapYears++;
      }
    }
    
    return numberOfLeapYears;
  }
}
