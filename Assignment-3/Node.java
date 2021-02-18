package LinkedList;

public class Node {

    public int data;

    public Node next;

    public int min;

    public Node(int data) {
        this.data = data;
        this.next =null;
    }
    public void printList(Node head) {
        Node current = head;

        while(current != null) {
            System.out.print(current.data + "  ->  ");
            current = current.next;
        }
        System.out.println();
    }
}
