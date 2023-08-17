package L19;

import java.util.Stack;

public class StackLibrary {

    public static void main(String[] args) {

        Stack<Integer> s = new Stack();
        s.push(10);
        s.push(20);
        System.out.println(s.pop());
        s.push(30);
        System.out.println(s.peek());
        s.isEmpty();

    }
}
