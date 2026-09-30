import java.util.HashMap;

public class MapExample {
    public static void main(String[] args) {
        var catalog = new HashMap<String, Employee>(); // HashMap implements Map
        
        var laptop = new Employee("Pro Laptop 15-inch");
        catalog.put("SKU-10045", laptop);

        var productId = "SKU-10045";
        Employee item = catalog.get(productId); // gets laptop
        System.out.println("Retrieved item: " + item);

        var stockLevels = new HashMap<String, Integer>();
        stockLevels.put("SKU-10045", 50);

        var searchId = "SKU-99999";
        // gets 0 if the productId is not present
        int stock = stockLevels.getOrDefault(searchId, 0); 
        
        System.out.println("Stock for missing ID: " + stock);
    }
}



