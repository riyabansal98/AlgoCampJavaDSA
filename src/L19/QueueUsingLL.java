package L19;



public class QueueUsingLL {

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    Node head;
    Node tail;

    //addLast -> O(1)
    public void enqueue(int x)
    {

        Node nn = new Node(x);

        if(this.tail == null) {

            this.head = this.tail = nn;
            return;
        }

        this.tail.next = nn;
        this.tail = nn;
    }

    //removeFirst() -> O(1)
    public int dequeue() {

        if(this.head == null) {
            System.out.println("Queue is already empty");
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

        if (this.head == null) {
            System.out.println("Queue is already empty");
            return -1;
        }

        int rv = this.head.data;

        return rv;

    }
}
