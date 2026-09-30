import java.util.Map;
import java.util.WeakHashMap;

public class SimpleWeakHashDemo {
    public static void main(String[] args) {
        Map<Object, String> weakMap = new WeakHashMap<>();
        
        Object weakKey = new Object();        
        weakMap.put(weakKey, "Active Value");
        System.out.println("Before GC: " + weakMap);

        weakKey = null;

        // Force Garbage Collection
        System.gc();
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("After GC: " + weakMap);
    }
}