import java.util.function.BiConsumer;

public class BiConsumerExample {
    public static void main(String[] args) {        
        BiConsumer<Integer, Integer> addConsumer = (a,b) -> System.out.println("Add :"+(a+b));
    	BiConsumer<Integer, Integer> subConsumer = (a,b) -> System.out.println("Subs :"+(a-b));
	    BiConsumer<Integer, Integer> mulConsumer = (a,b) -> System.out.println("Mul :"+(a*b));
	    addConsumer.accept(10, 20);
	    subConsumer.accept(10, 20);
	    mulConsumer.accept(10, 20);
	    addConsumer.andThen(subConsumer).andThen(mulConsumer).accept(10, 20);
    }
}