import java.util.Stack;
public class stack {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        stack.push("apple");
        stack.push("manggo");
        stack.push("grape");
        stack.push("banana");

        System.out.println("content of stack:" + stack);
        String deleted = stack.pop();
        System.out.println("delet content:" + deleted);
        System.out.println("content now:" + stack);
        System.out.println("the first content "+stack.peek());
    }



}