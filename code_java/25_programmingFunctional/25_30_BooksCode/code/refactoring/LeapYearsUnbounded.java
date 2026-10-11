import java.time.Year;

interface Continue {
  boolean check(int year);
}

public class LeapYearsUnbounded {
  public int countFrom1900(Continue shouldContinue) {
    int numberOfLeapYears = 0;
    
    for(int i = 1900;; i += 4) {
      if(!shouldContinue.check(i)) {
        break;
      }
      
      if(Year.isLeap(i)) {
        numberOfLeapYears++;
      }
    }
    
    return numberOfLeapYears;
  }
}
