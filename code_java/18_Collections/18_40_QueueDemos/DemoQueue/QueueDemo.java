import java.util.Queue;

/**
 * Demo for the  {@link Queue} interface and its implementations.
 *
 * @author wsousa
 */
public class QueueDemo {
  public static void main(String[] args) {
    runDemo(new ArrayQueue<>());
    runDemo(new BoundedArrayQueue<>(10));
    runDemo(new HeapPriorityQueue<>());
    runDemo(new LinkedListQueue<>());
    runDemo(new OptimizedHeapPriorityQueue<>());
    runDemo(new StackQueue<>());
  }

  private static void runDemo(Queue<Integer> queue) {
    System.out.println("---------- " + queue.getClass().getSimpleName() + " ----------");
    System.out.println("queue.isEmpty() = " + queue.isEmpty());

    for (int i = 1; i <= 5; i++) {
      queue.enqueue(i);
      System.out.println("queue.enqueue(" + i + ")");
    }

    System.out.println();

    System.out.println("queue.isEmpty() = " + queue.isEmpty());
    System.out.println("queue.peek() = " + queue.peek());

    System.out.println();

    while (!queue.isEmpty()) {
      System.out.println("queue.dequeue() = " + queue.dequeue());
    }

    System.out.println();

    System.out.println("queue.isEmpty() = " + queue.isEmpty());
    try {
      System.out.println("queue.dequeue() = " + queue.dequeue());
    } catch (Exception ex) {
      ex.printStackTrace(System.out);
    }
  }
}
