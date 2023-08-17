package L18;

public class LinkedListClient {

    public static void main(String[] args) {

        LinkedList ll = new LinkedList();

        ll.addFirst(20);
        ll.display();
        ll.addFirst(30);
        ll.display();
        ll.addFirst(40);
        ll.display();
        ll.addFirst(50);
        ll.display();     // 50 40 30 20
        ll.addLast(100);
        ll.display();    // 50 40 30 20 100
        ll.addLast(200);
        ll.display();    // 50 40 30 20 100 200
        ll.addAt(250, 3);
        ll.display();    // 50 40 30 250 20 100 200
        ll.removeFirst();
        ll.display();  // 40 30 250 20 100 200
        ll.removeLast();
        ll.display();  // 40 30 250 20 100
        ll.removeAt(3);
        ll.display();  // 40 30 250 100
    }
}
