import java.util.Arrays;
import java.util.List;

public class DemoPerformanceComparison {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        // SEQUENTIAL
        long startSeq = System.currentTimeMillis();
        numbers.stream().forEach(DemoPerformanceComparison::slowOperation);
        long endSeq = System.currentTimeMillis();
        System.out.println("Sequential Time: " + (endSeq - startSeq) + " ms");

        // PARALLEL
        long startPar = System.currentTimeMillis();
        numbers.parallelStream().forEach(DemoPerformanceComparison::slowOperation);
        long endPar = System.currentTimeMillis();
        System.out.println("Parallel Time: " + (endPar - startPar) + " ms");
    }

    private static void slowOperation(int number) {
        try {
            Thread.sleep(1000); // Simulates a complex calculation
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    
}
