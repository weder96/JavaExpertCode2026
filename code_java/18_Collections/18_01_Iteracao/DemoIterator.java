import java.util.ArrayList;
import java.util.Iterator;

public class DemoIterator {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("String1");
        strings.add("String2");
        strings.add("String3");

        // Utilizando o Enhanced-for
        System.out.println("--- Enhanced-for ---");
        for (String str : strings) {
            System.out.println(str);
        }
        
        // Utilizando o Iterator
        System.out.println("--- Iterator ---");
        Iterator<String> iterator = strings.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}