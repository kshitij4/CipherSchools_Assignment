package LinkedList;

import java.util.Scanner;
import java.util.Stack;

public class ReverseKGroupLL {
    static Node head = null;
    static Node reverse(Node head, int k) {
        Stack<Node> elements = new Stack<Node>();
        Node curr = head;
        Node prev = null;
        while (curr != null) {
            int count = 0;
            while (curr != null && count < k) {
                elements.push(curr);
                curr = curr.next;
                count++;
            }
            while (elements.size() > 0) {
                if (prev == null) {
                    prev = elements.peek();
                    head = prev;
                    elements.pop();
                } else {
                    prev.next = elements.peek();
                    prev = prev.next;
                    elements.pop();
                }
            }
        }
        prev.next =null;
        return  head;
    }

    public static void main(String[] args) {
        Node head =new Node(1);
        head.next =new Node(2);
        head.next.next =new Node(3);
        head.next.next.next =new Node(4);
        head.next.next.next.next =new Node(5);
        head.next.next.next.next.next =new Node(6);
        head.next.next.next.next.next.next =new Node(7);
        System.out.println("Original list: ");
        Node.printList(head);

        int k;
        System.out.println("Enter K: ");
        Scanner s =new Scanner(System.in);
        k = s.nextInt();

        Node result = reverse(head,k);
        System.out.println("Reversed list by "+k+" groups");
        Node.printList(result);
    }


}
