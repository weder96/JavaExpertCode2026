import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class ListPerformanceComparison {

    private static final int ELEMENTS = 100_000;

    public static void main(String[] args) {
        // ==========================================
        // 1. TESTE DE INSERÇÃO (ADD)
        // ==========================================
        long startTime = System.nanoTime();
        List<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < ELEMENTS; i++) {
            arrayList.add(i);
        }
        long arrayListAdd = System.nanoTime() - startTime;

        startTime = System.nanoTime();
        List<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < ELEMENTS; i++) {
            linkedList.add(i);
        }
        long linkedListAdd = System.nanoTime() - startTime;

        System.out.println("ArrayList add:  " + arrayListAdd);
        System.out.println("LinkedList add: " + linkedListAdd);
        System.out.println("============================================");
        System.out.println("");

        // ==========================================
        // 2. TESTE DE ACESSO (GET - Acesso Aleatório)
        // ==========================================
        Random random = new Random();
        int operations = 5000; // Reduzido para o LinkedList não travar devido ao O(N)

        startTime = System.nanoTime();
        for (int i = 0; i < operations; i++) {
            arrayList.get(random.nextInt(ELEMENTS));
        }
        long arrayListGet = System.nanoTime() - startTime;

        startTime = System.nanoTime();
        for (int i = 0; i < operations; i++) {
            linkedList.get(random.nextInt(ELEMENTS));
        }
        long linkedListGet = System.nanoTime() - startTime;

        System.out.println("ArrayList get:  " + arrayListGet);
        System.out.println("LinkedList get: " + linkedListGet);
        System.out.println("============================================");
        System.out.println("");

        // ==========================================
        // 3. TESTE DE REMOÇÃO (REMOVE do início)
        // ==========================================
        startTime = System.nanoTime();
        // Remover do início forçar deslocamento massivo no ArrayList O(N^2) total
        for (int i = 0; i < 5000; i++) {
            if (!arrayList.isEmpty()) {
                arrayList.remove(0);
            }
        }
        long arrayListRemove = System.nanoTime() - startTime;

        startTime = System.nanoTime();
        for (int i = 0; i < 5000; i++) {
            if (!linkedList.isEmpty()) {
                linkedList.remove(0); // O(1) no início para o LinkedList
            }
        }
        long linkedListRemove = System.nanoTime() - startTime;

        System.out.println("ArrayList remove:  " + arrayListRemove);
        System.out.println("LinkedList remove: " + linkedListRemove);
        System.out.println("============================================");
    }
}

