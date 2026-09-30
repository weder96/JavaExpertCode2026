public class Main {

    public static void main(String[] args) {
        MyThreadRunnable runnable = new MyThreadRunnable("Thread-Runnable-1", 600);
        MyThreadRunnable runnable2 = new MyThreadRunnable("Thread-Runnable-2", 2000);

    }
}
