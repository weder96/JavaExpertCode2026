

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterNoClose {
  private FileWriter writer;
  
  public FileWriterNoClose(String fileName) throws IOException {
    writer = new FileWriter(fileName);
  }
  
  public void writeStuff(String message) throws IOException {
    writer.write(message);
  }
  
  public void finalize() throws IOException {
    writer.close();
  }

  public static void main(String[] args) {
    try {
      FileWriterNoClose writerExample = new FileWriterNoClose("noclose.txt");
      writerExample.writeStuff("peek-a-boo");      
    } catch(IOException ex) {
      System.out.println(ex);
    }
  }
}
