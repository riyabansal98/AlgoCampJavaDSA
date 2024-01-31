package L26;

public class RemoveDuplicates {

    static class Node {
        int data;
        Node next, prev;

        Node(int data) {
            this.data = data;
            next = null;
            prev = null;
        }
    }
    public static void main(String[] args) {

        Node head = null;
        head = push(head, 12);
        head = push(head, 12);
        head = push(head, 10);
        head = push(head, 8);
        head = push(head, 8);
        head = push(head, 6);
        head = push(head, 4);
        head = push(head, 4);
        head = push(head, 4);
        head = push(head, 4);

        System.out.println("Original doubly linked list:");
        printList(head);

        /* remove duplicate nodes */
        removeDuplicates(head);
        System.out.println("\nDoubly linked list after removing duplicates:");
        printList(head);
    }

    public static void removeDuplicates(Node head) {

        if(head == null || head.next == null) {
            return;
        }

        Node current = head;

        while(current.next != null) {
            if(current.data == current.next.data) {
                //delete the node pointed by current.next
                deleteNode(current.next);
            }else{
                current = current.next;
            }
        }
    }

    public static void deleteNode(Node del) {

        if(del == null) {
            return;
        }

        // If the node to be deleted is the head node,
        if(del.prev == null) {
            del.next.prev = null;
            del = del.next;
        }else {
            //del is some middle node and not the last node
            if (del.next != null) {
                del.next.prev = del.prev;
            }
            del.prev.next = del.next;
        }
    }


    public static void printList(Node head) {
        if (head == null)
            System.out.println("Doubly Linked list empty");

        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    public static Node push(Node head, int data) {
        /* allocate node */
        Node newNode = new Node(data);
        /* link the old list to the new node */
        newNode.next = head;
        /* change prev of head node to new node */
        if (head != null) {
            head.prev = newNode;
        }
        /* update head to point to the new node */
        head = newNode;
        return head;
    }
}
