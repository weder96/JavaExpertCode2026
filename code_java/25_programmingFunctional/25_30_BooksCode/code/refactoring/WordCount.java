import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class WordCount {
  public long countInFile(
    String searchWord, String filePath) throws IOException {
      
    long count = 0;
  
    BufferedReader bufferedReader =
      new BufferedReader(new FileReader(filePath));
    
    String line = null;
    
    while((line = bufferedReader.readLine()) != null) {
      String[] words = line.split(" ");
      
      for(String word: words) {
        if(word.equals(searchWord)) {
          count++;
        }
      }
    }
    
    return count;
  }
}
