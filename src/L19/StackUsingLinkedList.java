package L19;

public class StackUsingLinkedList {

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    Node head;

    //push -> addAtHead() O(1)
    public void push(int x) {

        Node nn = new Node(x);
        nn.next = this.head;
        this.head = nn;
    };

    //pop -> removeFirst(); O(1)
    public int pop() {

        if(this.head == null) {
            System.out.println("Stack is already empty");
            return -1;
        }

        int rv = this.head.data;
        this.head = this.head.next;

        return rv;
    }

    public void display() {
        System.out.println("-------------------");
        Node temp = this.head;

        while(temp != null) {

            System.out.print(temp.data + " " );
            temp = temp.next;
        }
        System.out.println();
        System.out.println("-------------------");
    }

    public boolean isEmpty() {
        return head == null;
    }

    public int peek() {

        if(this.head == null) {
            System.out.println("Stack is already empty");
            return -1;
        }

        int rv = this.head.data;

        return rv;
    }

}
