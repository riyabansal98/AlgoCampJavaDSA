package L18;

public class DoublyLinkedList {

    Node head;

    class Node {
        int data;
        Node prev;
        Node next;

        Node(int d) {
            data = d;
            prev = null;
            next = null;
        }
    }

    //inserts a node at the start of the DLL
    public void insertFront(int data) {

        //Create a new node and allocate data to it.
        Node newNode = new Node(data);

        newNode.next = head;

        if (head != null)
            head.prev = newNode;

        //head starts pointing to the new node.
        head = newNode;
    }

    public void insertEnd(int data) {

        if (head == null) {
            insertFront(data);
            return;
        }

        //create a new node
        Node newNode = new Node(data);

        //take the temp pointer to the very last node of the ll
        Node temp = head;
        while (temp.next != null)
            temp = temp.next;

        //attaching the last node of ll to the new node
        temp.next = newNode;

        //populating the prev pointer of new node.
        newNode.prev = temp;
    }

    public int removeFirst() {

        //if the LL is already empty, there is nothing to remove.
        if(this.head == null) {
            return -1;
        }


        int rv = this.head.data;
        this.head = this.head.next;
        this.head.prev = null;

        return rv;
    }

    public int removeLast() {

        Node temp  = this.head;

        while(temp.next.next != null) {
            temp = temp.next;
        }

        int rv = temp.next.data;
        temp.next = null;

        return rv;

    }

    public int removeAt(int idx) {

        if(idx < 0) {
            return -1;
        }

        if(idx == 0) {
            return removeFirst();
        }

        Node temp = this.head;

        for(int i = 0; i < idx - 1; i++) {
            temp  = temp.next;
        }

        int rv = temp.next.data;

        temp.next = temp.next.next;

        Node forward = temp.next;
        forward.prev = temp;

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

    public static void main(String[] args) {

        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();

        doublyLinkedList.insertEnd(5);
        doublyLinkedList.display();

        doublyLinkedList.insertFront(1);
        doublyLinkedList.display();

        doublyLinkedList.insertFront(6);
        doublyLinkedList.display();

        doublyLinkedList.insertEnd(9);
        doublyLinkedList.display();

        doublyLinkedList.removeAt(2);

        doublyLinkedList.display();
    }
}
