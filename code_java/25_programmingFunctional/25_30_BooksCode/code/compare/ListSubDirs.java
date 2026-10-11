import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static java.util.stream.Collectors.toList;
import java.util.stream.Stream;

public class ListSubDirs {
  public static void listTheHardWay() {
    List<File> files = new ArrayList<>();
    
    File[] filesInCurrentDir = new File(".").listFiles();
    for(File file : filesInCurrentDir) {
      File[] filesInSubDir = file.listFiles();
      if(filesInSubDir != null) {
        files.addAll(Arrays.asList(filesInSubDir));
      } else {
        files.add(file);
      }
    }
    
    System.out.println("Count: " + files.size());
  }

  public static void betterWay() {
    List<File> files = 
      Stream.of(new File(".").listFiles())
            .flatMap(file -> file.listFiles() == null ? 
                Stream.of(file) : Stream.of(file.listFiles()))
            .collect(toList());
    System.out.println("Count: " + files.size());
  }
    
  public static void main(String[] args) {
    System.out.println("START:HARDWAY_OUTPUT");
    listTheHardWay();
    System.out.println("END:HARDWAY_OUTPUT");
    betterWay();
  }
}
