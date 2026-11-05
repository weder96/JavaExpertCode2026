import java.util.Arrays;
import java.util.List;

public class Demo02Paralell {

    public static void main(String[] args) {
        List<String> nomes = Arrays.asList("Ana", "Bruno", "Carlos", "Daniela", "Eduardo");

        System.out.println("--- Stream Paralelo ---");
        nomes.parallelStream().forEach(nome -> {
            String threadName = Thread.currentThread().getName();
            System.out.println(nome + " processado por: " + threadName);
        });
    }
    
}
