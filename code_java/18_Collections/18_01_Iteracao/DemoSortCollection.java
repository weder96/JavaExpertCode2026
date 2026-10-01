import java.util.*;

public class DemoSortCollection {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<String>();

        lista.add("Goiânia");
        lista.add("São Paulo");
        lista.add("Aracaju");
        
        // lista sem ordenação
        System.out.println(lista);
        
        Collections.sort(lista);
        
        // lista ordenada
        System.out.println(lista);
    }
}