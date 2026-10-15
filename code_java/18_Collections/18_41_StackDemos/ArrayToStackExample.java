import java.util.Stack;

public class ArrayToStackExample {
    public static void main(String a[]){
        Integer[] intArr = { 1001,1002,1003,1004};
        Stack<Integer> stack = new Stack<>();
        for(Integer i : intArr){
            stack.push(i);
        }
        System.out.println("Non-Empty stack : "  + stack);
    }
}
