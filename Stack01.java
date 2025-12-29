import java.util.Stack;

public class Stack01 {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Stack elements: " + stack);

        stack.pop();

        System.out.println("After pop: " + stack);
    }
}
