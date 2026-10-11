import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestHasmMapCustomer {
        public static void main(String[] args) {
            Map<String, List<Customer>> nomesMap = new HashMap<>();

            List<Customer> lCustomer = new ArrayList<Customer>();
            lCustomer.add(new Customer("WEDER"));
            lCustomer.add(new Customer("WEDER2"));

            nomesMap.put("key1", lCustomer);
            nomesMap.put("key2", lCustomer);

            for(String key: nomesMap.keySet()){
                List<Customer> customer = nomesMap.get(key);
                for(Customer cust : customer)
                 System.out.println(key +" = "+ cust.getFirstName());
            }

        }
    }

