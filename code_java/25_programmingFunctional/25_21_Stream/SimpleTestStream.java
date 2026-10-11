import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SimpleTestStream {
    public static void main(String[] args) {
        int total = 0;
        for(int i=0;i<=50;i++){	
            total += i;
        }
        System.out.println("Total is :"+total);


        int total1 = IntStream.rangeClosed(0, 50)
                        .map(Integer::new)
                        .sum();
        System.out.println("Total in Java8 :"+total1);



        List<String> names = Arrays.asList("Isaac","Peter","Anthony","Isaac");

        List<String> uniqueList = new ArrayList<>();
        for(String name : names) {
            if(!uniqueList.contains(name)) {
                uniqueList.add(name);
            }
        }
        System.out.println("Unique List 1 :"+uniqueList);

        List<String> uniqueValues1 = names.stream()
		.distinct()
		.collect(Collectors.toList());
        System.out.println("Unique List 2 :"+uniqueValues1);



        Runnable t1 = new Runnable() {			
            @Override
            public void run() {
                System.out.println("Thread 1");				
            }
        };
        new Thread(t1).start();


        Runnable t2 = () -> {System.out.println("Thread 2");};
        new Thread(t2).start();


    }
    
}
