import java.util.List;
import java.util.ArrayList;

record Triple(int a, int b, int c) {
  public static Triple triple(int a, int b, int c) {  
    return new Triple(a, b, c);
  }
  
  public String toString() { return String.format("%d %d %d", a, b, c); }
}

public class PythagoreanTriples {
  public Triple getTripleEuclidsWay(int m, int n) {   
    int a = m * m - n * n;
    int b = 2 * m * n;
    int c = m * m + n * n;
    
    return triple(a, b, c);
  } 
  
  public List<Triple> compute(int numberOfValues) {
    if(numberOfValues == 0) {
      return List.of();
    }
    
    List<Triple> triples = new ArrayList<>();
    int count = 1;
    
    for(int m = 2; ; m++) {
      for(int n = 1; n < m; n++) {
        triples.add(getTripleEuclidsWay(m, n));        
        count++;
        
        if(count > numberOfValues)
          break;
      }
      
      if(count > numberOfValues)
        break;
    }
    
    return triples;
  }
}
