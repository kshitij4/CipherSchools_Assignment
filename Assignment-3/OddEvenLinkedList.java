package LinkedList;

public class OddEvenLinkedList {

    public static Node separateOddEven(Node head) {
         if (head == null || head.next == null) {
            return head;
         }
         Node odd = head;
         Node even = head.next;
         Node evenPtr = even;

         while (even!=null && even.next!=null)
         {
             odd.next = even.next;
             odd =odd.next;
             even.next = odd.next;
             even =even.next;
         }
         odd.next = evenPtr;
         return head;
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        System.out.println("Linked List: ");
        Node.printList(head);

        Node result = separateOddEven(head);

        System.out.println("Linked List After Separating Odd and Even: ");
        Node.printList(result);
    }


}
