package LinkedList;

public class DoublyLinkedList {
    Node head;
    static class Node {
        int data;
        Node prev;
        Node next;

        Node(int d) { data = d; }
    }

    public void push(int new_data)
    {
        Node new_Node = new Node(new_data);
        new_Node.next = head;
        new_Node.prev = null;

        if (head != null)
            head.prev = new_Node;

        head = new_Node;
    }
    public void InsertAfterNode(Node prev_Node, int new_data)
    {
        if (prev_Node == null) {
            System.out.println("The given previous node cannot be NULL ");
            return;
        }
        Node new_node = new Node(new_data);

        new_node.next = prev_Node.next;

        prev_Node.next = new_node;

        new_node.prev = prev_Node;

        if (new_node.next != null)
            new_node.next.prev = new_node;
    }

    void append(int new_data)
    {
        Node new_node = new Node(new_data);

        Node last = head;
        new_node.next = null;

        if (head == null) {
            new_node.prev = null;
            head = new_node;
            return;
        }
        while (last.next != null)
            last = last.next;
        last.next = new_node;

        new_node.prev = last;
    }

    void deleteNode(Node del)
    {
        if (head == null || del == null) {
            return;
        }
        if (head == del) {
            head = del.next;
        }
        if (del.next != null) {
            del.next.prev = del.prev;
        }
        if (del.prev != null) {
            del.prev.next = del.next;
        }
        System.out.println(del.data+" deleted");
    }

    public void printList(Node node)
    {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
        System.out.println();
    }

    public static void main(String[] args)
    {
        DoublyLinkedList dll = new DoublyLinkedList();
        //insertions to beg and appending to last position
        dll.push(10);
        dll.push(20);
        dll.append(5);
        dll.append(30);
        //insertion after a given node
        dll.InsertAfterNode(dll.head.next, 50);

        //printing
        System.out.println("Doubly LinkedList is: ");
        dll.printList(dll.head);

        //deleting
        dll.deleteNode(dll.head.next);
        dll.printList(dll.head);
        dll.deleteNode(dll.head.next.next);
        dll.printList(dll.head);
    }
}
