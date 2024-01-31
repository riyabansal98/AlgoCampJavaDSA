package L26;


public class PairSumDLL {

    static class Node {
        int data;
        Node next, prev;
    }
    public static void main(String args[]) {
        Node head = null;

        // Insert elements into the doubly linked list
        head = insert(head, 9);
        head = insert(head, 8);
        head = insert(head, 6);
        head = insert(head, 5);
        head = insert(head, 4);
        head = insert(head, 2);
        head = insert(head, 1);

        int x = 7;

        // Find and print pairs with the given sum
        pairSum(head, x);
    }

    static void pairSum(Node head, int x) {

        Node first = head;
        Node second = head;

        while (second.next != null)
            second = second.next;

        boolean found = false;
        while(first != second && second.next != first) {

            if ((first.data + second.data) == x) {
                found = true;
                System.out.println("(" + first.data + ", " + second.data + ")");
                first = first.next;
                second = second.prev;
            }else{
                if ((first.data + second.data) < x)
                    first = first.next;
                else
                    second = second.prev;
            }

        }

        if(!found) {
            System.out.println("No pair found");
        }
    }

    static Node insert(Node head, int data) {
        Node temp = new Node();
        temp.data = data;
        temp.next = temp.prev = null;
        if (head == null)
            head = temp;
        else {
            temp.next = head;
            head.prev = temp;
            head = temp;
        }
        return temp;
    }
}
