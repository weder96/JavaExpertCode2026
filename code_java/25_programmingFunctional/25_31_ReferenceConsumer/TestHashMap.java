import java.util.HashMap;
import java.util.Map;

public class TestHashMap {
    public static void main(String[] args) {
        Map<String, String> nomesMap = new HashMap<>();
        nomesMap.put("K1", new String("V1"));
        nomesMap.put("K2", new String("V2"));
        nomesMap.put("K3", new String("V3"));
        nomesMap.put("K4", new String("V4"));
        nomesMap.put("K5", new String("V5"));
        nomesMap.put("K6", new String("V6"));

        for(String key: nomesMap.keySet()){
            String value = nomesMap.get(key);
            System.out.println(key +" = "+ value);
        }
        System.out.println("=======================================");
        nomesMap.forEach((key, value) -> System.out.println(key +" = "+ value));
    }
}
