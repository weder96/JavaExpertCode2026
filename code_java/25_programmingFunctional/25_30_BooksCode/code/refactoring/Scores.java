import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Scores {
  public Map<Integer, Set<String>> namesForScores(
    Map<String, Integer> scores) {
      
    Map<Integer, Set<String>> namesForScores = new HashMap<>();
    
    for(String name : scores.keySet()) {
      int score = scores.get(name);

      Set<String> names = new HashSet<>();
      if(namesForScores.containsKey(score)) {
        names = namesForScores.get(score);          
      }

      names.add(name);
      namesForScores.put(score, names);
    }                            

    return namesForScores;
  } 
}
