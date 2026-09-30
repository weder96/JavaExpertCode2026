public class Deadlock {

    public static void main(String[] args) {
        final String recurso1 = "RECURSO 1";
        final String recurso2 = "RECURSO 2";

        Thread t1 = new Thread() {
            public void run() {
                synchronized (recurso1) {
                    System.out.println("Thread 1: bloqueou " + recurso1);

                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    System.out.println("Thread 1: tentando acesso ao recruso " + recurso2);
                    synchronized (recurso2) {
                        System.out.println("Thread 1: bloqueou " + recurso2);
                    }
                }
            }
        };

        Thread t2 = new Thread() {
            public void run() {
                synchronized (recurso2) {
                    System.out.println("Thread 2: bloqueou " + recurso2);

                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    System.out.println("Thread 2: tentando acesso ao " + recurso1);
                    synchronized (recurso1) {
                        System.out.println("Thread 2: bloqueou " + recurso1);
                    }
                }
            }
        };

        t1.start();
        t2.start();


    }
}
