public class HolderThreadSafe {
  private Heavy heavy;
  
  public HolderThreadSafe() {
    System.out.println("Holder created");
  }

  public synchronized Heavy getHeavy() {
    if(heavy == null) {
      heavy = new Heavy();
    }
    
    return heavy;
  }

//...

  public static void main(final String[] args) {
    final HolderThreadSafe holder = new HolderThreadSafe();
    System.out.println("deferring heavy creation...");
    System.out.println(holder.getHeavy());
    System.out.println(holder.getHeavy());
  }
}
