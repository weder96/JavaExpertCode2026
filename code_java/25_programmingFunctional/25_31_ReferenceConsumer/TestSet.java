import java.util.*;

public class TestSet {
    public static void main(String[] args) {
     List<String> nomes =  new ArrayList<String>();
     nomes.add("Nome 1");
     nomes.add("Nome 2");
     nomes.add("Nome 3");

     Set<String> setNomes =  new HashSet<>();
        setNomes.add("Nome 1");
        setNomes.add("Nome 2");
        setNomes.add("Nome 3");
        setNomes.add("Nome 1");

     Set<String> setNome1 =  new LinkedHashSet<>();
        setNome1.add("Nome 1");
        setNome1.add("Nome 2");
        setNome1.add("Nome 3");
        setNome1.add("Nome 1");

        for(String ls: nomes)
         System.out.println("ls: "+ls);

        System.out.println("===========================");

     for(String s: setNomes)
         System.out.println("s: "+s);

     System.out.println("===========================");

        for(String s1: setNome1)
            System.out.println("s1: "+s1);
    }
}
