import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class ListToStackExample {
    public static void main(String a[]){
        Stack<Integer> stack = new Stack<>();

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        System.out.println("Non-Empty stack addAll Operation : " + stack.addAll(list));
        System.out.println("Non-Empty stack : " + stack);
    }
}
