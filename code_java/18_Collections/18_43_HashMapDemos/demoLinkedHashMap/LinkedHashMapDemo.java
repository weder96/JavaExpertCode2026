import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {
    public static void main(String[] args) {
        Map<String, Employee> staff = new LinkedHashMap<>();
        
        staff.put("144-25-5464", new Employee("Amy Lee"));
        staff.put("567-24-2546", new Employee("Harry Hacker"));
        staff.put("157-62-7935", new Employee("Gary Cooper"));
        staff.put("456-62-5527", new Employee("Francesca Cruz"));

        System.out.println("--- Using two Iterators ---");
        Iterator<String> iterKey = staff.keySet().iterator();
        Iterator<Employee> iterValues = staff.values().iterator();
        
        while (iterKey.hasNext() && iterValues.hasNext()) {
            System.out.println(iterKey.next() + " - " + iterValues.next());
        }

        System.out.println("\n--- Better approach using Map.Entry ---");
        for (Map.Entry<String, Employee> entry : staff.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}

