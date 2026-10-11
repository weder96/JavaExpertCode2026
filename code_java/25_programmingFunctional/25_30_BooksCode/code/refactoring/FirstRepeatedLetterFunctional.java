import java.util.stream.Stream;

public class FirstRepeatedLetterFunctional extends FirstRepeatedLetter {
  public char findIn(String word) {
    return Stream.of(word.split(""))
      .filter(letter -> word.lastIndexOf(letter) > word.indexOf(letter))
      .findFirst()
      .map(letter -> letter.charAt(0))
      .orElse('\0');      
  }
}
