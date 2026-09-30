public class Teste3 {

    public static void main(String[] args) {

        MyThreadRunnable thread1 = new MyThreadRunnable("Thread 1", 500);
        MyThreadRunnable thread2 = new MyThreadRunnable("Thread 2", 700);
        MyThreadRunnable thread3 = new MyThreadRunnable("Thread 3", 800);

        Thread t1 = new Thread(thread1);
        Thread t2 = new Thread(thread2);
        Thread t3 = new Thread(thread3);

        t1.start();

        t2.start();

        t3.start();

        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        System.out.println("Programa finalizado!");

    }
}
