package LinkedList;

public class DeleteNodeInLinkedList {
    public static void delete(Node head,int value)
    {
        Node ptr = head;
        Node prev = ptr;

        if(head.data==value)
        {
            if(head.next==null)
            {
                System.out.println("Only one node in the List, cannot delete!");
                return;
            }
            head.data =head.next.data;
            head.next =head.next.next;
            return;
        }
        while(ptr!=null)
        {
            if (ptr.data == value) {
                prev.next = ptr.next;
                ptr.next = null;
                return;
            }
            prev = ptr;
            ptr=ptr.next;
        }
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);

        System.out.println("Linked list: ");
        Node.printList(head);

        delete(head,2);
        System.out.println("After deleting: ");
        Node.printList(head);
    }
}
