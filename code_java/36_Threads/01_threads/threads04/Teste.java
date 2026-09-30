public class Teste {

    public static void main(String[] args) {

        MyThreadRunnable thread1 = new MyThreadRunnable("Thread 1", 500);
        MyThreadRunnable thread2 = new MyThreadRunnable("Thread 2", 500);
        MyThreadRunnable thread3 = new MyThreadRunnable("Thread 3", 500);

        Thread t1 = new Thread(thread1);
        Thread t2 = new Thread(thread2);
        Thread t3 = new Thread(thread3);

        t1.setPriority(5);
        t2.setPriority(3);
        t3.setPriority(1);

//        t1.setPriority(Thread.MAX_PRIORITY);

        t1.start();
        t2.start();
        t3.start();
    }
}
