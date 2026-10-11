public class SimpleStreamExample2 {
    public static void main(String[] args) {
        new Thread(new Runnable() {
	        @Override
	            public void run() {
		            System.out.println("Thread 4");
	            }
        }).start();


        Runnable t3 = () -> {
	        System.out.println("Thread 3");
	        System.out.println("Thread 3.1");  
        };
        new Thread(t3).start();


        new Thread(() -> {
            System.out.println("Thread 5");
            System.out.println("Thread 5.1");
        }).start();

    }
    
}
