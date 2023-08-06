package L12;

import java.util.*;

public class QueueUsingStack {

    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();

    void enqueue(int x) {

//        while(!s1.isEmpty()) {
//            s2.push(s1.pop());
//        }
//
//        s1.push(x);
//
//        while(!s2.isEmpty()) {
//            s1.push(s2.pop());
//        }

        s1.push(x);
     }

    int dequeue() {

        return s1.pop();
    }

    public static void main(String[] args) {

        QueueUsingStack q = new QueueUsingStack();

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
    }
}
