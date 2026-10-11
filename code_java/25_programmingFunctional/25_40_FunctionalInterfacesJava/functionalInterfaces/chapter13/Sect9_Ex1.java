import java.util.concurrent.CompletableFuture;
import java.util.function.Supplier;

public class Sect9_Ex1 {
    public static void main(String[] args) {
        Supplier y = () -> {
            int[] a = { 1, 2, 3 };
            return a[3];
        };
        CompletableFuture
                .supplyAsync(y) // CompletableFuture<Integer>
                .exceptionally(x -> 0) // CompletableFuture<Integer>
                .thenAccept(x -> System.out.println(x)); // CompletableFuture<Void>
    }
}