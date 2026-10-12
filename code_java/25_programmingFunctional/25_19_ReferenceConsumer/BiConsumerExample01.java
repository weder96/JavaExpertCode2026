import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumerExample01 {
   public static void main(String[] args) {
	BiConsumer<Integer, Integer> con1 = (a,b) -> System.out.println("Add :"+(a+b));
	con1.accept(10, 20);
	
	List<Integer> list1 = Arrays.asList(10,10,10);
	List<Integer> list2 = Arrays.asList(10,10);
	
	BiConsumer<List<Integer>,List<Integer>> con2 = (l1,l2) -> {
		if(l1.size() == l2.size()) System.out.println("True");
		else System.out.println("False");
	};
	con2.accept(list1, list2);				
 }
}
