import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args) {
        Map<String, String> designPatterns = new HashMap<>();

        designPatterns.put("Singleton", "Ensures a class has only one instance");
        designPatterns.put("Observer", "Notifies dependents about state changes");
        designPatterns.put("Strategy", "Allows an algorithm to vary dynamically");
        designPatterns.put("Factory", "Creates objects without exposing the instantiation logic");
        designPatterns.put("Decorator", "Adds behaviors to an object at runtime");

        /*
         * The "keySet()" method returns a Set containing all the keys in our HashMap.
         * Using these keys, we can easily retrieve and print the corresponding values.
         */
        for (String pattern : designPatterns.keySet()) {
            String description = designPatterns.get(pattern);
            System.out.println(pattern + " = " + description);
        }
    }
}