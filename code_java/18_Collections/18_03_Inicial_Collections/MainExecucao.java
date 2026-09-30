import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class MainExecucao {

    // Simulação da classe utilitária mencionada no seu código
    static class TestIterators {
        public static Collection<String> loadListL(String... elementos) {
            return Arrays.asList(elementos);
        }
    }

    public static void main(String[] args) {
        // Inicialização de Collection usando uma subclasse anônima com bloco de inicialização
        Collection<Integer> c2 = new ArrayList<Integer>() {{ 
            add(1); 
            add(2); 
            add(3); 
        }};
        
        Collection<String> c3 = TestIterators.loadListL("1", "2", "3");
        Iterator<String> iter = c3.iterator();
        while (iter.hasNext()) {
            String element = iter.next();
            System.out.println(element);
        }

        System.out.println("-------------------");        
        Collection<String> c = Arrays.asList("city", "state", "country", "continent");
        Iterator<String> iter1 = c.iterator();
        iter1.forEachRemaining(System.out::println);        
        System.out.println("Elementos de c2: " + c2);
    }
}