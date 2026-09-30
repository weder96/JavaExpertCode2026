import java.util.HashMap;
import java.util.Map;

public class HelloWolldDuke {
    public static void main(String[] args) {
        System.out.println("Hello World Map");
        Map<Integer,Object> map = new HashMap<>();
        map.put(1, new String("Duke 1"));
        map.put(2, new String("Duke 2"));
        map.put(3, new String("Duke 3"));
    }
}